package com.SirVanish.Raiha.Commands;

import java.util.List;

import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public abstract class Command extends ListenerAdapter
{
	public abstract void onCommand(MessageReceivedEvent e, String [] args);		// Function of the command
	public abstract List<String> getAliases();									// Command lists
	
	// Checks if message received is in Command list
	@Override
	public void onMessageReceived(MessageReceivedEvent e)
	{
		if (e.getAuthor().isBot() && !respondToBots())
			return;
		if (containsCommand(e.getMessage()))
			onCommand(e, commandArgs(e.getMessage()));
	}
	
	// Should Raiha respond to other bots?
	protected boolean respondToBots()
	{
		return false;
	}
	// Will call the Command's class and function according to the Command
	protected boolean containsCommand(Message message)
	{
		return getAliases().contains(commandArgs(message)[0]);
	}
	
	// Both the following methods will grab the commands
	protected String[] commandArgs(Message message)
	{
		return commandArgs(message.getContentDisplay());
	}
	protected String[] commandArgs(String string)
	{
		return string.split(" ");
	}
}
