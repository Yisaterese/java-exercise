import java.util.Scanner;

public class Nokia3310Navigator{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("press 2 to ON: ");
int on = scanner.nextInt();
	if(on == 2){
System.out.println("""
		Welcome to Nokia	
	Date
	Time
	""");
	}
	if(on != 2){
	System.out.print("Enter a valid option");
	}
System.out.println("press 1 to display menu: ");
int press1 = scanner.nextInt();
	if(press1 == 1){
System.out.println("""
		1.Phone book	
		2.Messages	
		3.Chat
		4.Call Register	
		5.Tones	
		6.Settings	
		7.Call Divert	
		8.Games	
		9.Calculator	
		10.Reminder	
		11.Clock
		12.Profiles
		13.Sim Services
		""");
		} 
	if(press1 != 1){
	System.out.print("Enter a valid option");
	}
System.out.print("select option: ");
int menu = scanner.nextInt();
	switch(menu){
		case 1:
			System.out.println("      PHONEBOOK\n1.Search\n2.Services\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n");	
						
		System.out.print("Select option in phonebook: ");
		int phonebook = scanner.nextInt();
			switch(phonebook){
				case 1:
					System.out.print("Search");
					break;
				case 2:2
					System.out.print("Service Nos");
					break;
				case 3:
					System.out.print("Add name");
					break;
				case 4:
					System.out.print("Erase");
				case 5:
					System.out.print("Edit");
					break;
				case 6:
					System.out.print("Assign tone");
					break;
				case 7:
					System.out.print("Send b'card");
					break;
				case 8:
					System.out.print("1.options\n");
					System.out.print("select option 1 or 2: ");
					int option = scanner.nextInt();
					switch(option){
						case 1:
							System.out.print("Type of view");
							break;
						case 2:
							System.out.print("Memory status");
							break;
						default:
							System.out.print("enter a valid option");
						
						}
						break;	
				case 9:
					System.out.print("Speed dials");
					break;
				case 10:
					System.out.println("Voice tags");
					break;
				default:
					System.out.print("Enter a valid option");
				}
				break;
		case 2:1
			System.out.print("   MESSAGES\n1.Write message\n2.Inbox\n3.Outbox\n4.Picure messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info services\n9.Voice mailbox number\n10.Service command editor\n");
			
		System.out.print("Select between 1 and 10 for options in messages: ");
		int messages = scanner.nextInt();
		switch(messages){
			case 1:
				System.out.print("Write messages");
				break;
			case 2:
				System.out.print("Inbox");
				break;
			case 3:
				System.out.print("Outbox");
				break;

			case 4:
				System.out.print("Picture messages");
				break;
			case 5:
				System.out.print("Templates");
				break;
			case 6:
				System.out.print("Smileys");
				break;
		
			case 7:
				System.out.println("Message settings");
				System.out.print("select 1 or 2 for options in message settings: ");
				int messageSettings = scanner.nextInt();
				switch(messageSettings){
					case 1:
						System.out.print("  SET\n1.Message centre number\n2.Message sent as\n3.Message validity\n");
					System.out.print("Select between 1 and 3 for options in set: ");
					int set = scanner.nextInt();
					switch(set){
						case 1:
							System.out.print("Message centre number");
							break;
						case 2:
							System.out.print("Message sent as");
							break;
						case 3:
							System.out.print("Message validity");
							break;
						default:
							System.out.print("Enter a valid option");	
						}
						}
					
					if(messageSettings == 2){
						System.out.print("  COMMON\n1.Delivery reports\n2.Reply via same centre \n3.Character surpport");
					}else{
						System.out.print("Enter a valid option");
						}
						
					System.out.print("Select between 1 and 3 for options in common: ");
					int common = scanner.nextInt();
					switch(common){
						case 1:
							System.out.print("Delivery reports");
							break;
						case 2 :
							System.out.print("Reply via same centre");
							break;
						case 3:
							System.out.print("Character surpport");
							break;
						default:
							System.out.print("Enter valid option");			
						}
					break;
					}
			case 8:
				System.out.print("Info services");
				break;
			case 9:
				System.out.print("Voice mailbox number");
				break;
			case 10:
				System.out.print("Services  command editor");
				break;
			}


	

}
}								