package test;

import Package1.myClass; // imports the methods and information from package 1 specifically myClass

public class App {
    public static void main(String[] args) {

        int a = 0;
        // declare and initialize a list of names
        String[] listOfNames = { "Alice", "Bob", "Charlie", "Dennis" };

        for (int i = 0; i < listOfNames.length; i++)
            System.out.println(listOfNames[i]);

        // System.out.println("Name: " + listOfNames[0] + "," + listOfNames[1] + "," +
        // listOfNames[2]);
    }

    myClass c = new myClass();
}
