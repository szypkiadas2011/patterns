package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class Rtx extends KomputerDecorator
{
	public Rtx(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int mocObliczeniowa()
	{
		return super.mocObliczeniowa() + 150;
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 100;
	}
}
