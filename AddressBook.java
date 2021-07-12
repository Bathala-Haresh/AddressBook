package com.adressbook;
import java.util.*;
import java.util.Scanner;

public class AddressBook
{
	//adding contact class to a arrayList
	public static ArrayList<Contacts> contacts=new ArrayList<>();
	//initializing an dictionary for initializing separate arraylist and hashtable to store each separate adressBooks
	public static Dictionary<String,ArrayList<Contacts>> dict= new Hashtable<String,ArrayList<Contacts>>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		boolean options = true;
		while(options){
			System.out.println("Enter \n 1)To add new Address Book \n 2)Add Contacts to old Address Book\n 3)To display all AdressBooks\n 4.)To Exit");
			System.out.println("Enter the option : ");
			int choice = sc.nextInt();
			if(choice==4)
			{
				break;
			}
			switch(choice){
			case 1:System.out.println("Enter the name of Adress Book:");
			String name=sc.next();
			//assigning all contacts to this particular AdressBook
			ArrayList<Contacts> tempContacts=new ArrayList<>();
			contacts=tempContacts;
			while (options) {
				System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3)To Delete Contacts\n 4)To Exit");
				System.out.println("Enter the option : ");
				int option = sc.nextInt();
				if(option==4)
				{
					break;
				}
				switch (option) {
				case 1:
					AddressBook.addContacts();
					break;
				case 2:
					AddressBook.editContacts();
					break;
				case 3:
					AddressBook.deleteContacts();
					break;
				default:
					System.out.println("Invalid Option");
				}
			}
			dict.put(name,contacts);
			break;
			case 2:System.out.println("Enter the name of Address book in which you want to insert:");
			name=sc.next();
			ArrayList<Contacts> tempContacts1=new ArrayList<>();
			contacts=tempContacts1;
			contacts=dict.get(name);
			while (options) {
				System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3)To Delete Contacts\n 4)To Exit");
				System.out.println("Enter the option : ");
				int option = sc.nextInt();
				if(option==4)
				{
					break;
				}
				switch (option) {
				case 1:
					AddressBook.addContacts();
					break;
				case 2:
					AddressBook.editContacts();
					break;
				case 3:
					AddressBook.deleteContacts();
					break;
				default:
					System.out.println("Invalid Option");
					break;
				}
				dict.put(name,contacts);

			}
			break;
			case 3:
				System.out.println(dict);
				break;

			default:System.out.println("Wrong Value");
			break;

			}
		}

	}

	//method to add multiple contacts
	static void addContacts()
	{
		int choice=0;
		while(choice ==0)
		{
			Contacts person=new Contacts();

			System.out.println("Enter the firstName");
			person.setFirstName(sc.next());
			System.out.println("Enter the lastName");
			person.setLastName(sc.next());
			System.out.println("Enter the address");
			person.setAdress(sc.next());
			System.out.println("Enter the city");
			person.setCity(sc.next());
			System.out.println("Enter the state");
			person.setState(sc.next());
			System.out.println("Enter the EmailId");
			person.setEmail(sc.next());
			System.out.println("Enter the zip");
			person.setZip(sc.nextInt());
			System.out.println("Enter the phoneNumber");
			person.setPhoneNo(sc.nextLong());

			System.out.println(person.toString());
			contacts.add(person);

			System.out.println("Do you want to add extra contacts..? 1.)yes  /n  2.)No");
			int extra=sc.nextInt();
			if(extra == 1)
			{
				choice=0;
			}
			else
			{
				choice=1;
			}
		}
	}
	//method to edit contact using their first names
	static void editContacts() 
	{
		System.out.println("Enter firstname of the user to whome you want to edit:");
		String firstName = sc.next();
		for (Contacts c : contacts) {
			if (c.getFirstName().equals(firstName)) {

				System.out.println("c");
				System.out.println("Enter the type which u want to edit:");

				System.out.println(" Address");
				System.out.println(" City ");
				System.out.println(" State");
				System.out.println(" Email");
				System.out.println(" PhoneNumber");
				System.out.println(" ZipCode");
				System.out.println("Exit");
				String type = sc.next();

				if (type.equals("firstName")) {
					c.setFirstName(sc.next());
				} else if (type.equals("lastName")) {
					c.setLastName(sc.next());
				} else if (type.equals("Address")) {
					c.setAdress(sc.next());
				} else if (type.equals("City")) {
					c.setCity(sc.next());
				} else if (type.equals("State")) {
					c.setState(sc.next());
				} else if (type.equals("Email")) {
					c.setEmail(sc.next());
				} else if (type.equals("Zip")) {
					c.setZip(sc.nextInt());
				} else if (type.equals("phoneNumber")) {
					c.setPhoneNo(sc.nextLong());
				}
			}
		}
		System.out.println(contacts.toString());

	}
	//method to delete a contact using firstName
	static void deleteContacts()
	{
		System.out.println("Enter firstname of the user you want to delete:");
		String firstName = sc.next();

		for (int i = 0; i < contacts.size(); i++) {
			Contacts c = contacts.get(i);
			if (c.getFirstName().equals(firstName)) {

				contacts.remove(c);
			}
			System.out.println(contacts);
		}
	}

}