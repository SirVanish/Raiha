package com.SirVanish.Raiha;

public class Settings 
{
	// Bot token
	private String token;
	
	// Bot prefixes
	private String raiha;	// This will act as a name
	private String prefix;
	
	// Default Settings constructor
	public Settings()
	{
		this.setToken("");
		this.setPrefix(".");
		this.setRaiha("raiha");
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
	private void setToken(String token)
	{
		this.token = token;
	}
	// Recieves token from user
	public void sendToken(String token)
	{
		this.setToken(token);
	}
	// Prefix accessor
	public String getPrefix()
	{
		return prefix;
	}
	// Prefix mutator
	private void setPrefix(String prefix)
	{
		this.prefix = prefix;
	}
	// Raiha accessor
	public String getRaiha()
	{
		return raiha;
	}
	// Raiha mutator
	private void setRaiha(String raiha)
	{
		this.raiha = raiha;
	}
}
