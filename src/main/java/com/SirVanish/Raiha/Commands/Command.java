package com.SirVanish.Raiha.Commands;

import java.util.List;

import com.SirVanish.Raiha.Raiha;

import net.dv8tion.jda.core.MessageBuilder;
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
		if (containsPrefix(e.getMessage()))
			if (containsCommand(e.getMessage()))
				onCommand(e, commandArgs(e.getMessage()));
	}
	
	protected Message sendMessage(MessageReceivedEvent e, Message message)
	{
		return e.getTextChannel().sendMessage(message).complete();
	}
	protected Message sendMessage(MessageReceivedEvent e, String message)
	{
		return sendMessage(e, new MessageBuilder().append(message).build());
	}
	
	
	// Should Raiha respond to other bots?
	protected boolean respondToBots()
	{
		return false;
	}
	// Checks if the message contains the prefix
	protected boolean containsPrefix(Message message)
	{
		return commandArgs(message)[0].equalsIgnoreCase(Raiha.getConfig().getPrefix());
	}
	// Will call the Command's class and function according to the Command
	protected boolean containsCommand(Message message)
	{
		return getAliases().contains(commandArgs(message)[1]);
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
