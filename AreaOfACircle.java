import java.util.Scanner;



public class AreaOfACircle {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("enter radius of a circle as an integer: "); 
int radius = input.nextInt();

System.out.printf("diameter of the circle is %d%ncircumference of the circle is %f%nand Area of the circle is %f%n", (2 * radius), (2 * 3.14159 * radius), (3.14159 * radius * radius));




}
}