package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {

        int chosenNumber = 44;
        dev5(chosenNumber);

    }

    public static String dev5(int chosenNumber) {
        String result = null;
        if (chosenNumber % 5 == 0) {
            System.out.println("deelbaar door 5");
        } else {
            System.out.println("niet deelbaar door 5");
        }
        return result;
    }




}
