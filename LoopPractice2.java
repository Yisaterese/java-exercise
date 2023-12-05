import java.util.Scanner;

public class LoopPractice2{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number");
int number = scanner.nextInt();

int total = 0;
int i = 1;
while (true){
  System.out.print("Enter number"); 
  total += scanner.nextInt();
    if(total > 100)
         break

}
System.out.print(total)
 }
}
