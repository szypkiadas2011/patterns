package patterns.decorator;

import patterns.decorator.podzespoly.*;
import patterns.facade.KomputerBuilder;
import patterns.facade.KomputerFasada;

public class SklepKomputerowy
{
	public static void main(String[] args)
	{
//		Komputer slabyKomputer = new PustaObudowa();
//		slabyKomputer = new IntelPentium(slabyKomputer);
//		slabyKomputer = new ZintegrowanaKartaGraficzna(slabyKomputer);
//		slabyKomputer = new MaloRamu(slabyKomputer);
//		print("slabyKomputer", slabyKomputer);

		KomputerFasada.zbuduj(
				"slabyKomputer",
				new KomputerBuilder()
						.addElement(IntelPentium.class)
						.addElement(ZintegrowanaKartaGraficzna.class)
						.addElement(MaloRamu.class)
		);
		KomputerFasada.pokaz("slabyKomputer");

//		Komputer dobryKomputer = new PustaObudowa();
//		dobryKomputer = new Ryzen(dobryKomputer);
//		dobryKomputer = new Rtx(dobryKomputer);
//		dobryKomputer = new DuzoRamu(dobryKomputer);
//		print("dobryKomputer", dobryKomputer);

		KomputerFasada.zbudujIPokaz(
				"dobryKomputer",
				new KomputerBuilder()
						.addElement(Ryzen.class)
						.addElement(Rtx.class)
						.addElement(DuzoRamu.class)
		);
	}
}
