package stack.problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
* в стеке храним не текущую пару, а индекс с которого возможна опеределенная высота столбцов,
* если следующий столбец выше, то пушим его в стек как новый вариант высоты с данного индекса
* если следующий столбец меньше текущего значения в стеке, то достаем значение из стека и считаем вариант ответа
* т.к. дальше квадрат продлить нельзя (квадрат от того индекса где высота возможна до текущего)
*
* второй цикл это те высоты которые возможны до конца гистограммы
*
* */

public class Leet84LargestRectangleInHistogram {
    public record Pair(int index, int height) {
    }

    public static int largestRectangleArea(int[] heights) {
        int answer = 0;
        Deque<Pair> stack = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek().height() > heights[i]) {
                Pair prew = stack.pop();
                System.out.println("pop " + stack);
                answer = Math.max(answer, prew.height() * (i - prew.index()));
                System.out.println("answer = " + answer);
                start = prew.index();
            }
            stack.push(new Pair(start, heights[i]));
            System.out.println("push " + stack);
        }

        System.out.println("stack before step 2 " + stack);
        for (Pair p : stack) {
            answer = Math.max(answer, p.height * (heights.length - p.index()));
            System.out.println("temp answer = " + p.height * (heights.length - p.index()));
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] h1 = {2, 1, 5, 6, 2, 3}; // 10
        int[] h2 = {2, 4}; // 4

        System.out.println("max answer = " + largestRectangleArea(h1));
        Arrays.stream(h1).forEach(System.out::print);
    }
}
