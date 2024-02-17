package top150.arraystring;

import java.util.ArrayList;
import java.util.List;

public class T24Leet68TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> answer = new ArrayList<>();
        List<String> curLine = new ArrayList<>();
        int width = 0;

        for (String word : words) {
            if (width + word.length() + curLine.size() > maxWidth) {
                int spaces = maxWidth - width;
                int gaps = curLine.size() - 1;
                if (gaps == 0) {
                    answer.add(curLine.get(0) + " ".repeat(spaces));
                } else {
                    int spacePerGap = spaces / gaps;
                    int extraSpaces = spaces % gaps;
                    StringBuilder line = new StringBuilder();
                    for (int i = 0; i < curLine.size(); i++) {
                        line.append(curLine.get(i));
                        if (i < gaps) {
                            line.append(" ".repeat(spacePerGap));
                            if (i < extraSpaces) {
                                line.append(' ');
                            }
                        }
                    }
                    answer.add(line.toString());
                }
                curLine.clear();
                width = 0;
            }
            curLine.add(word);
            width += word.length();
        }

        StringBuilder lastLine = new StringBuilder(String.join(" ", curLine));
        while (lastLine.length() < maxWidth) {
            lastLine.append(' ');
        }
        answer.add(lastLine.toString());

        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));
    }

}
