import java.util.Scanner;

public class Ratenspiel {
    public static void main(String[] args) {

        int geheimeZahl = (int) (Math.random() * 100) + 1;
        System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 ausgedacht!");

        Scanner eingabe = new Scanner(System.in);
        int tipp = 0;
        int versuche = 0;

        while (tipp != geheimeZahl) {
            System.out.print("Dein Tipp: ");
            tipp = eingabe.nextInt();
            versuche++;
            if (tipp < geheimeZahl) {
                System.out.println("Zu niedrig! 😂");
            } else if (tipp > geheimeZahl) {
                System.out.println("Zu Hoch! 😂");
            } else {
                System.out.print("Richtig! Du hast: " + versuche + " versuche gebraucht 💩💩💩");
            }

        }

        eingabe.close();

    }
}