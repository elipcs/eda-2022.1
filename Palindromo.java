class Palindromo{

    public static void main(String[] args) {
        char[] palavra = new char[]{'c','a','s','a'};
        System.out.println(eh_palindromo(palavra));
    }
    public static boolean eh_palindromo(char[] palavra){
        int i = 0, j = palavra.length - 1;
        
    while (i < j) {

        // If there is a mismatch
        if (palavra[i] != palavra[j])
            return false;

        i++;
        j--;
    }
    return true;
}
}