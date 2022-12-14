package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Geslacht {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);



        /*
        Hier boven heeft de gebruiker zijn geslacht ingevoerd. Print met behulp van een beslissingsstructuur (if/else)
        de volgende berichten:
        Wanneer de gebruiker een 'man' is: "Dag meneer."
        Wanneer de gebruiker een 'vrouw' is": "Dag mevrouw."
        In alle andere gevallen: "Dag persoon."

        Bonus: Lukt het je om de code zo te maken dat hoofdletters genegeerd worden?
         */

        while(true){

            System.out.print("What is your sex? ");
            String sex = userInputScanner.nextLine();

            if (sex.equalsIgnoreCase("male")) {
                System.out.println("Hi Sir!");

            } else if (sex.equalsIgnoreCase("female")) {
                System.out.println("Hi Mam!");

            } else {
                System.out.println("Hi person!");

            }
        }



    }

}
