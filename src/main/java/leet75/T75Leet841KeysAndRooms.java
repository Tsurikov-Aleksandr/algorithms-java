package leet75;

import java.util.*;

public class T75Leet841KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        deque.addLast(0);
        while (!deque.isEmpty()){
            int key = deque.pollFirst();
            set.add(key);
            for(int x : rooms.get(key)){
                if(!set.contains(x)){
                    deque.addLast(x);
                    set.add(x);
                }
            }
        }

        return rooms.size() == set.size();
    }
}
