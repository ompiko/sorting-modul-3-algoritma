/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionSort;

import java.util.Scanner;

/**
 *
 * @author omPiko
 */
public class Main {
    public static void main(String[] args) {
        String a[];
        Scanner in = new Scanner(System.in);
        System.out.print("input long array: ");
        int longIndexArray = in.nextInt();
        a = new String [longIndexArray];
        for (int i = 0; i < a.length; i++) {
            System.out.print("input string"+i);
            a[i] = in.next();
        }
        processSelection.selection(a);
    }
}
