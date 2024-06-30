package all.easy;

public class Easy492ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int[] answer = new int[2];
        int l = (int) Math.sqrt(area);

        while (area % l != 0) {
            l--;
        }
        answer[0] = area / l;
        answer[1] = l;

        return answer;
    }
}
