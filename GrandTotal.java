import java.util.Scanner;

public class GrandTotal{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter item: ");
String item = scanner.nextLine();

System.out.print("Enter price of item: ");
double price = scanner.nextDouble();

double itemDiscount = 10/100;
double total = price - (price * itemDiscount  );
System.out.println("Discount is: "  +itemDiscount);
System.out.print("the total is: " +total);


}
}