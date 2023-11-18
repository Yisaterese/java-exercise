import java.util.Scanner; 
public class Game{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print( "enter a name:");
String Obi1 = input.nextLine();


System.out.print( "enter a name:");
String Obi2 = input.nextLine();

System.out.printf("%s enter a number 0,1 or 2:",Obi1);
int firstPlayer = input.nextInt();

System.out.printf("%s enter a number 0,1 or 2:", Obi2);
int secondPlayer= input.nextInt();

nm
if (firstPlayer == 0 && secondPlayer == 0){
System.out.printf("%s draws to %s ", Obi1, Obi2);
}
if (firstPlayer  == 0 && secondPlayer == 1){
System.out.printf("%s won %s ", Obi2 ,Obi1);
}

if (firstPlayer == 2 && secondPlayer == 0){
System.out.printf("%s won  %s ", Obi1, Obi2);
}

if (firstPlayer == 2 && secondPlayer == 2){
System.out.printf("%s draw  %s ", Obi1, Obi2);

}
if (firstPlayer == 2 && secondPlayer == 0){
System.out.printf("%s  won %s ", Obi2, Obi1);
}
if (firstPlayer == 0 && secondPlayer == 1){
System.out.printf("%s won %s ", Obi2, Obi1);
}

if (firstPlayer == 1 && secondPlayer == 2){
System.out.printf("%s won  %s ", Obi2, Obi1);
}
if (firstPlayer == 1 && secondPlayer == 0){
System.out.printf("%s won %s ", Obi2, Obi1);

}

if (firstPlayer == 1 && secondPlayer == 1 ){
System.out.printf("%s draws  %s ", Obi1, Obi2);

}

if (firstPlayer == 2 && secondPlayer == 1){
System.out.printf("%s won %",Obi1,Obi2);

}
}
}