package com.SirVanish.Raiha.Commands;

import java.util.Arrays;
import java.util.List;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class HelpCommand extends Command
{

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) 
	{
		
	}

	@Override
	public List<String> getAliases() 
	{
		return Arrays.asList("help");
	}
	
}
