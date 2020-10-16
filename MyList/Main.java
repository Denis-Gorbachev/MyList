package com.company;
public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(11);
        System.out.println(myList.toString());
        myList.swap(1,4);
        System.out.println(myList.toString());
        myList.sort();
        System.out.println(myList.toString());
    }
}
