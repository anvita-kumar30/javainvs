import java.util.*;

public class PracThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{5,6,7,8,9};
        int option, z;
        int val, index;
        do{
            System.out.println("\n1. Test if an array contains a specific value\n2. Remove a specific element from an array\n3. Insert an element at specific position into an array\n4. Find the maximum and minimum value of an array");
            System.out.println("Enter your option: ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter a value: ");
                    val=sc.nextInt();
                    for(int i=0; i<arr.length; i++){
                        if(arr[i]==val){
                            System.out.println("The value "+ val+ " is present in the array");
                        }
                    }
                    break;
                case 2: 
                    int index1=-1;
                    System.out.println("Enter the element to be removed: ");
                    val=sc.nextInt();
                    for(int i = 0; i < arr.length; i++) {
                        if (arr[i] == val) {
                            index1 = i;
                            break;
                        }
                    }
                    if (index1 != -1) {
                        // shift all the element from index+1 by one position to the left
                        for (int i = index1; i < arr.length - 1; i++)
                            arr[i] = arr[i + 1];
                        System.out.println("New Array: ");
                        for (int i = 0; i < arr.length - 1; i++)
                            System.out.print("\t"+arr[i]);
                    } 
                    else
                        System.out.println("Element Not Found\n");
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted and it's index: ");
                    val=sc.nextInt();
                    index=sc.nextInt();
                    System.out.println("Original Array : "+ Arrays.toString(arr));
                    for(int i=arr.length-1 ; i>index; i--){
                        arr[i]=arr[i-1];
                    }
                    arr[index]=val;
                    System.out.println("New Array: "+Arrays.toString(arr));
                    break;
                case 4:
                    int max=arr[0];
                    for(int i=0; i<arr.length; i++){
                        if(arr[i]>max){
                            max=arr[i];
                        }
                    }
                    System.out.println("The maximum value present in the array is: "+max);
                    int min=arr[0];
                    for(int i=0; i<arr.length; i++){
                        if(arr[i]<min){
                            min=arr[i];
                        }
                    }
                    System.out.println("The minimum value present in the array is: "+min);
                    break;
            }
            System.out.println("Do you want to continue(enter 1 for yes else no): ");
            z=sc.nextInt();
        }while(z==1);
    }
}
