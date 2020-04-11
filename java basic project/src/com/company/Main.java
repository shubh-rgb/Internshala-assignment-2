package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        String studentName = in.nextLine();
        System.out.println("Blood Group: ");
        String studentBloodGroup = in.nextLine();
        System.out.println("Age: ");
        int studentAge = in.nextInt();
        in.close();
        for (int i=0;i<=30;i++)
            System.out.print("__");
        System.out.println("\nName: "+studentName);
        System.out.println("Age: "+studentAge);
        System.out.println("Blood Group: "+studentBloodGroup);
        for (int i=0;i<=30;i++)
            System.out.print("__");
                if (studentAge >= 20)
                System.out.println("\nYour group is RED");
                else if (studentAge >= 15)
                System.out.println("\nYour group is Blue");
                else if (studentAge >= 10)
                System.out.println("\nYour group is YELLOW");
        for (int i=0;i<=30;i++)
            System.out.print("__");
    }
}