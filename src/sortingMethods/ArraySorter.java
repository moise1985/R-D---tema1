package sortingMethods;

import java.util.Arrays;

public class ArraySorter {
	
	public int sortArrayWithBubbleSortMethod(int[] myArray) {

		int asig = 0;

		for (int i = 0; i < myArray.length - 1; i++) {
			asig += 2;
	
			for (int j = 0; j < myArray.length - i - 1; j++) {
				asig += 2;
				
				if (myArray[j] > myArray[j + 1]) {
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					asig += 4;
				}
			}

		}
		return asig;
	}

	public int sortArrayWithCountingSortMethod(int[] arr)  { 
		
        int max = Arrays.stream(arr).max().getAsInt(); 
        int min = Arrays.stream(arr).min().getAsInt(); 
        int range = max - min + 1; 
        int count[] = new int[range]; 
        int output[] = new int[arr.length]; 
        int asign = 0; 
        
        for (int i = 0; i < arr.length; i++)  
        { 
            count[arr[i] - min]++; 
            asign += 1;
        } 
  
        for (int i = 1; i < count.length; i++)  
        { 
            count[i] += count[i - 1]; 
            asign += 1;
        } 
  
        for (int i = arr.length - 1; i >= 0; i--)  
        { 
            output[count[arr[i] - min] - 1] = arr[i]; 
            count[arr[i] - min]--; 
            asign += 2;
        } 
  
        for (int i = 0; i < arr.length; i++) 
        { 
            arr[i] = output[i]; 
            asign += 1;
        } 
        
        return asign;
    }
	
	public int sortArrayWithInsertionSortMethod(int arr[]) 
    { 
        int n = arr.length; 
        int asign = 0;
   
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            asign += 5;
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
                asign += 3;
            } 
            
            arr[j + 1] = key; 
            asign++;
        } 
        return asign;
    }
}
