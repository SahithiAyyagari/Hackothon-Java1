import java.util.*;
public class hackathonQuestion1A {
    public static void main(String[] args) {
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter the number of residents : ");
        int n=obj1.nextInt();
        System.out.println("Enter the water consumed in liters by the household : ");
        double con=obj1.nextDouble();
        System.out.println("Enter your house number : ");
        int house=obj1.nextInt();
        System.out.println("Enter the water usage status (F/L) : ");
        char usage=obj1.next().charAt(0);
        System.out.println("The number of residents in the house are : " +n);
        System.out.println("The water consumed in liters by the household is : " +con);
        System.out.println("The house number is : " +house);
        System.out.println("The water usage status of the household is : " +usage);
    }
}
