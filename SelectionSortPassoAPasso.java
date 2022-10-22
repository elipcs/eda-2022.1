import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {
    public static void main(String[] args) {       
        int[] inteiros = getArray();
        selectionSort(inteiros);
    }

    private static void selectionSort(int[] array) {	
        int i_minimo;
		for (int i = 0; i < array.length; i++) {
			i_minimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i_minimo]) {
					i_minimo = j;
				}
			}
			swap(array, i_minimo, i);
			if (i_minimo != i) {
				System.out.println(Arrays.toString(array));
			}
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
