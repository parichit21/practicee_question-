package org.example;

import java.util.LinkedList;

public class reverse_linklist {
//    How do you reverse a linked list in Java?
    public static void main(String[] args){

        LinkedList<Integer> li= new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        System.out.println(li);
        // System.out.println(li.reversed());

        LinkedList<Integer> rev = new LinkedList<>();
li.descendingIterator().forEachRemaining(rev::add);
System.out.println(rev);





    }
}
