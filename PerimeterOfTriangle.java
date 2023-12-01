import java.util.Scanner;


public class PerimeterOfTriangle{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter first edge of triangle  ");
int firstEdgeOfTriangle = input.nextInt();

System.out.print("enter second edge of triangle  ");
int secondEdgeOfTriangle = input.nextInt();

System.out.print("enter third edge of triangle  ");
int thirdtEdgeOfTriangle = input.nextInt();

int sumOfEdgesOfTriangle = firstEdgeOfTriangle + secondEdgeOfTriangle + thirdtEdgeOfTriangle;

int sumOfTwoEdges1 = firstEdgeOfTriangle + secondEdgeOfTriangle;
int sumOfTwoEdges2 = secondEdgeOfTriangle + thirdtEdgeOfTriangle;
int sumOfTwoEdges3 = firstEdgeOfTriangle + thirdtEdgeOfTriangle;

if(sumOfTwoEdges1 > thirdtEdgeOfTriangle && sumOfTwoEdges2 >  firstEdgeOfTriangle && sumOfTwoEdges3 > secondEdgeOfTriangle ){
System.out.print("input is valid");
}
else{
   System.out.print("input is invalid try again");


}
}
}