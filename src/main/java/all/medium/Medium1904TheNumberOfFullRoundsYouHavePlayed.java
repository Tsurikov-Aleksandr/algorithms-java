package all.medium;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Medium1904TheNumberOfFullRoundsYouHavePlayed {
    public int numberOfRounds(String loginTime, String logoutTime) {
        LocalTime login = LocalTime.parse(loginTime);
        LocalTime logout = LocalTime.parse(logoutTime);

        if (login.isBefore(logout) && ChronoUnit.MINUTES.between(login, logout) < 15) {
            return 0;
        }

        LocalTime loginOriginal = LocalTime.parse(loginTime);
        LocalTime logoutOriginal = LocalTime.parse(logoutTime);

        login = login.truncatedTo(ChronoUnit.HOURS)
                .plusMinutes(15 * (login.getMinute() / 15))
                .plusMinutes(login.getMinute() % 15 == 0 ? 0 : 15);

        logout = logout.truncatedTo(ChronoUnit.HOURS)
                .plusMinutes(15 * (logout.getMinute() / 15));

        int answer = 0;

        if (logoutOriginal.isBefore(loginOriginal)) {
            if (login.equals(logout)) {
                return 0;
            }

            LocalTime midnight = LocalTime.MIDNIGHT;

            if (!login.equals(midnight)) {
                long differenceBetweenLoginAndMidnight = ChronoUnit.MINUTES.between(midnight, login);
                long differenceToMidnight = 1440 - differenceBetweenLoginAndMidnight;// 24h * 60m = 1440}
                answer += (int) differenceToMidnight / 15;
            }

            long differenceAfterMidnight = ChronoUnit.MINUTES.between(midnight, logout);
            answer += (int) differenceAfterMidnight / 15;

        } else {
            long differenceloginLogout = ChronoUnit.MINUTES.between(login, logout);
            answer += (int) differenceloginLogout / 15;
        }

        return Math.max(answer, 0);
    }
}
