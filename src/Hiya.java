import java.util.Scanner;
public class Hiya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("hello there!");
        System.out.print("Enter a String: ");
        String hi = input.next();

        for(int i = 0; i<5; i++){ System.out.print(hi + " ");}

        System.out.print("Can you see this?? :eyes:");
        
        System.out.println("Does this work?");
        System.out.println("Yeah!!");

        System.out.println("Please enter true or false");

        
        boolean pog = input.nextBoolean();
        if (pog == true)
            System.out.println("poggies");
            

        
        

        

    }
}
