package thema3.anweisungen;

import java.util.Scanner;

public class geradeOderUngeradeZahl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein: ");
		
		int choice = scanner.nextInt();
		int ergebnis = choice%2;
		if(ergebnis==0) {
			System.out.println("Die Zahl " +choice+ " ist gerade");
		} else { System.out.println("Die Zahl " +choice+ " ist ungerade");
		}
		
		scanner.close();
	}

}
