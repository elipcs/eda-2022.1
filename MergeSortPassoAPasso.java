import java.util.Arrays;
import java.util.Scanner;

class MergeSortPassoAPasso {
    
    public static void main(String[] args) {
        int[] inteiros = getArray();
        sort(inteiros, 0, inteiros.length - 1);
        System.out.println(Arrays.toString(inteiros));
    }

    private static void sort(int[] array, int leftIndex, int rightIndex) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, leftIndex, rightIndex + 1)));
        if (leftIndex < rightIndex) {
			
			int middle = (leftIndex + rightIndex) / 2;
			sort(array, leftIndex, middle);
			sort(array, middle + 1, rightIndex);
			merge(array, leftIndex, middle, rightIndex);

            if (rightIndex - leftIndex < array.length-1) {
				System.out.println(Arrays.toString(Arrays.copyOfRange(array, leftIndex, rightIndex + 1)));
			}
		}
	}
	
	private static void merge(int[] array, int leftIndex, int middle, int rightIndex) {
		int[] helper = array.clone();
		for (int i = leftIndex; i <= rightIndex; i++) {
			helper[i] = array[i];
		}
		
		int i = leftIndex;
		int j = middle + 1;
		int k = leftIndex;
		
		while (i <= middle && j <= rightIndex) {
			
			if (helper[i] < (helper[j])) {
				array[k] = helper[i];
				i++;
			} else {
				array[k] = helper[j];
				j++;
			}
			k++;	
			
		}

		while (i <= middle) {
			array[k] = helper[i];
			i++;
			k++;
		}

		while (j <= rightIndex) {
			array[k] = helper[j];
			j++;
			k++;
		}

	}

    private static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] inteiros = new int[array.length];

        for (int i = 0; i < array.length; i++){
            inteiros[i] = Integer.parseInt(array[i]);
         }
        sc.close();

        return inteiros;
    }
}
