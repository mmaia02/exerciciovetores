package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Aluguel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudantes[] vect = new Estudantes[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int x = 0;
		int room = 0;
		
		for (int i=0; i<n; i++) {
			
			x += 1;
			System.out.println("Rent #" + x);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			vect[room] = new Estudantes(name, email, room);			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
			
		
		sc.close();

	}

}
