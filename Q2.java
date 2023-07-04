package test2;

public class Q2 {
    public static void fibbonacci(int n){
        int n1 = 0;
        int n2 = 1;
        

        for(int i=0;i<n;i++){

            System.out.print(n1 + "  ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        fibbonacci(n);
    }
}

