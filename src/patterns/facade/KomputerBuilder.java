package patterns.facade;

import patterns.decorator.Komputer;
import patterns.decorator.PustaObudowa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class KomputerBuilder
{
	private Komputer komputer;

	public KomputerBuilder(Komputer komputer)
	{
		this.komputer = komputer;
	}

	public KomputerBuilder()
	{
		this.komputer = new PustaObudowa();
	}

	public KomputerBuilder addElement(Class<? extends Komputer> clazz)
	{
		try
		{
			final Constructor<? extends Komputer> constructor = clazz.getDeclaredConstructor(Komputer.class);
			komputer = constructor.newInstance(komputer);
		} catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		return this;
	}

	public Komputer build()
	{
		return komputer;
	}
}
