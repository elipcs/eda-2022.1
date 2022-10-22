import java.util.Scanner;

class Duplicados{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");
        String saida = "false";

        for (int i = 0; i < nums.length; i++){
            for (int o = 0; o < nums.length; o++){
                if (o != i && nums[i].equals(nums[o])){
                    saida = "true";
                }
            }
        }
        System.out.println(saida);
        sc.close();    
    }
}