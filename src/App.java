import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbort = new Scanner (System.in);
        int[] pasagerare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        String[] pasagerare2 = {"X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X","X"};
        System.out.println("Vad är ditt personnummer?");
        int persnr1 = tangentbort.nextInt();
        System.out.println("Vilken plats vill du boka?");
        System.out.println("|"+pasagerare[0]+" |"+"|"+pasagerare[1]+" | "+" |"+pasagerare[2]+" |"+"|"+pasagerare[3]+" |");
        System.out.println("|"+pasagerare[4]+" |"+"|"+pasagerare[5]+" | "+" |"+pasagerare[6]+" |"+"|"+pasagerare[7]+" |");
        System.out.println("|"+pasagerare[8]+" |"+"|"+pasagerare[9]+"| "+" |"+pasagerare[10]+"|"+"|"+pasagerare[11]+"|");
        System.out.println("|"+pasagerare[12]+"|"+"|"+pasagerare[13]+"| "+" |"+pasagerare[14]+"|"+"|"+pasagerare[15]+"|");
        System.out.println("|"+pasagerare[16]+"|"+"|"+pasagerare[17]+"| "+" |"+pasagerare[18]+"|"+"|"+pasagerare[19]+"|");
        int plats = tangentbort.nextInt();
        System.out.println(pasagerare[plats]-1);
        int platser = pasagerare[plats]-1;
        pasagerare[plats] = persnr1;
        System.out.println(pasagerare[plats]);
    }
}
