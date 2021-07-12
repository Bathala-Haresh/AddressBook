package adressBook;


public class Contacts {
    //instance variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String emailId;
    private long zip;
    private long phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

package com.adressbook;
import java.util.*;
import java.util.Scanner;

public class AddressBook
{
	public static ArrayList<Contacts> contacts=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		boolean options = true;
		while (options) {
			System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3) To Exit");
			System.out.println("Enter the option : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				AddressBook.addContacts();
				break;
			case 2:
				AddressBook.editContacts();
				break;

			default:
				System.out.println("Invalid Option");
			}

		}
	}


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
			person.setAddress(sc.next());
			System.out.println("Enter the city");
			person.setCity(sc.next());
			System.out.println("Enter the state");
			person.setState(sc.next());
			System.out.println("Enter the EmailId");
			person.setEmailId(sc.next());
			System.out.println("Enter the zip");
			person.setZip(sc.nextInt());
			System.out.println("Enter the phoneNumber");
			person.setPhoneNumber(sc.nextLong());

			System.out.println(person.toString());
			contacts.add(person);

			

		}
	}

	static void editContacts() 
	{

		System.out.println("Enter firstname of the user you want to the edit:");
		String firstName = sc.next();
		for (Contacts c : contacts) {
			if (c.getFirstName().equals(firstName)) {

				System.out.println("c");
				System.out.println("Enter the  field which u want to edit:");

				System.out.println(" Address");
				System.out.println(" City ");
				System.out.println(" State");
				System.out.println(" Email");
				System.out.println(" PhoneNumber");
				System.out.println(" ZipCode");
				System.out.println("Exit");
				String field = sc.next();

				if (field.equals("firstName")) {
					c.setFirstName(sc.next());
				} else if (field.equals("lastName")) {
					c.setLastName(sc.next());
				} else if (field.equals("Address")) {
					c.setAddress(sc.next());
				} else if (field.equals("City")) {
					c.setCity(sc.next());
				} else if (field.equals("State")) {
					c.setState(sc.next());
				} else if (field.equals("Email")) {
					c.setEmailId(sc.next());
				} else if (field.equals("Zip")) {
					c.setZip(sc.nextInt());
				} else if (field.equals("phoneNumber")) {
					c.setPhoneNumber(sc.nextLong());
				}
			}

		}
		System.out.println(contacts.toString());

	}
}