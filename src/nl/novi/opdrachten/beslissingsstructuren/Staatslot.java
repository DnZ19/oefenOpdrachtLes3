package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Staatslot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);



        // Maak hieronder een beslissingsstructuur (if/else).
        // Wanneer iemand ouder is dan 17 print het bericht: "U mag een staatslot kopen"
        // Wanneer iemand 17 jaar of jonger is, print het bericht: "Jij mag geen staatslot kopen."

        while   (true){
            System.out.println("What is your age?");
            int age = userInput.nextInt();

            if (age <= 17){
                System.out.println("You can't buy a ticket!");
            } else {
                System.out.println("You can buy tickets!");
            }

        }

    }
}
