package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class IntelPentium extends KomputerDecorator
{
	public IntelPentium(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int mocObliczeniowa()
	{
		return super.mocObliczeniowa() + 10;
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 20;
	}
}
