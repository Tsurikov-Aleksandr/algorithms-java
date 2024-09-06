package all.easy;

public class Easy3206AlternatingGroupsI {
    public int numberOfAlternatingGroups(int[] colors) {
        int answer = 0;

        for (int i = 2; i < colors.length; i++) {
            if (colors[i] != colors[i - 1] && colors[i - 1] != colors[i - 2]) {
                answer++;
            }

        }

        if (colors[colors.length - 1] != colors[colors.length - 2] && colors[colors.length - 1] != colors[0]) {
            answer++;

        }

        if (colors[0] != colors[1] && colors[colors.length - 1] != colors[0]) {
            answer++;

        }

        return answer;
    }
}
