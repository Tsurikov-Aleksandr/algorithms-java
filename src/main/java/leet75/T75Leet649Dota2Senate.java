package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet649Dota2Senate {
    public String predictPartyVictory(String senate) {
        Deque<Integer> dir = new ArrayDeque<>();
        Deque<Integer> rad = new ArrayDeque<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rad.addLast(i);
            } else {
                dir.addLast(i);
            }
        }

        while (!dir.isEmpty() && !rad.isEmpty()) {
            if (dir.peekFirst() < rad.peekFirst()) {
                rad.pollFirst();
                dir.addLast(dir.pollFirst() + senate.length());
            } else {
                dir.pollFirst();
                rad.addLast(rad.pollFirst() + senate.length());
            }
        }

        return dir.isEmpty() ? "Radiant" : "Dire";
    }
}
