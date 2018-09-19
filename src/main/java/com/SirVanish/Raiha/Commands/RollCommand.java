package com.SirVanish.Raiha.Commands;

import java.util.Arrays;
import java.util.List;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class RollCommand extends Command
{

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) 
	{
		int die = (int) (Math.random() * 5 + 1);
		sendMessage(e, "Rolled a " + die);
	}

	@Override
	public List<String> getAliases() 
	{
		return Arrays.asList("roll", "dice");
	}

	@Override
	public String getName() 
	{
		return "Dice Roll Command";
	}

	@Override
	public String getDescription() 
	{
		return "Rolls a dice";
	}
	
}
