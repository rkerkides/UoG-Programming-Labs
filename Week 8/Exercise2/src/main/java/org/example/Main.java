package org.example;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var p1 = new Person("John", 30, 180);
       var p2 = new Person("Jane", 25, 170);
       var p3 = new Person("Jack", 5, 110);
       var p4 = new Person("Jill", 3, 90);
       ArrayList<Person> people = new ArrayList<>();
       people.add(p1);
       people.add(p2);
       people.add(p3);
       people.add(p4);

       for (Person p : people) {
           p.sayHello();
       }

       
    }

    public static void exercise2part1() {
        FileReader fr = null;
        ArrayList<String> arrayList1 = new ArrayList<>();
        try {
            fr = new FileReader("src/main/resources/strings.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String[] array = sc.nextLine().split(", ");
                arrayList1.addAll(Arrays.asList(array));
            }
            for (String s : arrayList1) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}