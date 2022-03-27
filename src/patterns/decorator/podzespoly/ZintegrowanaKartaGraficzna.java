package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class ZintegrowanaKartaGraficzna extends KomputerDecorator
{
	public ZintegrowanaKartaGraficzna(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int mocObliczeniowa()
	{
		return super.mocObliczeniowa() + 5;
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 15;
	}
}
