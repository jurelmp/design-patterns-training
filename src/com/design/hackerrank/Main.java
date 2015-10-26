package com.design.hackerrank;

/**
 * Created by Jurel on 10/26/2015.
 */
public class Main {

    public static void main(String args[]) {
        int numbers[] = {1, 3, 1, 2, 3, 4, 5};
        sort(numbers);
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public static int countDuplicates(int numbers[]) {
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            }
        }
        return 0;
    }

    public static void sort(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }


}
