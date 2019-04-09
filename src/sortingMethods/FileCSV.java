package sortingMethods;

import java.io.File;
import java.io.PrintWriter;


public class FileCSV {
	

	public static void main(String[] args) {
        try {

            ArrayGenerator arrayGenerator = new ArrayGenerator();
            ArraySorter sorter = new ArraySorter();

            

            PrintWriter pw = new PrintWriter(new File("C:\\Users\\Alin\\Desktop\\RESEARCH AND DEVELOPMENT\\1. SORTING METHODS\\books_table.csv"));
            StringBuilder sb = new StringBuilder();
            
           sb.append("Number of elements");
     	   sb.append(",");
     	   sb.append("Asignations BestCase BubbleSort");
     	   sb.append(",");
     	   sb.append("Asignations AverageCase BubbleSort");
     	   sb.append(",");
     	   sb.append("Asignations WorstCase BubbleSort");
     	   sb.append(",");
     	   sb.append("Asignations BestCase CountSort");
    	   sb.append(",");
    	   sb.append("Asignations AverageCase CountSort");
    	   sb.append(",");
    	   sb.append("Asignations WorstCase CountSort");
    	   sb.append(",");
    	   sb.append("Asignations BestCase InsertionSort");
    	   sb.append(",");
    	   sb.append("Asignations AverageCase InsertionSort");
    	   sb.append(",");
    	   sb.append("Asignations WorstCase InsertionSort");
    	   sb.append(",");
     	   sb.append("\r\n");
            
            for (int i=100; i<=10_000; i+=100) {
            
            int[] ascendingArray = arrayGenerator.generateAscendingArray(i);
            int[] randomArray = arrayGenerator.generateRandomArray(i);
            int[] descendingArray = arrayGenerator.generateDescendingArray(i);
            
            
        
            

            sb.append(i);
 		    sb.append(",");
            
            sb.append(sorter.sortArrayWithBubbleSortMethod(ascendingArray));
            sb.append(", ");
          
            sb.append(sorter.sortArrayWithBubbleSortMethod(randomArray));
            sb.append(", ");
       
            sb.append(sorter.sortArrayWithBubbleSortMethod(descendingArray));
            sb.append(", ");
            
            ascendingArray = arrayGenerator.generateAscendingArray(i);
            randomArray = arrayGenerator.generateRandomArray(i);
            descendingArray = arrayGenerator.generateDescendingArray(i);
            
            sb.append(sorter.sortArrayWithCountingSortMethod(ascendingArray));
            sb.append(", ");
          
            sb.append(sorter.sortArrayWithCountingSortMethod(randomArray));
            sb.append(", ");
       
            sb.append(sorter.sortArrayWithCountingSortMethod(descendingArray));
            sb.append(", ");
            

            ascendingArray = arrayGenerator.generateAscendingArray(i);
            randomArray = arrayGenerator.generateRandomArray(i);
            descendingArray = arrayGenerator.generateDescendingArray(i);
            
            sb.append(sorter.sortArrayWithInsertionSortMethod(ascendingArray));
            sb.append(", ");
          
            sb.append(sorter.sortArrayWithInsertionSortMethod(randomArray));
            sb.append(", ");
       
            sb.append(sorter.sortArrayWithInsertionSortMethod(descendingArray));
            sb.append(", ");
           
            sb.append("\r\n");
            
            }


            pw.write(sb.toString());
            pw.close();
            System.out.println("finished");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
