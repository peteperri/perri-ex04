/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Exercise:
Create a simple mad-lib program that prompts for a noun,
\a verb, an adverb, and an adjective and injects those
into a story that you create.

Pseudocode:
create a new scanner called 'input'
create string variables 'noun', 'verb', 'adv', and 'adj'
prompt the user for a noun, and assign their input to the 'noun' variable
repeat above for each remaining part of speech
print the parts of speech into a mad lib using a formatted print statement

 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun, verb, adv, adj;

        System.out.println("Enter a noun: ");
        noun = input.nextLine();

        System.out.println("Enter a verb: ");
        verb = input.nextLine();

        System.out.println("Enter an adverb: ");
        adv = input.nextLine();

        System.out.println("Enter an adjective: ");
        adj = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}
