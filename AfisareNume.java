package com.itfactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AfisareNume {
    public static void main(String[] args)
    {
        //EX.1 I initialize the object through which I have the ability to read from the keyboard
        Scanner scanner = new Scanner(System.in);

        //Display a message for keyboard text request
        //The required text will be entered, then press Enter

        System.out.print("Enter your name: ");

        //The line of code that will actually read the text on the keyboard
        //Declare a variable type String where the entered text will be displayed

        String numelePersoanei = scanner.nextLine();

        //I display the name of the person entered from the keyboard
        System.out.println("The name that you entered is: " + numelePersoanei);

        //EX. 2: Create a code to read the person's first name (in a different variable) and display it later.
        // Example: Enter your name: Roban
        // Enter your first name: Marian

        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.println("The First Name is: " + firstname);
        System.out.println("The complete name is: " + numelePersoanei + " " + firstname);
            }

}

