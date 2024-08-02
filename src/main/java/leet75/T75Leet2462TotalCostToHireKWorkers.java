package leet75;

import java.util.PriorityQueue;
import java.util.Queue;

public class T75Leet2462TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        Queue<Integer> start = new PriorityQueue<>();
        Queue<Integer> end = new PriorityQueue<>();

        for (int i = 0; i < candidates; i++) {
            start.add(costs[i]);
        }
        for (int i = Math.max(candidates, costs.length - candidates); i < costs.length; i++) {
            end.add(costs[i]);
        }

        long answer = 0;

        int head = candidates;
        int tail = costs.length - candidates - 1;

        for (int i = 0; i < k; i++) {
            if (end.isEmpty() || (!start.isEmpty() && start.peek() <= end.peek())) {
                answer += start.poll();
                if (head <= tail) {
                    start.add(costs[head]);
                    head++;
                }
            } else {
                answer += end.poll();
                if (head <= tail) {
                    end.add(costs[tail]);
                    tail--;
                }
            }
        }

        return answer;
    }
}
