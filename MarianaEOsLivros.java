import java.util.Scanner;

class MarianaEOsLivros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] livros = sc.nextLine().split(",");
        insertionSort(livros);
        sc.close();
    }

    private static void insertionSort(String[] array) {
        for (int i = 0; i < array.length; i++){
            String aux = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(aux) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = aux;
            System.out.println(toString(array));
        }	
	}

    private static String toString(String[] array) {
        String result = "";
		for (int i = 0; i < array.length - 1; i++) {
			result += array[i] + ", ";
		}
		result += array[array.length - 1];
		return result;
    }
}
