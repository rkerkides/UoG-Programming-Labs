package org.example;

public class Person {
    private String name;
    private int age;
    private int height;
    private Person[] dependents;
    private int dependentCount;
    public Person(String s, int a, int h) {
        name = s;
        age = a;
        height = h;
        dependents = new Person[3];
        dependentCount = 0;
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

    public Person[] getDependents() {
        return dependents;
    }

    public void addChild(Person child) {
        if (dependentCount < dependents.length) {
            dependents[dependentCount] = child;
            dependentCount++;
        } else {
            Person[] newDependents = new Person[dependents.length + 3];
            for (int i = 0; i < dependents.length; i++) {
                newDependents[i] = dependents[i];
            }
            dependents = newDependents;
            addChild(child);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}');
        for (int i = 0; i < dependentCount; i++) {
            sb.append("\nHas children:\t" + dependents[i].toString());
        }
        return sb.toString();
    }
}
