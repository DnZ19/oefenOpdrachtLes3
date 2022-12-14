package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Leeftijdscontrole {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);



        /*
        In Nederland mag je alcoholische dranken kopen vanaf je 18e. Je moet echter tot je 25ste een ID kunnen tonen.
        Hierboven heeft de gebruiker al zijn leeftijd ingevoerd. Het is aan jou om de volgende berichten af te drukken:
        Wanneer de gebruiker onder 18 is: Jij mag geen alcohol kopen.
        Wanneer de gebruiker 25 jaar of ouder is: Jij mag zonder restricties alcohol kopen.
        Wanneer de gebruiker tussen 18 en 25 is: Jij mag alcohol kopen, maar jij moet je ID tonen.

        Maak de beslissingsstructuur (if/else if/else) hieronder.
         */

        while(true){

            System.out.println("What is your age?");
            int givenAge = userInputScanner.nextInt();

            if (givenAge < 18){
                System.out.println("You can't buy alcohol!");
            } else if (givenAge > 25) {
                System.out.println("You can buy alcoholic drinks without restrictions!");
            } else if (givenAge >= 18 && givenAge < 25) {
                System.out.println("You can buy alcoholic drinks, but you need to show some ID!");
            }

        }

    }
}
