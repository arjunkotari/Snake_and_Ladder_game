package SnakeandLadderGame;

import java.util.Scanner;

public class SnakeandLadder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Snake and Ladder game play");
		int player1 = 0;
		int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
		System.out.println("Role die " + rollDie);
		int snake,lader;
		Scanner sc = new Scanner(System.in);
		if (rollDie == 6) 
		{
			System.out.println("Your game start now...");
			player1 += rollDie;
			System.out.println("Box position: " + player1);
			
			while (player1 <= 100) 
			{
				System.out.println("Press Enter to die roll ");
				sc.nextLine();
				rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
				System.out.println("Role die " + rollDie);
				player1 += rollDie;
				lader = (int) (1 + Math.floor(Math.random() * 10) % 6);
				snake = (int) (1 + Math.floor(Math.random() * 10) % 6);

				//Lader
				if(rollDie == lader)
				{
					player1 += rollDie;
					System.out.println("Congrats, you got ladder...");					
				}
				
				//snake				
				else if (rollDie == snake)
				{
					player1 -= rollDie;
					player1 -= rollDie;
					System.out.println("Your attacked by snake...");
				}
			System.out.println("Box position: " + player1);				
				
			}
			sc.close();
		}
	}

}


