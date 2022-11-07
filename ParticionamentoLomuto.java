import java.util.Arrays;
import java.util.Scanner;

public class ParticionamentoLomuto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = getArray(sc);
        particionaLomuto(array, 0 , array.length - 1);
        sc.close();
        System.out.println(Arrays.toString(array));
    }

    private static int particionaLomuto(int[] array, int leftIndex, int rightIndex) {
        int i = leftIndex;

        for (int j = leftIndex + 1; j <= rightIndex; j++) {
            if (array[j] < (array[leftIndex])) {
                i++;
                swap(array, i, j);
                System.out.println(Arrays.toString(array));
            }
        }
        swap(array, leftIndex, i);
        System.out.println(Arrays.toString(array));
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static int[] getArray(Scanner scanner) {
        String[] entrada = scanner.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(entrada[i]);
		}
		return array;
    }

}