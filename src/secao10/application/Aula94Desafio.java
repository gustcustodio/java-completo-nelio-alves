package secao10.application;

import secao10.entities.Rent;

import java.util.Scanner;

public class Aula94Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            int room;
            String name, email;

            System.out.printf("Rent #%d: ", i);
            System.out.print("\nName: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            sc.nextLine();

            rooms[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
