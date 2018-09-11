package com.SirVanish.Raiha.Commands;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class CommandTree extends Command
{
	private TreeMap<String, Command> commands;
	
	public CommandTree()
	{
		commands = new TreeMap<>();
	}
	
	public Command addCommand(Command command)
	{
		commands.put(command.getAliases().get(0), command);
		return command;
	}

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) 
	{
		
	}

	@Override
	public List<String> getAliases() 
	{
		return Arrays.asList();
	}
}
