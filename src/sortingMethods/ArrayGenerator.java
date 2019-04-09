package sortingMethods;

import java.util.Random;

public class ArrayGenerator {

	public int[] generateDescendingArray(int elements) {

		int[] descendingArray = new int[elements];

		for (int i = elements - 1; i >= 0; i--) {

			descendingArray[(elements - 1) - i] = i + 1;

		}
		return descendingArray;
	}

	public int[] generateRandomArray(int elements) {

		int[] randomArray = new int[elements];

		for (int i = 0; i < elements; i++) {
			Random randomNr = new Random();
			randomArray[i] = randomNr.nextInt(elements)+1;

		}

		return randomArray;
	}

	public int[] generateAscendingArray(int elements) {

		int[] ascendingArray = new int[elements];

		for (int i = 0; i < elements; i++) {

			ascendingArray[i] = i + 1;

		}

		return ascendingArray;

	}
}
