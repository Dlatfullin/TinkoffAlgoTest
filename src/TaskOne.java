import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(piramid(5)));
    }

    public static int[] piramid(int n) {
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int h = (int)Math.pow(((2*j)-1), 2);
            sum += h;
            int count = (int)Math.pow(((2*j)-1), 3) - sum;
            arr[i] = count;
        }
        return arr;
    }
}
