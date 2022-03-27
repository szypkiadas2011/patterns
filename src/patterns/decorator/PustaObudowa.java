package patterns.decorator;

public class PustaObudowa implements Komputer
{
	@Override
	public int mocObliczeniowa()
	{
		return 0;
	}

	@Override
	public int poborPradu()
	{
		return 0;
	}
}
