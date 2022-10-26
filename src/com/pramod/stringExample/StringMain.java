package com.pramod.stringExample;

public class StringMain {
    public static void main(String[] args) {
        String name = "Pramod";
        name = "Achini";
        System.out.println("Name is " + name);
        String secondName = "Achini";
        System.out.println("String objects are in same memory " + (name == secondName));
        System.out.println("String objects are in same " + (name.equals(secondName)));

        String thirdName = new String("Achini");
        System.out.println("String objects are in same memory " + (name == thirdName));
        System.out.println("String objects are in same " + (name.equals(thirdName)));

        System.out.println("String objects are in same memory " + (name == thirdName.intern()));

        String newName = "Pramod" + " " + "Achini";
        System.out.println("New name is " + newName);
    }
}