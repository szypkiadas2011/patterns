package patterns.facade;


import patterns.decorator.Komputer;
import patterns.decorator.PustaObudowa;

import java.util.HashMap;
import java.util.Map;

public class KomputerStorage
{
	private static final Map<String, Komputer> komputerMap = new HashMap<>();

	public static void add(String name, Komputer komputer)
	{
		komputerMap.put(name, komputer);
	}

	public static Komputer get(String name)
	{
		return komputerMap.getOrDefault(name, new PustaObudowa());
	}

	public static void clear()
	{
		komputerMap.clear();
	}
}
