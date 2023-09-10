import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String name = "tomy";
        //             Hnnaa

        if(name.length() > 4) {
            char char1 = name.charAt(1);
            char char2 = name.charAt(name.length() - 2);

            char firstChar = name.charAt(0);
            char lastChar = name.charAt(name.length() - 1);

            String newString2 = char2 + name.substring(2, (name.length() - 2)) + char1;

            System.out.println(firstChar + newString2 + lastChar);

        }







        // user name validation

        // @, $ symbol // uppercase






    }
}