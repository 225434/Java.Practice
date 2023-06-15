import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            a[i] = sc.nextInt();
        }
        int[] new_a = new int[a.length+1];
        for(int n:a){
            System.out.println(n);
        }
        System.arraycopy(a, 0, new_a, 0, a.length);
        new_a[new_a.length-1] = sc.nextInt();
        Arrays.sort(new_a,0,new_a.length);
        for(int na:new_a){
            System.out.println(na);
        }
    }
}
