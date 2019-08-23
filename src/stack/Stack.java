/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author nidhro
 */
public class Stack {

    int top;
    int maxSize = 10;
    int[] arr = new int[maxSize];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(Scanner sc) {
        if (top == maxSize - 1) {
            System.out.println("Overflow !!!");
            return false;
        } else {
            System.out.println("Enter Value: ");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item Pushed into array...");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return false;
        } else {
            top--;
            System.out.println("Item popped...");
            return true;
        }

    }

    void display() {
        System.out.println("Printing stack item...");
        for (int i = top; i >= 0; i--) {
            System.out.println("Stack Array: " + arr[i]);
        }
    }
}
