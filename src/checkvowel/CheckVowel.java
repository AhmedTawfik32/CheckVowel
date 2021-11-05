/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkvowel;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class CheckVowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your character: ");

        char c = input.next().toUpperCase().charAt(0);

        switch (c) {
            case 'A':
            case 'E':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("The character is Vowel");
                break;
            default:
                System.out.println("The character is not vowel");
                break;
        }

    }

}
