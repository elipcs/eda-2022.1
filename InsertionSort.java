import java.util.Arrays;
import java.util.Scanner;


class InsertionSortRecursivo {

    public static void main(String[] args) {       
        int[] inteiros = getArray();
        insertionSort(inteiros,1);
        
    }

    private static void insertionSort(int[] array, int n) {
        if (n < array.length) {
			int key = array[n];
			int j = n - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
			System.out.println(Arrays.toString(array));
			insertionSort(array, n + 1);
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