import java.util.Scanner;

class WarmUp {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");
        String saida = "";

        for (int i = 0; i < nums.length; i++){
            saida += Integer.toString(Integer.parseInt(nums[i])*n) + " ";
        }

        System.out.println(saida.trim());
        sc.close();
    }   
    
}