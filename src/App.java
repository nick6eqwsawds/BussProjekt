import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static final Scanner tangentbord = new Scanner(System.in);
    static double vuxen_plats = 299.90;
    static double barn_plats = 149.90;
    static double vinst = 0;
    static int[] pasagerare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    public static void main(String[] args) throws Exception {
        //platser();
        meny();

    }

    static void platser() {

        //pasagerare[0]= 0;

        /* 
        for (int i = 0; i < pasagerare.length; i++) {
            System.out.println("|"+pasagerare[i]+" |");
            

        }*/

        System.out.println("|1 |"+"|2 | "+" |3 |"+"|4 |");
        System.out.println("|5 |"+"|6 | "+" |7 |"+"|8 |");
        System.out.println("|9 |"+"|10| "+" |11|"+"|12|");
        System.out.println("|13|"+"|14| "+" |15|"+"|16|");
        System.out.println("|17|"+"|18| "+" |19|"+"|20|");

        /* 
        System.out.println("|"+pasagerare[0]+" |"+"|"+pasagerare[1]+" | "+" |"+pasagerare[2]+" |"+"|"+pasagerare[3]+" |");
        System.out.println("|"+pasagerare[4]+" |"+"|"+pasagerare[5]+" | "+" |"+pasagerare[6]+" |"+"|"+pasagerare[7]+" |");
        System.out.println("|"+pasagerare[8]+" |"+"|"+pasagerare[9]+"| "+" |"+pasagerare[10]+"|"+"|"+pasagerare[11]+"|");
        System.out.println("|"+pasagerare[12]+"|"+"|"+pasagerare[13]+"| "+" |"+pasagerare[14]+"|"+"|"+pasagerare[15]+"|");
        System.out.println("|"+pasagerare[16]+"|"+"|"+pasagerare[17]+"| "+" |"+pasagerare[18]+"|"+"|"+pasagerare[19]+"|");
        */
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
        System.out.println(" Y  |  N  ");
        String sakerhet = tangentbord.nextLine();
        if (sakerhet.equalsIgnoreCase  ("N")) {
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
                vinst += vuxen_plats;
            } else if (person_alder < 180000){
                Thread.sleep(500);
                System.out.println("Du är under 18");
                Thread.sleep(500);
                System.out.println("Priset för plats är "+barn_plats+"kr");
                vinst += barn_plats;
            }
            Thread.sleep(750);
            System.out.println("Dessa plattser är lediga:");
            Thread.sleep(750);
            platser();
            pasagerare[0]=0;
            pasagerare[1]=0;
            pasagerare[2]=0;
            pasagerare[3]=0;
            pasagerare[4]=0;
            pasagerare[5]=0;
            pasagerare[6]=0;
            pasagerare[7]=0;
            pasagerare[8]=0;
            pasagerare[9]=0;
            pasagerare[10]=0;
            pasagerare[11]=0;
            pasagerare[12]=0;
            pasagerare[13]=0;
            pasagerare[14]=0;
            pasagerare[15]=0;
            pasagerare[16]=0;
            pasagerare[17]=0;
            pasagerare[18]=0;
            pasagerare[19]=0;
            Thread.sleep(500);
            System.out.println("Vilken platts vill du boka?");
            int plats_bokning = tangentbord.nextInt();
            System.out.println("Du valde plats "+plats_bokning);
            Thread.sleep(750);
            plats_bokning=plats_bokning-1;
            pasagerare[plats_bokning]=persnr;
            System.out.println("Din plats är "+pasagerare[plats_bokning]);
            Thread.sleep(750);

            meny();
        }

        }
    }
}
