package classwork15;

import practice.Phone;


public class StringDemo {

    public static void main(String[] args){
        String name = "John";
        System.out.println(name);
        String student01 = new String("John is a very good guy.");
        System.out.println(student01);

        System.out.println(student01.length());

        System.out.println("Char at index 0: " + student01.charAt(0));
        System.out.println("Char at index 0: " + student01.charAt(1));

        Phone myPhone = new Phone();
        myPhone.call("John");

    }
}
