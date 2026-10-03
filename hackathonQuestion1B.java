import java.util.*;
public class hackathonQuestion1B {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the water consumed by the household that month in liters : ");
        double usage=obj1.nextDouble();
        int bill=0;
        if(usage<=500) {
            bill=100;
            System.out.println("The bill is rs. : " +bill);
        }
        else {
            bill=200;
            System.out.println("The bill is rs. :" +bill);
        }
    }
}
