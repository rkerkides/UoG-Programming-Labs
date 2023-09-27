package org.example;

public class Person {
    private String name;
    private int age;
    private int height;
    public Person(String s, int a, int h) {
        name = s;
        age = a;
        height = h;
    }

    public void sayHello() {
        System.out.println("Hi, I'm " + name + " and I am " + age + " years old. I am " + height + "cm tall!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
