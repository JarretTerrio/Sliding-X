package com.wjbfj;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by jarretterrio on 7/27/16.
 */

public class animation
{
         public static void main(String[] args) throws InterruptedException
         {
             // Say hello to our users
             System.out.print("Welcome,please enter an integer between 0 and 5");
             int oldnum = 0;

             // Infinite for loop, to keep the program running
             for (;;) {
                 Scanner loggedint = new Scanner(System.in);
                 int input = 0;

                 // Incase the user enters in something other than a number
                 try {
                     System.out.print("\nEnter a number: ");
                     input = loggedint.nextInt();
                     String[] switcher = {"\rx-----", "\r-x----", "\r--x---", "\r---x--", "\r----x-", "\r-----x"};

                     if (input >= 6) {
                        System.out.print("ERROR: Please enter an integer less than 6.");
                    } else {
                        if (input < 0) {
                            System.out.print("ERROR: Please enter an integer greater than 0.");
                        } else {
                            if (input > oldnum){
                                for (int i = oldnum; i <= input; i++) {
                                    System.out.print(switcher[i]);
                                    TimeUnit.MILLISECONDS.sleep(200);
                                }
                            } else if (input < oldnum) {
                                for (int i = oldnum; i >= input; i--) {

                                    System.out.print(switcher[i]);
                                    TimeUnit.MILLISECONDS.sleep(200);
                                }
                            } else {
                                System.out.print(switcher[input]);
                            }
                            oldnum = input;
                        }
                    }
                 } catch(Exception _) {
                     System.out.println("ERROR: Please enter an integer.");
                 }

            }
        }
}
