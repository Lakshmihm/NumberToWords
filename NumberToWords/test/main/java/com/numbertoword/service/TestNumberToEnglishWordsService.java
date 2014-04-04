package com.numbertoword.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lakshmi on 02/04/14.
 * Test class to test the NumberWordService
 */
public class TestNumberToEnglishWordsService
{

	private final INumberToWordService numberToEnglishWordsService = new NumberToEnglishWordsService();

	@Test
	public void testForZero()
	{

		assertEquals("Zero", numberToEnglishWordsService.convertToWord(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testForNegativeNumber()
	{
		numberToEnglishWordsService.convertToWord(-100);
	}

	@Test
	public void testForSingleDigits()
	{
		assertEquals("One", numberToEnglishWordsService.convertToWord(1));
		assertEquals("Six", numberToEnglishWordsService.convertToWord(6));
	}

	@Test
	public void testForTensDigits()
	{
		assertEquals("Nineteen", numberToEnglishWordsService.convertToWord(19));
		assertEquals("Twelve", numberToEnglishWordsService.convertToWord(12));
		assertEquals("Eleven", numberToEnglishWordsService.convertToWord(11));
		assertEquals("Ninety Nine", numberToEnglishWordsService.convertToWord(99));
		assertEquals("Twenty One", numberToEnglishWordsService.convertToWord(21));

	}

	@Test
	public void testForTwenty()
	{
		//EDGE CASE
		assertEquals("Twenty", numberToEnglishWordsService.convertToWord(20));
	}


	@Test
	public void testForHundreds()
	{
		assertEquals("One Hundred", numberToEnglishWordsService.convertToWord(100));
		assertEquals("One Hundred and Five", numberToEnglishWordsService.convertToWord(105));
		assertEquals("Two Hundred", numberToEnglishWordsService.convertToWord(200));
		assertEquals("Nine Hundred", numberToEnglishWordsService.convertToWord(900));
		assertEquals("Nine Hundred and Ninety Nine", numberToEnglishWordsService.convertToWord(999));
	}

	@Test
	public void testForThousands(){
		assertEquals("One Thousand", numberToEnglishWordsService.convertToWord(1000));
		assertEquals("One Thousand and One", numberToEnglishWordsService.convertToWord(1001));
		assertEquals("Three Thousand", numberToEnglishWordsService.convertToWord(3000));
		assertEquals("Nine Thousand and Nine Hundred and Ninety Nine", numberToEnglishWordsService.convertToWord(9999));

	}
	@Test
	public void testForTenThousands()
	{

		assertEquals("Ten Thousand", numberToEnglishWordsService.convertToWord(10000));
		assertEquals("Ninety Nine Thousand and Nine Hundred and Ninety Nine", numberToEnglishWordsService.convertToWord(99999));
	}

	@Test
	public void testForHundredThousands()
	{

		assertEquals("One Hundred Thousand", numberToEnglishWordsService.convertToWord(100000));
		assertEquals("Two Hundred Thousand and Twenty Two", numberToEnglishWordsService.convertToWord(200022));
		assertEquals("Nine Hundred and Ninety Nine Thousand and Nine Hundred and Ninety Nine", numberToEnglishWordsService.convertToWord(999999));
	}

	@Test
	public void testForMillion()
	{

		assertEquals("One Million", numberToEnglishWordsService.convertToWord(1000000));
		assertEquals("Three Million and Four Thousand and Forty Three", numberToEnglishWordsService.convertToWord(3004043));
		assertEquals("Nine Million and Nine Hundred and Ninety Nine Thousand and Nine Hundred and Ninety Nine", numberToEnglishWordsService
			.convertToWord(9999999));
	}

	@Test
	public void testForTenMillion()
	{
		assertEquals("Ten Million", numberToEnglishWordsService.convertToWord(10000000));
		assertEquals("Thirty Three Million and Two Hundred and Ninety Eight Thousand and Six Hundred and Seventeen",
			numberToEnglishWordsService.convertToWord(33298617));
		assertEquals("Ninety Nine Million and Nine Hundred and Ninety Nine Thousand and Nine Hundred and Ninety Nine",
			numberToEnglishWordsService.convertToWord(99999999));

	}

	@Test
	public void testForHundredMillion()
	{

		assertEquals("One Hundred Million", numberToEnglishWordsService.convertToWord(100000000));
		assertEquals("Seven Hundred and Sixty Six Million and One Hundred and Twenty Seven Thousand and Eight Hundred and Forty Four",
			numberToEnglishWordsService.convertToWord(766127844));
		assertEquals("Fifty Six Million and Nine Hundred and Forty Five Thousand and Seven Hundred and Eighty One",numberToEnglishWordsService.convertToWord(56945781));
	}

	@Test
	public void testForMax()
	{

		assertEquals("Nine Hundred and Ninety Nine Million and Nine Hundred and Ninety Nine Thousand and Nine Hundred and Ninety Nine",
			numberToEnglishWordsService.convertToWord(999999999));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testForBillionUnSupported()
	{

	  numberToEnglishWordsService.convertToWord(1000000000);
	}





}
