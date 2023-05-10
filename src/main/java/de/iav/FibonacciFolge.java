package de.iav;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciFolge {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        System.out.println("Please set the index of the fibanocci sequence: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] fibonacciSequence=FibonacciFolge(index);
        System.out.println("The fibonacci sequence with index " + index + " is: " + Arrays.toString(fibonacciSequence));

        }
        public static int [] FibonacciFolge(int fibonacciIndex) {

            int [] fibonacciSequence = new int[fibonacciIndex];
            for(int i = 0; i < fibonacciIndex; i++)
                if (i==0){
                    fibonacciSequence[i]=0;
                }
                else if(i==1){
                    fibonacciSequence[i]=1;
                }
                else {
                    fibonacciSequence[i] = fibonacciSequence[i-1]+fibonacciSequence[i-2];
                }



        return fibonacciSequence;
        }


}
