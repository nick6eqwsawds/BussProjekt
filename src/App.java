import java.util.Scanner;

public class App {
    static final Scanner tangentbord = new Scanner(System.in);
    static double vuxen_plats = 299.90;
    static double barn_plats = 149.90;
    static double vinst = 0;
    public static void main(String[] args) throws Exception {
        platser();
        //meny();

    }

    static void platser() {
        int[] pasagerare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0; i < pasagerare.length; i++) {
            System.out.println("|"+pasagerare[i]+" |");
            

        }

        System.out.println("|"+pasagerare[0]+" |"+"|"+pasagerare[1]+" | "+" |"+pasagerare[2]+" |"+"|"+pasagerare[3]+" |");
        System.out.println("|"+pasagerare[4]+" |"+"|"+pasagerare[5]+" | "+" |"+pasagerare[6]+" |"+"|"+pasagerare[7]+" |");
        System.out.println("|"+pasagerare[8]+" |"+"|"+pasagerare[9]+"| "+" |"+pasagerare[10]+"|"+"|"+pasagerare[11]+"|");
        System.out.println("|"+pasagerare[12]+"|"+"|"+pasagerare[13]+"| "+" |"+pasagerare[14]+"|"+"|"+pasagerare[15]+"|");
        System.out.println("|"+pasagerare[16]+"|"+"|"+pasagerare[17]+"| "+" |"+pasagerare[18]+"|"+"|"+pasagerare[19]+"|");

    }

    public static void meny() throws Exception {
        System.out.println("Välkommen till Buss Boknings sidan!");
        Thread.sleep(500);
        System.out.println("Här är dina olika val:");
        Thread.sleep(500);
        System.out.println("1. Boka Plats");
        Thread.sleep(250);
        System.out.println("2. Visa Lediga Platser");
        Thread.sleep(250);
        System.out.println("3. Beräkna vinst");
        Thread.sleep(250);
        int menyval = tangentbord.nextInt();

        switch (menyval) {
            case 1:
            Bokning();
            break;
            case 2:
            platser();
            break;
            case 3:
            //
            break;
            default : 
            break;
        }

    }

    public static void Bokning() throws Exception {
        Thread.sleep(500);
        System.out.println("Vänligen skriv in personnummer nedan");
        Thread.sleep(500);
        int persnr = tangentbord.nextInt();
        if (persnr < 10000000) {
            Thread.sleep(500);
            System.out.println("Personnummret måste inehålla 8 siffror");
            Bokning();
        } else {
        System.out.println("Är "+persnr+" rätt personnummer?");
        String sakerhet = tangentbord.nextLine();
        if (sakerhet.equalsIgnoreCase  ("no")) {
            Thread.sleep(500);
            System.out.println("Ok, försök igen");
            Bokning();
        } else {
            int person_alder = 20240408-persnr;
            System.out.println(person_alder);
            if (person_alder >= 180000) {
                Thread.sleep(500);
                System.out.println("Du är över 18");
                Thread.sleep(500);
                System.out.println("Priset för plats är "+vuxen_plats+"kr");
            } else if (person_alder < 180000){
                Thread.sleep(500);
                System.out.println("Du är under 18");
                Thread.sleep(500);
                System.out.println("Priset för plats är "+barn_plats+"kr");
            }
            Thread.sleep(750);
            System.out.println("Dessa plattser är lediga:");
            Thread.sleep(750);
            platser();
            Thread.sleep(500);
            System.out.println("Vilken platts vill du boka?");
            int plats_bokning = tangentbord.nextInt();
            System.out.println("Du valde plats "+plats_bokning);
        }

        }
    }
}
