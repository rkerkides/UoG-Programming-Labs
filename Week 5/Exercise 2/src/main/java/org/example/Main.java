package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            String filePath = "src/main/resources/backwards.txt";
            fileReader = new FileReader(filePath);
            List<Character> characters = new ArrayList<>();
            try {
                int position = 0;
                FileWriter fileWriter = new FileWriter("src/main/resources/forwards.txt");
                int ch;
                while ((ch = fileReader.read()) != -1) {
                    characters.add(position, (char) ch);
                    position++;
                }
                System.out.println(position);
                for (int i = position - 1; i >= 0; i--) {
                    fileWriter.append(characters.get(i));
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void part1(FileReader fileReader) {
        try {
            String filePath = "src/main/resources/dolphin.txt";
            fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void part2(FileReader fileReader) {
        try {
            String filePath = "src/main/resources/sums.txt";
            fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                try {
                    int firstNumber = Integer.parseInt(tokens[0]);
                    String operator = tokens[1];
                    int secondNumber = Integer.parseInt(tokens[2]);
                    switch (operator) {
                        case "+":
                            int sum = firstNumber + secondNumber;
                            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                            break;
                        case "-":
                            int difference = firstNumber - secondNumber;
                            System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
                            break;
                        default:
                            System.out.println("Wrong operator.");
                            break;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}