package DataStructures.Basic;

import java.util.Arrays;

public class Array_Subset_of_another_array {

    public static void main(String[] args) {

        long a1[] = {484, 595, 9595, 959, 5985};
        long a2[] = {959, 5985};

        System.out.println(isSubset(a1, a2, a1.length, a2.length));
        

    }

    public static String isSubset(long a1[], long a2[], long n, long m) {

        if (m > n)
            return "No";

        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean elementFound = false;
        int j = 0;
        int i = 0;

        for (i = 0; i < a2.length; i++) {
            j = 0;
            while (i + j < a1.length && a1[i + j] <= a2[i]) {
                if (a1[i + j] == a2[i]) {
                    elementFound = true;
                }
                j++;
            }
            if (elementFound == false) 
                return "No";
            elementFound = false;
        }
        return "Yes";
    }
}