package patterns.builder;

import java.util.UUID;

public class AccountBuilder
{
	private Account account = new Account();

	public AccountBuilder setName(String name)
	{
		account.setName(name);
		return this;
	}

	public AccountBuilder setUuid(UUID uuid)
	{
		account.setUuid(uuid);
		return this;
	}

	public AccountBuilder setEmail(String email)
	{
		account.setEmail(email);
		return this;
	}

	public Account build()
	{
		return account;
	}
}
