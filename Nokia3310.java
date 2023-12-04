import java.util.Scanner;

public class Nokia3310{
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
			break;			
			}
		System.out.print("Select option in phonebook: ");
		int phonebook = scanner.nextInt();
			switch(phonebook){
				case 1:
					System.out.print("Search");
					break;
				case 2:
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
				case 8:System.out.print("options");
					break;
					System.out.print("select option");
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
				case 9:
					System.out.print("Speed dials");
					break;
				case 10:
					System.out.print("Voice tags");
		}



/*
		System.out.print("Press 1 to enter search");
		int serch = scanner.nextInt();
			switch(search){
				case 1:
					System.out.print("search");
					break;
				case 2:
					System
			}
		}
/*
	        System.out.print("press any number to select options in phonebook:  ");
			int options = scanner.nextInt();
		switch(options){
				case 1:
					System.out.print("press 1 to display search: ");
					int search = scanner.nextInt();
					System.out.print("Search");
					break;
					}


/*

				`case 2:
	
					System.out.println("Service Nos");
					break;
				case 3:
					System.out.println("Add name");
					break;
				case 4:
					System.out.print("Erase");
					break;
				case 5:
					System.out.println("Edit");
					break;
				case 6:
					System.out.println("Assign tone");
					break;
				case 7:
					System.out.println("Send b'Card");
					break;
				case 8: 
					System.out.println("Options");
					break;
					switch(Option){
						case 1: 
							System.out.println("Type of view");
							break;
						case 2:
							System.out.println("Memoery status");
							break;
						default:
							System.out.println("please enter a valid option");
						}
					break;
				case 9: 
					System.out.println("Speed dials");
					break;
				case 10:
					System.out.println("Voice stage");
					break;
			default:
				System.out.println("Please enter a valid 0ption");
			}
			break;
		case 2:

			switch(messages){
				case 1:
					System.out.println("Write messages");
					break;
				case 2:
					System.out.println("Inbox");
					break;	
				case 3:
					System.out.println("Outbox");
					break;
				case 4:
					System.out.println("Picture messages");
					break;
				case 5:
					System.out.println("Templates");
					break;
				case 6:
					System.out.println("Smileys");
					break;
				case 7:
					System.out.println("Message settings");
					break;
					switch(Message settings){
						case 1:
							System.out.println("set");
							break;
							switch(set){
								case 1:
									System.out.println("Message centre number");
									break;
								case 2:
									System.out.println("Message sent as");
									break;
								case 3:
									System.out.println("Message validity");
									break;
								default:
									System.out.println("Enter a valid option");
								}
								break;
						case 2:
							System.out.println("Common");
							break;
							switch(common){
								case 1:
									System.out.println("Delivery reports"):
									break;
								case 2:
									System.out.println("Reply via same centre");
									break;
								case 3:
									System.out.println("Character support");
									break;
								default:
									System.out.println("Enter a valid option");
								}
								break;
				case 8:
					System.out.println("Info services");
					break;
				case 9:
					System.out.println("Voice mailbox number");
					break;
				case 10:
					System.out.println("Service command editor");
					break;
				default:
					System.out.println("Enter a valid option");
				}
				break;
		case 3:
			switch(chat){
				System.out.println("chat");
				break;
				}
		case 4:
			switch(call register){
				case 1:
					System.out.println("Missed calls");
					break;
				case 2:
					System.out.println("Received calls");
					break;
				case 3:
					System.out.println("Dialled numbers");
					break;
				case 4:	
					System.out.println("Erase recent call list");
					break;
				case 5:
					Syste.out.println("Show call duration");
					break;
					switch(show call duration){
						case 1:
							System.out.println("Last call duration");
							break;
						case 2:
							System.out.println(""All calls duration);
							break;
						case 3:
							System.out.println("Received calls duration");
							break;
						case 4:
							System.out.println("Dialed calls duration");
							break;
						case 5:
							System.out.println("Clear timers");
							break;
						default:
							System.out.print("Enter a valid option");
				
					}
					break;
				case 6:
					System.out.println("Show call cost");
					break;
					switch(show call cost){
						case 1:
							System.out.println("Last call cost");
							break;
						case 2:
							System.outprint("All calls cost");
							break;
						case 3:
							System.out.println("Clear counters");
							break;
						default:
							System.out.print("Enter a valid optiion");
						}
						break;
				case 7:
					System.out.println("Call cost settings");
					break;
					switch(Call cost settings){
						case 1:
							System.out.println("Call cost limit");
							break;
						case 2:
							System.out.println("Show cost in");
							break;
						default:
							System.out.println("Enter a valid option");
						}
						break;
				case 8:
					System.out.println("Prepaid credit");
					break;		
					
			


	}
}
*/
}
}
