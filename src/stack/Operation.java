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
public class Operation {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();

        while (choice != 4) {
            System.out.println("\nChoose one from the below option:");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    st.push(sc);
                    break;
                }
                case 2: {
                    st.pop();
                    break;
                }
                case 3: {
                    st.display();
                    break;
                }
                case 4: {
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please choose a valid option");
                }

            };

        }
    }

}
