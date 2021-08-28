import java.util.Arrays;
import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String[] array=new String[8];
        char resp=' ';
       do
       {
        
        System.out.print("Enter the index(0-7) where you want to insert data:");
        int index=reader.nextInt();
        System.out.println("Enter the data:");
        array[index]=reader.next();
        String data=reader.nextLine();
        System.out.println("Do you want to enter more data(y/n)?");
        resp=reader.next().charAt(0);
       }while( (resp=='y'|| resp=='Y'));
       System.out.println(Arrays.toString(array));
    }
}