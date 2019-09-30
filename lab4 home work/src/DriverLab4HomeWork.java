import java.util.Scanner;

public class DriverLab4HomeWork {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //allow user  input;
        System.out.println("input five numbers");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }

        //you notice that now the elements have been stored in the array .. array[]

        System.out.println("These are the numbers you have entered.");
        printArray(array);

        input.close();

    }

    //this method prints the elements in an array......
    //if this case is true, then that's enough to prove to you that the user input has  //been stored in an array!!!!!!!
    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    
        }
        System.out.println("Enter the operation you would like to perform.");
        System.out.println(" enter (1) to linearSearch");
        System.out.println(" enter (2) to binarySearch");
        System.out.println(" enter (3) to bubbleSort");
        System.out.println(" enter (4) to selectionSort");
        System.out.println(" enter (5) to insertionSort");
        
        
        System.out.println(" Big O Notation for bubbleSort");
        System.out.println(" O(bubbleSort) = 1+1 n(n(1))");
        System.out.println(" O(bubbleSort) = 2 + n(n(1)");
        System.out.println(" O(bubbleSort) = 2 + n2");
        System.out.println(" O(bubbleSort) = 0+ n2");
        System.out.println(" O(bubbleSort) =  Quadratic");
        
    }
   
   
	}


