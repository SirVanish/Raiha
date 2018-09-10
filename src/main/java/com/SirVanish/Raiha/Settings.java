package com.SirVanish.Raiha;

public class Settings 
{
	// Bot token
	private String token;
	
	// Bot prefix
	private String prefix = "Raiha,";
	
	// Default Settings constructor
	public Settings()
	{
		this.setToken("");
		this.setPrefix("");
	}
	// Specifying Settings constructor
	public Settings(String token, String prefix)
	{
		this.setToken(token);
		this.setPrefix(prefix);
	}
	
	// Token accessor
	public String getToken()
	{
		return token;
	}
	// Token mutator
	public void setToken(String token)
	{
		this.token = token;
	}
	
	// Prefix accessor
	public String getPrefix()
	{
		return prefix;
	}
	// Prefix mutator
	public void setPrefix(String prefix)
	{
		this.prefix = prefix;
	}
}
