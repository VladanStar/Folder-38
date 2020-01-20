package brojdanamesecu;

import java.util.Scanner;

public class BrojDanaMesecu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int brojDana;
        int mesec, godina;
        System.out.println("Unesite redni broj meseca: ");
        mesec = input.nextInt();
        System.out.println("Unesite godinu: ");
        godina = input.nextInt();
        switch (mesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Mesec ima 31 dan");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Mesec ima 30 dana");
                break;
            case 2:
                if (godina % 400 == 0 || (godina % 100 != 0 && godina % 4 == 0)) {
                    System.out.println("Mesec ima 29 dana.");
                } else {
                    System.out.println("Mesec ima 28 dana.");
                }
                break;
            default:
                System.out.println("Ne postoji takav mesec");
                break;

        }

    }

}
