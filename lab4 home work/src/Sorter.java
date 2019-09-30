
public class Sorter {
	
		static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0; i < n; i++){
		for(int j=1; j < (n-i); j++){
		if(arr[j-1] > arr[j]){
		//swap elements.

}
}
}
}
		public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  	
		public static void main(String[] args) {  
		    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		    for(int k=1; k<10; k++)   
		    {  
		        int temp = a[k];  
		        int j= k-1;  
		        while(j>=0 && temp <= a[j])  
		        {  
		            a[j+1] = a[j];   
		            j = j-1;  
		        }  
		        a[j+1] = temp;  
		    }  
		    System.out.println("printing sorted elements ...");  
		    for(int i=0;i<10;i++)  
		    {  
		        System.out.println(a[i]);  
		    }  
		}  
}