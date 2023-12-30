import java.util.Scanner;
 
 public class UserWant{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      
System.out.print("plese enter number ");
  int number = input.nextInt();
    
System.out.print("enter -1 to stop");
int ok = input.nextInt();
 
int numberOfPositive = 0;
int numberOfnegative = 0;
int numberOfZeros = 0;


if(numberOfPositive == 0){
System.out.print("0 += 1");
}

if(numberOfnegative < -1){
System.out.print("-1 += 1");
}

if(numberOfZeros > 1){
System.out.print("0 += 1");
}


}


}  

 