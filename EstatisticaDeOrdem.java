import java.util.Scanner;

class EstatisticaDeOrdem {
    public static void main(String[] args) {
        int[] inteiros = getArray();
        System.out.println(estatisticaDeOrdem(inteiros));
    }

    private static int estatisticaDeOrdem(int[] array) {
        int primeiro = array[0];
        boolean achou = false;
        int i = 0;
        while (i < array.length && !achou) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            swap(array, i, indexMin);

            if (primeiro == array[i]) {
                achou = true;
            }
            i++;
        }
        return i;
    }

    private static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] inteiros = new int[array.length];

        for (int i = 0; i < array.length; i++) {
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
}
