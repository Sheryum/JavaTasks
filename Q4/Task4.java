import java.util.Scanner;
import java.util.Arrays;
public class Task4 {

    public static void main(String[] args)

    {   
        float arraySum=0;
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter the size of array");

        int arraySize=reader.nextInt();

        float[] numbs=new float[arraySize];

        System.out.println("Enter the numbers");

        for(int i=0;i<numbs.length;i++)
        {
            numbs[i]=reader.nextFloat();
            arraySum+=numbs[i];
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
        }
        System.out.println(Arrays.toString(numbs));
        System.out.print("The average of the elements in the array is:");
        System.out.print(arraySum/arraySize);
    }
}