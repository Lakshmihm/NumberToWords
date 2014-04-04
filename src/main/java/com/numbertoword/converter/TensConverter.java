package com.numbertoword.converter;

import com.numbertoword.model.Step;
import com.numbertoword.util.ConverterUtils;

/**
 *  This class recursively converts Tens number
 */
public class TensConverter implements IConverter
{
	//Starts from Index 2 (20/10).
	//Hence filling 0 and 1 with ""
	private final String[] TENS_WORDS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	private static final Step STEP = Step.TENS;

	@Override public String convert(int number)
	{
		StringBuilder word = new StringBuilder(TENS_WORDS[number/STEP.getWeight()]);
		if (number % STEP.getWeight() > 0)
		{
			word.append(" ").append(ConverterUtils.convertRemainder(number,STEP.getWeight()));
		}
		return word.toString();

	}
}
