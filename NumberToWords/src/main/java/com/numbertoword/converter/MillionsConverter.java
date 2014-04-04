package com.numbertoword.converter;

import com.numbertoword.model.Step;
import com.numbertoword.util.ConverterUtils;

/**
 * This class recursively converts million number
 */
public class MillionsConverter implements IConverter
{
	private static final Step STEP=Step.MILLIONS;

	@Override public String convert(int number)
	{
		StringBuilder stringBuilder = new StringBuilder();


		stringBuilder.append(ConverterUtils.convertQuotient(number, STEP.getWeight()));

		stringBuilder.append(STEP.getName());

		if (number % STEP.getWeight() > 0)
		{
			stringBuilder.append(" and ").append(ConverterUtils.convertRemainder(number, STEP.getWeight()));
		}
		return stringBuilder.toString();
	}
}
