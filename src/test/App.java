package test;

import Package1.myClass; // imports the methods and information from package 1 specifically myClass

public class App {
    public static void main(String[] args) {

        String[][] listOfNames = { { "Alice", "Bob", "Charlie", "Dennis" }, { "E", "F", "G", "H" } }; // 2-D array. this
                                                                                                      // is a 2x4 array.
                                                                                                      // 2 sets of array
                                                                                                      // with 4 values
                                                                                                      // in each array.
        for (int i = 0; i < listOfNames.length; i++) {
            for (int j = 0; j < listOfNames[i].length; j++) {

                System.out.println("Name :" + listOfNames[i][j] + " ");
            }

        }
        Car c = new Car(2026); // calls the the "Car" class and gives it the variable called c. the year for
                               // car
                               // c is 2026.
        int carYearOfManufacturer = 2023;
        System.out.println("Year of manufacture:2023" + carYearOfManufacturer);
    }

}
