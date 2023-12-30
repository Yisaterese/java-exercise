import java.util.Scanner;
 
 public class Velocity{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      
System.out.print("plese enter starting velocity ");
  double velocity0 = input.nextDouble();
    

System.out.print("plese enter endinding velocity ");
  double velocity1 = input.nextDouble();

System.out.print("plese enter time taken");
  double time = input.nextDouble();

double acceleration = (velocity1-velocity0)/time/3;
double average = (velocity0 + velocity1 + time)/3;
System.out.printf("average acceleration is %f%n, %f%n, %f%n",average);
}


}

