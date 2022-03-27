package patterns.decorator.podzespoly;

import patterns.decorator.Komputer;

public class MaloRamu extends KomputerDecorator
{
	public MaloRamu(Komputer komputer)
	{
		super(komputer);
	}

	@Override
	public int poborPradu()
	{
		return super.poborPradu() + 5;
	}
}
