import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        float greaterNum=0;
        float Num=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        for(int i=0;i<3;i++)
        {
            Num=reader.nextFloat();
            if(Num>=greaterNum)
            {
                greaterNum=Num;
            }
        }
        System.out.print("The gretest number of the three numbers is:");
        System.out.print(greaterNum);
    }
}