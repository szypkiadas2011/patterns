package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class DuzoRamu extends KomputerDecorator
{
	public DuzoRamu(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 10;
	}
}
