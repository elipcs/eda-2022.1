import java.util.Scanner;

class QuickSortPassoAPasso {
    public static void main(String[] args) {
        int[] inteiros = getArray();
        sort(inteiros, 0, inteiros.length - 1);
    }

    private static void sort(int[] array, int leftIndex, int rightIndex) {
		if (array.length == 0 || array.length == 1){
			return;
		}
		
		if (leftIndex < rightIndex) {
			int index_pivot = partition(array, leftIndex, rightIndex);
			sort(array, leftIndex, index_pivot - 1);
			sort(array, index_pivot + 1, rightIndex);	
			}
		}
	
	
	private static int partition(int[] array, int leftIndex, int rightIndex) {

		int pivot = array[leftIndex];
		int i = leftIndex;
			
		for (int j = i + 1; j <= rightIndex; j++) {
			if (array[j] < pivot) {
				i+=1;
				swap(array, i, j);
			}
		}
			
        swap(array,leftIndex,i);
		imprimeArray(array);
		return i;	
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

    private static void swap(int[] array, int i, int j) {
        int aux = array[j];
        array[j] = array[i];
        array[i] = aux;
    }

    private static void imprimeArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length - 1; i++) {
            result += array[i] + " ";
        }
        result += array[array.length - 1] + "";
        System.out.println(result);
    }
}
