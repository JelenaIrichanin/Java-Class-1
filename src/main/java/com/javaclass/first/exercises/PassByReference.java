package com.javaclass.first.exercises;

public class PassByReference {

    String name;

    public static void main(String[] args){
        PassByReference p1 = new PassByReference("Belgrade");
        PassByReference p2 = new PassByReference("Kragujevac");
        System.out.println("Name before change: Name1: " + p1.name+ " Name2: " + p2.name);
        changeByValue(p1,p2);
        System.out.println("Name after change: Name1: " + p1.name+ " Name2: " + p2.name);
        System.out.println("Objects are not changed 'cause Java uses pass by value");
        System.out.println("Name before change: " + p1.name);
        changeByReference(p1);
        System.out.println("Name after change: " + p1.name);
    }

    private static void changeByReference(PassByReference pass){
        pass.name = "Novi Sad";
    }
    private static void changeByValue(PassByReference p1, PassByReference p2){
        PassByReference temp = new PassByReference(" ");
        temp=p1;
        p1=p2;
        p2=temp;
    }

    private PassByReference(String name) {
        this.name = name;
    }


}
