import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner litera = new Scanner(System.in);
        String[] dictionar = {"JAVA", "EXAMEN", "STUDENT", "VACANTA", "PROGRAMARE", "RESTANTA", "LICEU"};

        int indexAleatoriu = (int) (Math.random() * dictionar.length);

        String cuvant = dictionar[indexAleatoriu];
        char[] litereleCuvantului = cuvant.toCharArray(); // ca un fel de strtok

        char[] progres = new char[litereleCuvantului.length];
        for (int i = 0; i < progres.length; i++)
            progres[i] = '_';

        int vieti = 6;
        boolean Castigat = false;

        System.out.println("--- BINE AI VENIT LA SPANZURATOAREA ---");

        while (vieti > 0 && Castigat == false) {
            System.out.println("\nCuvant: ");
            for (int i = 0; i < progres.length; i++) {
                System.out.print(progres[i] + " ");
            }
            System.out.println("\nVieti ramase: " + vieti);

            System.out.println("Introdu litera(doar cu litere mari) :");
            char litera_ghicita = litera.next().charAt(0);//ca sa citesc o singura litera

            boolean Corect = false;

            for (int i = 0; i < litereleCuvantului.length; i++) {
                if (litera_ghicita == litereleCuvantului[i]) {
                    progres[i] = litera_ghicita;
                    Corect = true;
                }
            }
                if (Corect == true) {
                    System.out.println("Bravo!Ai ghicit corect");
                } else {
                System.out.println("Ups!Gresit mai incearca");
                vieti = vieti - 1;
                System.out.println("Vieti ramane : " + vieti);
            }
            Castigat = true;
            for (int i = 0; i < progres.length; i++)
                if (progres[i] == '_') {
                    Castigat = false;
                    break;
                }
        }
        if (Castigat == true) {
            System.out.println("Felicitari! Ai castigat");
        } else {
            System.out.println("Ups! Ai pierdut hai din nou.");
        }
    }
}