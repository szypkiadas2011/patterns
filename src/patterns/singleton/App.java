package patterns.singleton;

public class App
{
	private static App inst;

	private App() {}

	public void init()
	{
		System.out.println("App initialized");
	}

	public void print()
	{
		final Runtime runtime = Runtime.getRuntime();
		System.out.printf("Mem: %d/%d\n", runtime.totalMemory() - runtime.freeMemory(), runtime.totalMemory());
	}

	public static App get()
	{
		if (inst == null)
			inst = new App();
		return inst;
	}
}
