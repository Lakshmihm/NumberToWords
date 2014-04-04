package com.numbertoword.service;

import com.numbertoword.converter.IConverter;
import com.numbertoword.util.ConverterUtils;

/**
 * Service class to convert number to words
 *
 */
public class NumberToEnglishWordsService implements INumberToWordService
{
	/**
	 * Uses the converter classes to recursively convert number to words
	 *
	 * @return String representation of number
	 */
	public String convertToWord(int number)
	{
		if (number < 0) throw new IllegalArgumentException("Please provide a positive number");
		IConverter converter=ConverterUtils.getConverter(number);
		return  converter.convert(number);
	}
}
