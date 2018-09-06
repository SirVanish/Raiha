/**
 *     Copyright 2015-2016 Yangbee Thao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.SirVanish.Raiha;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Raiha extends ListenerAdapter
{
	private static JDA api;
	
	public static void main(String[] args) throws Exception
	{
		setupBot();
	}
	
	public static JDA getAPI()
	{
		return api;
	}
	
	private static void setupBot()
	{
		try
		{
			api = new JDABuilder(AccountType.BOT).setToken(Settings.token).build();
			System.out.println("Bot has successfully finished settingup!");
		}
		catch (Exception e)
		{
			System.out.println("Unable to set up bot! Exception: " + e);
			System.exit(1);
		}
	}
	
	public void onMessageRecieved(MessageReceivedEvent evt)
	{
		// Objects
		User objUser = evt.getAuthor();
		MessageChannel objMsgCh = evt.getChannel();
		Message objMsg = evt.getMessage();
	}
}
