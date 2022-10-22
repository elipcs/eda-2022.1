import java.util.Arrays;
import java.util.Scanner;


class TrocaVizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] v = new int[array.length];
    
        for (int i = 0; i < array.length; i++){
            v[i] = Integer.parseInt(array[i]);
        } 

        troca_vizinhos(v);
        System.out.println(Arrays.toString(v));
        sc.close();
    }


    public static void troca_vizinhos(int[] v){
        if (v.length % 2 == 0){
            for (int i = 0; i < v.length - 1; i += 2){
                int num = v[i];
                int vizinho = v[i+1];
                v[i] = vizinho;
                v[i+1] = num;
            }
        }

        else{
            for (int i = 0; i < v.length - 2; i += 2){
                int num = v[i];
                int vizinho = v[i+1];
                v[i] = vizinho;
                v[i+1] = num;
            }
        }
    }
}

