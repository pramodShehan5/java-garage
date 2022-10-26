package com.pramod.superExample;

public class SuperMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        System.out.println("Name is - " + dog.getName() + " Age is " + dog.getAge());

        System.out.println("---------------------------------------------");

        Animal dog1 = dog;
        dog1.eat();
        System.out.println("Name is - " + dog1.getName() + " Age is " + dog1.getAge());

        Animal dog2 = new Dog("Pramod", 12, "glod");
        System.out.println(dog2);
    }
}
