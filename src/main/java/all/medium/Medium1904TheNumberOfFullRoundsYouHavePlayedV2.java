package all.medium;

public class Medium1904TheNumberOfFullRoundsYouHavePlayedV2 {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int startMin = calMin(loginTime);
        int endMin = calMin(logoutTime);

        if (startMin > endMin) {
            endMin += 24 * 60;
        }

        if (startMin % 15 != 0) {
            startMin += 15 - startMin % 15;
        }
        if (endMin % 15 != 0) {
            endMin -= endMin % 15;
        }
        if (endMin < startMin) {
            return 0;
        }

        return (endMin - startMin) / 15;
    }

    private int calMin(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3));
        return (h * 60) + m;
    }
}
