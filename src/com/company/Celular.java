package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Celular {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    ArrayList<Message> messages = new ArrayList<Message>();
    Scanner scanner = new Scanner(System.in);

    public void showAllContacts(){
        contacts.forEach(contact ->{
            System.out.println(contact);
        });
    }

    public void addContact(){
        scanner.nextLine();
        System.out.println("Please provide the user's name: ");
        String name = scanner.nextLine();
        System.out.println("Please provide the user's phone number: ");
        String number = scanner.nextLine();
        if(name.equals("") || number.equals("")){
            System.out.println("Please provide all the information!");
            addContact();
        }else{
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            } if (doesExist){
                System.out.println("Contact with this name already exists.");
                addContact();
            } else {
                contacts.add(new Contact(name, number));
                System.out.println("Name added successfully!");
            }
            }
        }

    public void searchContact(){
        scanner.nextLine();
        System.out.println("Please provide the user's name: ");
        String name = scanner.nextLine();
        if(name.equals("")){
            searchContact();
        } else {
            boolean doesExist = false;
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equals(name)){
                    System.out.println("The contact you were searching for is: " + contacts.get(i));
                    doesExist = true;
                }
            } if (!doesExist){
                System.out.println("There is no such contact!");
            }
        }
    }

    public void deleteContact(){
        scanner.nextLine();
        System.out.println("Please provide the user's name: ");
        String name = scanner.nextLine();
        if(name.equals("")){
            deleteContact();
        }else{
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equals(name)){
                    contacts.remove(contacts.get(i));
                    System.out.println("Contact removed successfully!");
                }
            }

        }
    }

    public void showAllMessages(){
        if(messages.size()>0){
        messages.forEach(message -> {
            System.out.println(message);
        });}
        else{
            System.out.println("There are no messages sent!");
        }
    }

    public void sendMessage(){
        scanner.nextLine();
        System.out.println("Please provide the recipient's name: ");
        String name = scanner.nextLine();
        System.out.println("Please type the message: ");
        String text = scanner.nextLine();
        if(name.equals("") || text.equals("")){
            System.out.println("Please make sure that you provided a correct name" +
                    "and there is a message that you are willing to send!");
        } else {
            messages.add(new Message(text, name));
        }
    }

    public void methodContacts(){
        boolean value = true;

        while(value){
            System.out.println("Menu:\n\t1.Show all contacts\n\t2.Add a new contact\n\t3.Search for a contact" +
                    "\n\t4.Delete a contact\n\t5.Go back to previous");
            int option1 = scanner.nextInt();
            switch (option1){
                case 1: showAllContacts(); break;
                case 2: addContact(); break;
                case 3: searchContact(); break;
                case 4: deleteContact(); break;
                case 5: value = false; break;}}
        }

        public void methodMessages(){
        boolean value = true;

            while(value){
                System.out.println("Menu:\n\t1.See the list of all messages\n\t2.Send a new message\n\t3.Go back to the previous");
                int option2 = scanner.nextInt();
                switch (option2){
                    case 1: showAllMessages(); break;
                    case 2: sendMessage(); break;
                    case 3: value = false; break;}}
        }


}
