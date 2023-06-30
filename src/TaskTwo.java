import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Queue<Integer> mainArray = new LinkedList<>();
        List<Integer> exitFromQue = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int row = scanner.nextInt();

            if (row == 1) {
                int addElement = scanner.nextInt();
                mainArray.offer(addElement);
            } else if (row == 2) {
                Queue<Integer> expandQue = new LinkedList<>();


                while(!mainArray.isEmpty()) {
                    int element = mainArray.poll();
                    expandQue.offer(element);
                    expandQue.offer(element);
                }

                mainArray = expandQue;
            } else if (row == 3) {
                exitFromQue.add(mainArray.peek());
                mainArray.remove();
            }
        }

        for (Integer integer : exitFromQue) {
            System.out.println(integer);
        }

    }
}

