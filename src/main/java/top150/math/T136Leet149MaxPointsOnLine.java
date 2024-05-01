package top150.math;

public class T136Leet149MaxPointsOnLine {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int answer = 2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 2;
                for (int k = j + 1; k < n; k++) {
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if (x == y) {
                        temp++;
                    }
                }

                if (temp > answer) {
                    answer = temp;
                }
            }
        }

        return answer;
    }
}
