import java.util.Scanner;
import java.util.Arrays;
public class Task5{
    public static void main(String[] args) {
        boolean avail=false;
        Scanner reader=new Scanner(System.in);
        String[] array={"Phone","Laptop","Desktop","Tablet","Lcd","Led","Lamp","Watch","Headset"};

        for(int i=0;i<array.length;i++)
        {
            array[i]=array[i].toUpperCase();
            
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the item you want to search:");
        String item=reader.nextLine();
        item=item.toUpperCase();
        System.out.println(item);

        for(int i=0;i<array.length;i++)
        {
            if(array[i].equals(item))
            {   
                System.out.println("The item is available");
                avail=true;
                break;
            }
           
        }
        if(array[(array.length-1)]!=item && !avail)
        {
            System.out.println("The item is not available");
        }
    }
}