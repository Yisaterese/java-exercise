import java.util.Scanner;
public class GeopolicalZones2{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your state(start with uppercase): ");
String state = scanner.nextLine();

switch(state){
	case "Kamfara":
	case "Katsina":
	case "Kaduna":
	case "Kano":
	case "Sokoto":
		 System.out.print("you are from the NW");
		break;
	
	case "Borno":
	case "Adamawa":
	case "Yobe":
	case "Taraba":
	case "Gombe":
	case"Jigawa":
	case"Bauchi":
		 System.out.print("You are from NE");
		break;
	case "Kogi":
	case "Kwara":
	case "Plateau":
	case "Niger":
	case "Benue":
	case "FCT":
	case "Nasarawa":
		System.out.print("You are from the NC");
		break;
	case "Ogun":
	case "Osun":
	case "Ondo":
	case "Lagos":
	case "Ekiti":
	case "Oyo":
		System.out.print("You are from the SW");
		break;
		
	case "Anambra":
	case "Abia":
	case "Enugu":
	case "Ebonyi":
	case "Imo":
		System.out.print("You are from SE");
		break;
	 
	case "Rivers":
	case "Akwa-Ibom":
	case "Byelsa":
	case "Delta":
	case "Cross-River":
	case "Edo":
		System.out.print("You are from SS");
		break;
	default:
		System.out.print("Incorrect spelling and re-enter your state");
	
} 

}
}