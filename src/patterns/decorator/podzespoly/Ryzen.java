package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class Ryzen extends KomputerDecorator
{
	public Ryzen(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int mocObliczeniowa()
	{
		return super.mocObliczeniowa() + 100;
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 50;
	}
}
