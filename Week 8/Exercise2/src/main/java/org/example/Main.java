package org.example;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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