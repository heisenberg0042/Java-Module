package nov29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayclass {

    public static void main(String[] args) {

        String arr[] = new String[5];  // declaring an array

        int arr2[] = new int[5];

        System.out.println("Enter Values in array");

        Scanner sc=new Scanner(System.in);

        for (int i=0;i<arr.length;i++){   // iteration

            arr[i] = sc.nextLine();
        }

//        for(int i=0;i< arr.length;i++){
//
//            System.out.println(arr[i]);
//
//        }
//        System.out.println(Arrays.toString(arr));

        // for each

        for (String value : arr){

            System.out.println(value);
        }
    }
}
