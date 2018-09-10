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

import java.util.Scanner;

import javax.security.auth.login.LoginException;

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
	// Error exit codes
	public static final int NO_LOGIN = 100;
	public static final int BAD_LOGIN = 101;
	public static final int CANNOT_CONNECT = 102;
	public static final int UNKNOWN_ERROR = 111;
	
	// JDA
	private static JDA api;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		runBot();
	}
	
	public static JDA getAPI()
	{
		return api;
	}
	
	private static void runBot()
	{
		try
		{
			Settings config = new Settings();
			
			// Will ask user to input their token and close scanner afterwards
			System.out.print("Please insert your bot token: ");
			String token = scanner.next();
			config.setToken(token);
			scanner.close();
			
			JDABuilder builder = new JDABuilder(AccountType.BOT).setToken(config.getToken());
//			builder.addEventListener();
			
			api = builder.build();
			
			System.out.println("Bot has successfully finished setup process!");
		}
		
		catch (IllegalArgumentException e)
		{
			System.out.println("Login details are not provided.\n" + e);
			System.exit(NO_LOGIN);
		}
		catch (LoginException e)
		{
			System.out.println("Login details are incorrect.\n" + e);
			System.exit(BAD_LOGIN);
		}
		catch (Exception e)
		{
			System.out.println("Unable to set up bot!\n" + e);
			System.exit(UNKNOWN_ERROR);
		}
	}
}
