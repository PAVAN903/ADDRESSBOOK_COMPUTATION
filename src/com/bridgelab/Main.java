package com.bridgelab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Contacts contact;
	static ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    static Main addressBook = new Main();
    Scanner sc = new Scanner(System.in);
    String searchByName;
    static int option;

	public void Uc1_creatingcontact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String f_name = sc.next();
		System.out.println("enter last name");
		String l_name = sc.next();
		System.out.println("enter city name");
		String city = sc.next();
		System.out.println("enter state name");
		String state = sc.next();
		System.out.println("enter zip code");
		String zip = sc.next();
		System.out.println("enter mobile number");
		String m_number = sc.next();
		System.out.println("enter mail address");
		String mail = sc.next();
		System.out.println("contact created");
		contact = new Contacts(f_name, l_name, city, state, zip, m_number, mail);
		System.out.println(contact);

	}
	public static void Uc2_add() {
		contacts.add(contact);
	}
	 public void uc3_editContacts() {
	        if(contacts.get(0).getF_name().equalsIgnoreCase(searchByName)) {
	            System.out.println("Enter respectively\n1.First name 2.Last name"+
	                    " 4.City 5.State 6.Zip 7.Phone number 8.Email address");
	            int option2 = sc.nextInt();
	            switch (option2) {
	                case 1:
	                    System.out.println("Enter the first name to be edited");
	                    contacts.get(0).setF_name(sc.next());
	                    break;
	                case 2:
	                    System.out.println("Enter the last name to be edited");
	                    contacts.get(0).setL_name(sc.next());
	             
	                case 3:
	                    System.out.println("Enter the city name to be edited");
	                    contacts.get(0).setCity(sc.next());
	                    break;
	                case 4:
	                    System.out.println("Enter the state name to be edited");
	                    contacts.get(0).setState(sc.next());
	                    break;
	                case 5:
	                    System.out.println("Enter the zip code to be edited");
	                    contacts.get(0).setZip(sc.next());
	                    break;
	                case 6:
	                    System.out.println("Enter the phone number to be edited");
	                    contacts.get(0).setM_number(sc.next());
	                    break;
	                case 7:
	                    System.out.println("Enter the email address to be edited");
	                    contacts.get(0).setMail(sc.next());
	                    break;
	                default:
	                    System.out.println("Invalid option");
	            }
	        }
	        else
	            System.out.println("Oops! can't find the name");
	    }
	    public void menu() {
	        System.out.println("Menu: (Enter the respective number)\n1. Add contact 2. Edit contact 3. Display");
	        option = sc.nextInt();
	        switch(option) {
	            case 1:
	                addressBook.Uc1_creatingcontact();
	                addressBook.Uc2_add();
	                addressBook.menu();
	                break;
	            case 2:
	                System.out.println("Enter the first name to search and edit contact with first name");
	                searchByName = sc.next();
	                addressBook.uc3_editContacts();
	                addressBook.menu();
	                break;
	            case 3:
	                System.out.println(contacts.get(0));
	                addressBook.menu();
	            default:
	                System.out.println("Invalid option");
	        }

}

	public static void main(String[] args) {
		System.out.println("welcome to address book computation");
		Main object = new Main();
		object.Uc1_creatingcontact();
        object.Uc2_add();
        System.out.println(contacts.get(0));
        object.menu();
	}
	
}