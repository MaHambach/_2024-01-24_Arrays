import java.util.Scanner;
public class PrintInput {

    public static void main(String[] args){
        //Bonus: Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();

        for(Character letter : input.toCharArray()){
            System.out.println(letter);
        }
        System.out.println(input);
    }
}
