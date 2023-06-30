import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < q; i++) {

            int l = scanner.nextInt();
            int r = scanner.nextInt();

            //multiple
            Integer multiple = 1;
            for (int j = l; j <= r; j++) {
                multiple*=j;
            }
            if(multiple <= 9) { answer.add(multiple); }
            else {
                String[] arr = multiple.toString().split("");

                //sum
                Integer sum = 0;
                for (String s : arr) {
                    sum+=Integer.parseInt(s);
                }
                if(sum <= 9) {answer.add(sum);}
                else {
                    arr = sum.toString().split("");
                    int newSum = 0;
                    for (String s : arr) {
                        newSum+=Integer.parseInt(s);
                    }
                    answer.add(newSum);
                }
            }
        }

        for (Integer integer : answer) {
            System.out.println(integer);
        }
    }
}
