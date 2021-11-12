import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DepManagmentExercise {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something below: ");
        //The following line returns true if input is a number
        System.out.println(StringUtils.isNumeric(scanner.next()));

        System.out.println("Enter a string and watch the case flip: ");
        System.out.println(StringUtils.swapCase(scanner.next()));

        System.out.println("Enter a word to see it flipped: ");
        System.out.println(StringUtils.reverse(scanner.next()));
    }
}
