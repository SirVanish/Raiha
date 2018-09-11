package com.SirVanish.Raiha.Commands;

import java.util.Arrays;
import java.util.List;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class CoinCommand extends Command
{

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) 
	{
		int coin = (int) (Math.random() * 2 + 1);
		if (coin == 1)
			sendMessage(e, "Got heads!");
		else
			sendMessage(e, "Got tails!");
	}

	@Override
	public List<String> getAliases() 
	{
		return Arrays.asList("flip", "coin");
	}
	
}
