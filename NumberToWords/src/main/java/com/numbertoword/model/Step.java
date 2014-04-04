package com.numbertoword.model;

/**
 * Indicates the weight and name for each position
 */
public enum Step
{
	 TENS(10,"Tens"), HUNDREDS(100," Hundred"), THOUSANDS(1000," Thousand"), MILLIONS(1000000," Million");

	private String name;
	private int weight;

	Step(final int weight, final String name)
	{
		this.setWeight(weight);
		this.setName(name);

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}

