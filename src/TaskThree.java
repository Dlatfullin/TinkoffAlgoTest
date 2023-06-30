import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // строка
        int m = scanner.nextInt(); // столбец
        int q = scanner.nextInt();


        int rooms[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rooms[i][j] = scanner.nextInt();
            }
        }


        int person[][] = new int[q][3];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                person[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < q; i++) {
            int roomsAvailable = 0;
            int x = person[i][0]-1;
            int y = person[i][1]-1;
            int danger = rooms[x][y];
            int endurance = person[i][2]; // k


            for (int k = 0; k < m; k++) {
                    int ait = rooms[x][k];
                    if(y != k) {
                        int solv = Math.abs(ait - danger);
                        if (solv <= endurance) {
                            roomsAvailable++;
                        }
                    }
                }

                for (int k = 0; k < n; k++) {
                    int ati = rooms[k][y];
                    if (k != x) {
                        int solv = Math.abs(ati - danger);
                        if (solv <= endurance) {
                            roomsAvailable++;
                        }
                    }
                }
            System.out.println(roomsAvailable);
        }

    }
}
