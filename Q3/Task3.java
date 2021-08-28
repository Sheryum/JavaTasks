import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String Day;
        Scanner reader=new Scanner(System.in);
        int weekDay=0;
        while(true)
        {
            System.out.println("Please enter a number betwen 1 and 7");
            weekDay=reader.nextInt();

            if(weekDay>=1 && weekDay<=7)
            {
                break;
            }
            else
            {
                System.out.println("The entered number is out of the range 1-7");
            }
        }

        switch(weekDay)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }
}
