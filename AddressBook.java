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
			System.out.println("Enter \n 1)To Add contacts \n 2)To Exit");
			System.out.println("Enter the option : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				AddressBook.addContacts();
				break;
			case 2:
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
		}
	}