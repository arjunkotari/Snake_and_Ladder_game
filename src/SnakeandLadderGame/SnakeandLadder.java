package SnakeandLadderGame;


import java.util.Scanner;

public class SnakeandLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game play");
		int player1 = 0;
		int rollDie = (int) (1 + Math.floor(Math.random() * 10) % 6);
		System.out.println("Role die " + rollDie);
	}
}
