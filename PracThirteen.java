import java.io.*;
import java.util.*;
public class PracThirteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option, c;
        System.out.println("Choice 1: Find the common elements between two arrays of integers");
        System.out.print("Choice 2: Remove duplicate elements from an array");
        System.out.print("\nChoice 3: Find the second largest element in an array");
        System.out.print("\nChoice 4: Find the second smallest element in an array");
        do {
            System.out.println("\nEnter your option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    int[] arr1= { 1,3,4,5,6 };
                    int[] arr2 = { 1,2,6,7,8 };
                    System.out.println("Array 1: "+ Arrays.toString(arr1));
                    System.out.println("Array 2: "+ Arrays.toString(arr2));
                    System.out.print("Common Elements: ");
                    Set<Integer> set = new HashSet<Integer>();
                    for (int i = 0; i < arr1.length; i++) {
                        for (int j = 0; j < arr2.length; j++) {
                            if (arr1[i] == arr2[j]) {
                                set.add(arr1[i]);
                                break;
                            }
                        }
                    }
                    for (Integer i : set) {
                        System.out.print(i + " ");
                    }
                    break;
                case 2:
                    int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
                    LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
                    // adding elements to LinkedHashSet
                    for (int i = 0; i < arr.length; i++)
                        set2.add(arr[i]);
                    // Print the elements of LinkedHashSet
                    System.out.print(set2);
                    break;
                case 3:
                    int i, first, second;
                    int arr3[] = {12, 35, 1, 10, 34, 1};
                    int n = arr3.length;
                    // There should be atleast two elements
                    if (n < 2) 
                    {
                        System.out.printf(" Invalid Input ");
                    }
                    // Sort the array
                    Arrays.sort(arr3);
                    // Start from second last element as the largest element is at last
                    for (i = n - 2; i >= 0; i--) 
                    {
                        // If the element is not equal to largest element
                        if (arr3[i] != arr3[n - 1])
                        {
                            System.out.printf("The second largest element is "+ arr3[i]);
                            break;
                        }
                    }   
                    break;
                case 4:
                    int arr4[] = { 11, 13, 25, 9, 34, 1 };
                    int size = arr4.length;
                    // sorting the array using in-built sort function
                    Arrays.sort(arr4);
                    System.out.println("The second smallest element is " + arr4[1]);
                    break;
            }
            System.out.println("\nDo you want to continue(enter 1 for yes else no): ");
            c = sc.nextInt();
        } while (c == 1);
    }
}
