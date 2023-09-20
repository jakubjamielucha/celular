package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean value = true;
        boolean value2 = true;
        Scanner scanner = new Scanner(System.in);
        Celular celular = new Celular();

        while(value == true){
            System.out.println("Menu:\n\t1.Manage Contacts\n\t2.Messages\n\t3.Quit");
            int option = scanner.nextInt();
            switch (option){
                case 1: celular.methodContacts(); break;
                case 2: celular.methodMessages(); break;
                case 3: value = false; break;
            }
        }


        }
    }
