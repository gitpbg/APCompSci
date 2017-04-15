package com.teach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  Reverse Polish Calculator
 *  5 6 * p = > 30
 */

class Stack<E> {
    List<E> theStack;

    Stack() {
        theStack = new ArrayList<E>();
    }

    void push(E i) {
        theStack.add(i);
    }
    E peek() {
        if (theStack.isEmpty())
            throw new RuntimeException(("Peeking empty stack"));
        return theStack.get(theStack.size()-1);
    }

    E pop() {
        if (theStack.isEmpty())
            throw new RuntimeException("Popping empty stack");
        int i = theStack.size();
        int last = i - 1;
        E ret = theStack.remove(last);
        return ret;
    }

    boolean isEmpty() {
        return theStack.isEmpty();
    }

    void printStack() {
        for (int i = theStack.size()-1; i>=0; i--) {
            System.out.println("(" + i + ") " + theStack.get(i));
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RPN ");
        while(true) {
            if (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    int v = sc.nextInt();
                    myStack.push(v);
                } else {
                    String s = sc.next();
                    if (s.equalsIgnoreCase("q")) {
                        break;
                    } else if (s.equalsIgnoreCase("+")) {
                        Integer top = myStack.pop();
                        Integer nextToTop = myStack.pop();
                        myStack.push(top + nextToTop);
                    } else if (s.equalsIgnoreCase("*")) {
                        Integer top = myStack.pop();
                        Integer nextToTop = myStack.pop();
                        myStack.push(top * nextToTop);
                    } else if (s.equalsIgnoreCase("/")) {
                        Integer top = myStack.pop();
                        Integer nextToTop = myStack.pop();
                        myStack.push(nextToTop / top);
                    } else if (s.equalsIgnoreCase("-")) {
                        Integer top = myStack.pop();
                        Integer nextToTop = myStack.pop();
                        myStack.push(nextToTop - top);
                    } else if (s.equalsIgnoreCase("p")) {
                        System.out.println(myStack.peek());
                    } else if (s.equalsIgnoreCase("c")) {
                        while(!myStack.isEmpty())
                            myStack.pop();
                    } else if (s.equalsIgnoreCase("d")) {
                        myStack.push(myStack.peek());
                    } else {
                        System.out.println("String " + s);
                    }
                }
            }
        }
    }
}
