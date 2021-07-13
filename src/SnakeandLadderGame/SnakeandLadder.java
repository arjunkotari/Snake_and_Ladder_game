package SnakeandLadderGame;

import java.util.Scanner;

public class SnakeandLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game play");
		int player1 = 0,player2 = 0;
		int snake,lader;
		int count=0;
		Scanner sc = new Scanner(System.in);
			while (player1 != 100 || player2 != 100) 
			{
				
				count++;
				if(count%2==1)
				{
					System.out.println("Press Enter to die roll of player1");
					sc.nextLine();
					int rollDie1 = (int) (1 + Math.floor(Math.random() * 10) % 6);
					System.out.println("Role die p1: " + rollDie1);
					player1 += rollDie1;
					lader = (int) (1 + Math.floor(Math.random() * 10) % 6);
					snake = (int) (1 + Math.floor(Math.random() * 10) % 6);

					//Lader
					if(rollDie1 == lader)
					{
						player1 += rollDie1;
						System.out.println("Congrats p1, you got ladder...");					
					}
					
					//snake				
					else if (rollDie1 == snake)
					{
						player1 -= rollDie1;
						player1 -= rollDie1;
						System.out.println("p1 Your attacked by snake...");
					}
					if(player1 == 100) {
						System.out.println("p1 Box position: " + player1);
						break;
					}
					if (player1 <= 100) {							
						player1 += rollDie1;
						player1 -= rollDie1;
					}
					else {				
						player1 -= rollDie1;						
					}
					System.out.println("p1 Box position: " + player1);					
				}
				else
				{
					System.out.println("Press Enter to die roll of player2 ");
					sc.nextLine();
					int rollDie2 = (int) (1 + Math.floor(Math.random() * 10) % 6);
					System.out.println("Role die p2 " + rollDie2);
					player2 += rollDie2;
					lader = (int) (1 + Math.floor(Math.random() * 10) % 6);
					snake = (int) (1 + Math.floor(Math.random() * 10) % 6);

					//Lader
					if(rollDie2 == lader)
					{
						player2 += rollDie2;
						System.out.println("Congrats p2, you got ladder...");					
					}
					
					//snake				
					else if (rollDie2 == snake)
					{
						player2 -= rollDie2;
						player2 -= rollDie2;
						System.out.println("p2 Your attacked by snake...");
					}
					if(player2 == 100) {
						System.out.println("p2 Box position: " + player2);
						break;
					}
					else if (player2 <= 100) 								
						System.out.println("p2 Box position: " + player2);				
					else {
						player2 -= rollDie2;
						System.out.println("p1 Box position: " + player1);
					}
				}
			}
		//}
		System.out.println();
		if(player1 == 100) {
			System.out.println("P1 own the game....");
		}
		else {
			System.out.println("P2 own the game....");
		}
		System.out.println("Total dies Count: "+count);
		sc.close();
	}

}
