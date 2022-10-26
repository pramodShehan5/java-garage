package com.pramod.optional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class OptionalTute {

    private static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
        names.add("Pramod");
        names.add("Achini");
        names.add("Shehan");
        names.add("Ishani");
        names.add("Westbrook");

        Optional<Cat> catOptional = getCat();
        System.out.println("My cat Age is " + catOptional.get().getAge());
        System.out.println("My cat Empty" + catOptional.isEmpty());
        System.out.println("My cat Present " + catOptional.isPresent());

        System.out.println("-------------------------------------------------------");

        Optional<Cat> catNullOptional = getNullCat();
       // System.out.println("My cat Age is " + catNullOptional.get().getAge());
        System.out.println("My cat Empty " + catNullOptional.isEmpty());
        System.out.println("My cat Present " + catOptional.isPresent());

        System.out.println("-------------------------------------------------------");

        /**
         * throw Exception in thread "main" java.lang.NullPointerException.
         * if there is any possibility to return null value, we should use Optional.ofNullable
         */
        //Optional<Cat> catNullOfOptional = getNullCatOptionalOf();
        // System.out.println("My cat Age is " + catNullOfOptional.get().getAge());
        //System.out.println("My cat Empty " + catNullOfOptional.isEmpty());
        //System.out.println("My cat Present " + catNullOfOptional.isPresent());

        if(catNullOptional.isPresent()) {
            System.out.println("Cat is present " + catNullOptional.get().getAge());
        } else {
            System.out.println("No value for cat");
        }

        System.out.println("-------------------------------------------------------");

        int catAge = catOptional.map(Cat::getAge).orElse(0);
        System.out.println("Cat age is " + catAge);

        System.out.println("-------------------------------------------------------");
        /***
         * Exception in thread "main" java.util.NoSuchElementException: No value present
         * 	at java.base/java.util.Optional.orElseThrow(Optional.java:382)
         * 	at com.pramod.optional.OptionalTute.main(OptionalTute.java:39)
          */
        //int catAge1 = catNullOptional.map(Cat::getAge).orElseThrow();
        //System.out.println("Cat age is " + catAge1);

        System.out.println("-------------------------------------------------------");

        /***
         * Exception in thread "main" java.util.NoSuchElementException: No value present
         * 	at java.base/java.util.Optional.orElseThrow(Optional.java:382)
         * 	at com.pramod.optional.OptionalTute.main(OptionalTute.java:47)
         */
        //int catAge2 = catNullOptional.orElseThrow().getAge();
        //System.out.println("Cat age is " + catAge2);

        System.out.println("-------------------------------------------------------");

        int catAge3 = catOptional.orElseThrow().getAge();
        System.out.println("Cat age is " + catAge3);

        System.out.println("-------------------------------------------------------");

        /***
         * getRandomName() method - start
         * getRandomName() method - end
         * Names is Hello world
         */
        String name = getNullStringOptionalOf("Hello world").orElse(getRandomName());
        System.out.println("Names is " + name);

        System.out.println("-------------------------------------------------------");

        /***
         * Names is Hello
         */
        String name1 = getNullStringOptionalOf("Hello").orElseGet(() -> getRandomName());
        System.out.println("Names is " + name1);

        System.out.println("-------------------------------------------------------");

        /***
         * getRandomName() method - start
         * getRandomName() method - end
         * Names is Ishani
         */
        String name2 = getNullStringOptionalOf(null).orElseGet(() -> getRandomName());
        System.out.println("Names is " + name2);

        System.out.println("-------------------------------------------------------");
//        String name3 = getNullStringOptionalOf(null).ifPresentOrElse(() -> getRandomName());
//        System.out.println("Names is " + name3);
    }

    public static Optional<Cat> getCat() {
        Cat cat = new Cat("Pramod", 10);
        return Optional.ofNullable(cat);
    }

    public static Optional<Cat> getNullCat() {
        return Optional.ofNullable(null);
    }

    public static Optional<Cat> getNullCatOptionalOf() {
        return Optional.of(null);
    }

    public static Optional<String> getNullStringOptionalOf(String str) {
        return Optional.ofNullable(str);
    }

    public static String getRandomName() {
        System.out.println("getRandomName() method - start");

        Random random = new Random();
        int index = random.nextInt(5);

        System.out.println("getRandomName() method - end");
        return names.get(index);
    }
}