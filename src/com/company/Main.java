package com.company;

import javafx.collections.ArrayChangeListener;

import java.util.ArrayList;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String name = input.next();

        System.out.println("Please enter your email address : ");

        String email = input.next();

        System.out.println("Please enter your job: ");
        String job = input.next();

        System.out.println("Please enter company Name: ");
        String companyname = input.next();

        System.out.println("Please enter jobtitle: ");
        String jobtitle = input.next();

        System.out.println("Enter the Start Date: ");
        String startdate = input.next();

        System.out.println("Enter the End Date:");
        String enddate = input.next();

        System.out.println("Do you have at least one job to add? : ");
        String y = input.nextLine();
        String n = input.nextLine();

        System.out.println("Enter jobdescription: ");
        String jobdescription = input.next();

        ArrayList<Employees> employeelist = new ArrayList<>();
        employeelist.add(new Employees());


        String[] Jobtitle = {"manager", "president", "staff", "instructor"};
        String[] names = {"May", "April", "Mary", "John"};
        String[] Companyname = {"Apple", "MC", "UMD", "IBM"};
        String[] Startdate = {"1/18", "2/18", "3/18", "4/18"};
        String[] Enddate = {"1/19", "2/19", "3/19", "4/19"};
        String[] Jobdescription = {"Full Stack Java developr"};
        String[] Email = {"a@gmail.com", "b@yahoo.com", "c@hotmail.com", "l@aol.com"};



                for (int i = 0; i < names.length; i++) {

            names[i] = input.nextLine();
        }
        for (String a : names) {
            System.out.println(a);

        }

    }
}