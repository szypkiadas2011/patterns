package patterns;

import patterns.builder.Account;
import patterns.builder.AccountBuilder;
import patterns.singleton.App;

import java.util.UUID;

public class Main
{
	public static void main(String[] args)
	{
		// builder
		Account account = new AccountBuilder()
				.setName("imie")
				.setUuid(UUID.randomUUID())
				.setEmail("a@b.c")
				.build();

		System.out.println("account = " + account);

		// singleton
		final App app = App.get();
		app.init();
		app.print();
	}
}
