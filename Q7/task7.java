import java.util.Arrays;

public class task7{
    public static void main(String[] args) {
        int[] numbers={10,8,76,6,15,62,4,81,110,18};
        int temporary=0;
        int j=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]>numbers[j])
                {
                    temporary=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temporary;
                }
            }
        }
        System.out.println("Array of integers in ascending order:");
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++)
        {
            for(j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]<numbers[j])
                {
                    temporary=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temporary;
                }
            }
        }
        System.out.println("Array of integers in descending order:");
        System.out.println(Arrays.toString(numbers));

    }
}