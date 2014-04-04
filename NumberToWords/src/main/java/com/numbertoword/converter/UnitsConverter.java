package com.numbertoword.converter;

/**
 * Converts number to a single string
 */
public class UnitsConverter implements IConverter
{
	private static final String[] SINGLE_WORDS = {
		"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
		"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	@Override public String convert(int number)
	{
		if (number < 0 || number > 19) throw new IllegalArgumentException("Please provide a number between 0 and 19");
		return SINGLE_WORDS[number];
	}
}
