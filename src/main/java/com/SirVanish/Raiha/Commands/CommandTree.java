package com.SirVanish.Raiha.Commands;

import java.util.List;
import java.util.TreeMap;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/*	
 * This Class stores all of the other command classes 
 * in a TreeMap for easier access when the commands
 * are being called
 */
public class CommandTree extends Command
{
	private TreeMap<String, Command> commands;
	public HelpCommand help = new HelpCommand();
	
	public CommandTree()
	{
		commands = new TreeMap<>();
	}
	
	public TreeMap<String, Command> getCommands()
	{
		return commands;
	}
	
	// Adds a command into the map
	public Command addCommand(Command command)
	{
		commands.put(command.getAliases().get(0), command);
		return command;
	}

	// Accesses the onCommand method in HelpCommand class
	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) 
	{
		help.onCommand(e, args);
	}

	// Grabs the commands required for help from HelpCommand class
	@Override
	public List<String> getAliases() 
	{
		return help.getAliases();
	}

	@Override
	public String getName() 
	{
		return null;
	}

	@Override
	public String getDescription() 
	{
		return null;
	}
}
