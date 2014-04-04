package com.numbertoword.util;

import com.numbertoword.converter.*;

/**
 * Created by Lakshmi on 03/04/14.
 * This is a Utility class for Converters
 */
public class ConverterUtils
{
	private static final IConverter UNITS_CONVERTER     = new UnitsConverter();
	private static final IConverter TENS_CONVERTER      = new TensConverter();
	private static final IConverter HUNDREDS_CONVERTER  = new HundredsConverter();
	private static final IConverter THOUSANDS_CONVERTER = new ThousandsConverter();
	private static final IConverter MILLIONS_CONVERTER  = new MillionsConverter();

	/**
	 * This method returns the converter based on the number
	 *
	 * @return @link{IConverter}
	 */
	public static IConverter getConverter(int number)
	{
		if (number < 20) return UNITS_CONVERTER;
		else if (number < 100) return TENS_CONVERTER;
		else if (number < 1000) return HUNDREDS_CONVERTER;
		else if (number < 1000000) return THOUSANDS_CONVERTER;
		else if (number < 1000000000) return MILLIONS_CONVERTER;
		throw new IllegalArgumentException("maximum number supported is 999999999");
	}

	public static String convertRemainder(int number, int weight) {

		int remainder=number%weight;
		return getConverter(remainder).convert(remainder);
	}

	public static String convertQuotient(int number, int weight) {

		int quotient=number/weight;
		IConverter converter=getConverter(quotient);
		return converter.convert(quotient);
	}


}
