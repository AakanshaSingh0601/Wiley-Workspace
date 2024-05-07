package DSA;

import java.util.*;

public class GreedyAlgorithm {
        public static void main(String[] args) {
            int arr[]={1,3,4};
            int amt =10;
            Arrays.sort(arr);
            List<Integer> ans = new ArrayList<>();

            for(int i =arr.length-1;i>=0;i--){
                while(amt>=arr[i]){
                    amt -=arr[i];
                    ans.add(arr[i]);
                }
            }
            if(amt!=0) System.out.println("-1");
            else System.out.println(ans);
        }
    }


