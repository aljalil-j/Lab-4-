
public class Seacher {
	public static class LinearSearch {
		 
		public static int linearSearch(int[] inputArray,int key)
		{
	 
			for(int i=0;i<inputArray.length;i++)
			{
	            if(inputArray[i] == key)
	            {
	                return i;
	            }
	        }
	        return -1;
		}
	 
		public static void main(String args[])
		{
			int[] arr1 = {5,9,10,2,90,4};
			
			int key = 2;
			int result = linearSearch(arr1,key);
			System.out.println( (result != -1) ? "Required key:- "+key+" found at index:- "+result : "Key "+key+ " not found");
	 
			//try with another key
			key = 18;
			result = linearSearch(arr1,key);
			System.out.println( (result != -1) ? "Required key:- "+key+" found at index:- "+result : "Key "+key+ " not found");
	 
		}	
	}
	
	//binary search
	
	class BinarySearchExample{  
		 public void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public void main(String args[]){  
		        int arr[] = {10,20,30,40,50};  
		        int key = 30;  
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,key);     
		 }  
		}  

}
