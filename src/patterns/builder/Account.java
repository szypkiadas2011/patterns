package patterns.builder;

import java.util.UUID;

public class Account
{
	private String name;
	private UUID uuid;
	private String email;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public UUID getUuid()
	{
		return uuid;
	}

	public void setUuid(UUID uuid)
	{
		this.uuid = uuid;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "Account{" +
				"name='" + name + '\'' +
				", uuid=" + uuid +
				", email='" + email + '\'' +
				'}';
	}
}
