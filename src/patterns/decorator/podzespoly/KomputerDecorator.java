package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class KomputerDecorator implements Komputer
{
	private Komputer komputer;

	public KomputerDecorator(Komputer komputer)
	{
		this.komputer = komputer;
	}

	@Override
	public int mocObliczeniowa()
	{
		return komputer.mocObliczeniowa();
	}

	@Override
	public int poborPradu()
	{
		return komputer.poborPradu();
	}
}
