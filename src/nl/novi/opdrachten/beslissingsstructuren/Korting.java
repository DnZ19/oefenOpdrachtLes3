package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);



        /*
        Hierboven is het aankoopbedrag ingevoerd. Het is de bedoeling dat jij de korting bepaalt en het nieuwe bedrag
        uitrekent.

        Wanneer het ingevoerde bedrag onder de 75 is, krijgt de klant geen korting. Print uit:
        "De klant krijgt geen korting. Het aankoopbedrag blijft -HIER HET BEDRAG-"

        Wanneer het ingevoerde bedrag 75,00 of hoger is, maar kleiner of gelijk aan 300.00 dan krijgt de klant 10%
        korting. Print uit:
        "De klant krijgt 10% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"

        Wanneer het ingevoerde bedrag 300.01 of hoger is, krijgt de klant 16% korting. Print uit:
        "De klant krijgt 16% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"
         */

        while(true) {

            System.out.println("What is the purchase amount?");
            double purchaseAmount = userInputScanner.nextDouble();

            if (purchaseAmount < 75 ){
                System.out.println("The customer gets no discount. The purchase amount remains: " + purchaseAmount);
            } else if (purchaseAmount < 75 || purchaseAmount <= 300) {
                double newAmount = purchaseAmount * 0.9;
                System.out.println("The customer gets a discount of 10%. The new purchase amount is: " + newAmount);
            } else if (purchaseAmount > 300) {
                double newAmount = purchaseAmount * 0.84;
                System.out.println("The customer gets a discount of 16%. The new purchase amount is: "  + newAmount);
            }

        }


    }
}
