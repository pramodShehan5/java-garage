package com.pramod.superExample;

public class Dog extends Animal {
    public String beltType;

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String beltType) {
        this.beltType = beltType;
    }

    public Dog(String name, int age,String beltType) {
        super(name, age);
        this.beltType = beltType;
    }

    public Dog() {
        super();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Hello, I am dog. Bow bow bow!!!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Hello,  I am eating meat!!");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dog{" +
                "beltType='" + beltType + '\'' +
                '}';
    }
}
