package hashmap;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicatesFromArray {
        public static void main(String[] args) {
            int[] arr1 = {2, 5, 3, 6, 7};
            int[] arr2 = {4, 2, 6, 8, 9};
            int total = countDuplicate(arr1, arr2);
            System.out.println("Duplicate Elements are: " + total);
        }
        public static int countDuplicate(int[] arr1, int[] arr2) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int count = 0;
            int i = 0, j = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            return count;
        }
    }
