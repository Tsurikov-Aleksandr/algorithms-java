package all.easy;


public class Easy434NumberOfSegmentsString {
    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String[] list = s.split(" ");
        int answer = 0;
        for (String x : list) {
            if (!x.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
