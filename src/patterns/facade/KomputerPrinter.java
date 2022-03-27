package patterns.facade;

import patterns.decorator.Komputer;

public class KomputerPrinter
{
	static void print(String name, Komputer komputer)
	{
		System.out.printf("%s:\nmoc obliczeniowa: %d\npobór prądu: %d%n", name, komputer.mocObliczeniowa(), komputer.poborPradu());
	}
}
