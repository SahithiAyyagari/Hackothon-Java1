import java.util.*;
public class hackathonQuestion1C {
      void calculateTotal(int morningUsage, int eveningUsage) {
         int totalUsage=morningUsage+eveningUsage;
         System.out.println("The toal water consumed in the day in liters is : " +totalUsage);
      }
public static void main(String[] args) {
    Scanner obj1= new Scanner(System.in);
    System.out.println("Enter the water consumed in the morning in liters : ");
    int morning=obj1.nextInt();
    System.out.println("Enter the water consumed in the evening in liters : ");
    int evening=obj1.nextInt();
    hackathonQuestion1C obj=new hackathonQuestion1C();
    obj.calculateTotal(morning,evening);
}

}
