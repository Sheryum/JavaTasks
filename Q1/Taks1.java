import java.util.Scanner;

public class Taks1 {

    public static void main(String[] args) {
        float numb=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("Input a number:");
        numb=reader.nextFloat();
        // check if the number is negitive
        if(numb>0)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            System.out.println("The number is Negative");
        }
    }
}