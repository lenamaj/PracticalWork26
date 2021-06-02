package com.alfa.work2;


import java.util.Scanner;

public class Runner {


    public void run() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first name: ");
        String firstName = in.nextLine();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input last name: ");
        String lastName = in1.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = in2.nextInt();


        Person person1 = new Person();
        person1.setFirstName(firstName);
        person1.setLastName(lastName);

        try {
            person1.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person1.toString());
    }

}
