package com.bridgelab;

import java.util.Scanner;

public class Main {
	static Contacts contact;

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

	public static void main(String[] args) {
		System.out.println("welcome to address book computation");
		Main object=new Main();
		object.Uc1_creatingcontact();

	}

}
