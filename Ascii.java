
import java.util.Scanner;

public class Ascii{
    public static void main (String[] args){
//         System.out.println("Enter an alphabet/ character");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter alphabet/character");
            char character =sc.next().charAt(0);
            int asciivalue =(int)character;
            System.out.println(asciivalue);
            sc.close();


    }
}



