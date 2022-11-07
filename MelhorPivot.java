import java.util.Scanner;

class MelhorPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = getArray(sc);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int melhorPivot = melhorPivot(array, i, j);
        System.out.println(melhorPivot);
        sc.close();
    }

    private static int melhorPivot(int[] array, int i, int j) {
        int result = 0;
        int countI = 0;
        int countJ = 0;

        for (int k = 0; k < array.length; k++) {
            if (array[k] < array[i]) {
                countI++;
            } else if (array[i] < array[k]) {
                countI--;
            }
            if (array[k] < array[j]) {
                countJ++;
            } else if (array[j] < array[k]) {
                countJ--;
            }
        }
        if (Math.abs(countI) <= Math.abs(countJ)) {
            result = i;
        } else {
            result = j;
        }

        return result;
    }

    private static int[] getArray(Scanner sc) {
        String[] inteiros = sc.nextLine().split(" ");
        int[] array = new int[inteiros.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inteiros[i]);
        }
        return array;
    }
}
