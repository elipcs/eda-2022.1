import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {
    public static void main(String[] args) {       
        int[] inteiros = getArray();
        selectionSort(inteiros, 0);
    }

    private static void selectionSort(int[] array, int i) {	
		if (i < array.length - 1) {
			int i_minimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i_minimo]) {
					i_minimo = j;
				}
			}
			swap(array, i, i_minimo);
			System.out.println(Arrays.toString(array));
			selectionSort(array, i + 1);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int aux = array[j];
		array[j] = array[i];
		array[i] = aux;
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
