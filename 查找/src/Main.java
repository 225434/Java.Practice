import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,6,56,4,34,2,5,5,43,6,353};
        int n = array.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the key:");
        int key = sc.nextInt();
        System.out.println(BinarySearch(array,0,n,key));
    }

    public static boolean RecursionBinarySearch(int[] array,int low,int high,int key) {
        Arrays.sort(array);
        if (array[low] > key || array[high] < key || low > high)
            return false;
        int middle = (low + high) / 2;
        if (array[middle] < key)
            return RecursionBinarySearch(array,middle + 1,high,key);
        else if(array[middle] > key)
            return RecursionBinarySearch(array,low,middle - 1,key);
        else
            return true;
    }

    public static boolean BinarySearch(int[] array,int low,int high,int key) {
        Arrays.sort(array);
        if (array[low] > key || array[high] < key || low > high)
            return false;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] < key)
                low = middle + 1;
            else if(array[middle] > key)
                high = middle - 1;
            else
                return true;
        }
        return false;
    }
}
