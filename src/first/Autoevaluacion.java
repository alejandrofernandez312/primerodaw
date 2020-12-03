package first;

import java.util.Scanner;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = newDeck(40);
		int op;
		do {
			op = menu();
			switch (op) {
			case 1:
				printDeck(deck);
				break;
			case 2:
				break;
			case 3:
				play(deck);
				break;
			}

		} while (op != 3);
	}

	public static void play(int[] deck) {

		System.out.println("Player 1’s turn:");
		double player1 = myTurn(deck);// método que devuelve el total de puntos conseguidos
		System.out.println("Player 2's turn:");
		double player2 = myTurn(deck);
		report(player1, player2);
	}

	public static void report(double player1, double player2) {
		System.out.println("La puntuación del Player1= " + player1);
		System.out.println("La puntuación del Player2= " + player2);
		if (player1 == player2) {
			System.out.println("¡Empate!");
			return;
		}
		if (player1 == 7.5) {
			System.out.println("Ha ganado Player1");

		} else if (player2 == 7.5) {
			System.out.println("Ha ganado Player2");

		}
		if (player1 > 7.5 && player2 > 7.5) {
			System.out.println("Los dos jugadores se han pasado pero ha ganado...");
			if (player1 - 7.5 < player2 - 7.5) {
				System.out.println("¡Player1!");

			} else
				System.out.println("¡Player2!");

		} else if (7.5 - player1 < 7.5 - player2) {
			System.out.println("Ha ganado Player1");

		} else {
			System.out.println("Ha ganado Player2");

		}
	}

	public static double myTurn(int[] deck) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to pick a card? y/n");
		char yn = input.next().toLowerCase().charAt(0);
		String report = "";
		double aux = 0;
		double total = 0;
		while (yn == 'y') {
			double num = 0;
			int random = (int) (Math.random() * 40);
			System.out.println("Tu carta es " + getCardValue(deck[random]));
			switch (getCardValue(deck[random])) {
			case "As":
				num = 1;
				break;
			case "Sota":
				num = 0.5;
				break;
			case "Caballo":
				num = 0.5;
				break;
			case "Rey":
				num = 0.5;
				break;
			case "2":
				num = 2;
				break;
			case "3":
				num = 3;
				break;
			case "4":
				num = 4;
				break;
			case "5":
				num = 5;
				break;
			case "6":
				num = 6;
				break;
			case "7":
				num = 7;
				break;
			}
			total = num + aux;
			aux = total;
			System.out.println("La suma total es " + total);
			System.out.println("¿Quieres coger otra carta? y/n");
			yn = input.next().toLowerCase().charAt(0);
		}
		if (yn == 'n') {
			System.out.println("La suma total es " + total);
		}
		return total;
	}

	public static void printDeck(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(getCardValue(deck[i]) + "  de  " + getSuit(deck[i]));

		}
	}

	public static String getCardValue(int c) {
		String[] cards = { "Rey", "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo" };

		return cards[c % 10];
	}

	public static String getSuit(int n) {
		String[] suits = { "Basto", "Espada", " Oro", "Copa" };
		if (n % 10 == 0)
			return suits[n / 10 - 1];
		return suits[n / 10];
	}

	public static int[] newDeck(int n) {
		int[] deck = new int[n];
		for (int i = 0; i < n; i++)
			deck[i] = i + 1;
		return deck;

	}

	public static int menu() {
		int op = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("\t1.- Print deck");
		System.out.println("\t2.- Shuffling");
		System.out.println("\t3.- Play 7 and a half");
		System.out.println("\t4.- Exit");
		System.out.print("\t\tOption:");
		op = input.nextInt();
		return op;

	}
}
