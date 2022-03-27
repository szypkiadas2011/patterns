package patterns.facade;

public class KomputerFasada
{
	public static void zbuduj(String name, KomputerBuilder komputer)
	{
		KomputerStorage.add(name, komputer.build());
	}

	public static void pokaz(String name)
	{
		KomputerPrinter.print(name, KomputerStorage.get(name));
	}

	public static void zbudujIPokaz(String name, KomputerBuilder komputer)
	{
		zbuduj(name, komputer);
		pokaz(name);
	}

	public static void wyczyscMagazyn()
	{
		KomputerStorage.clear();
	}
}
