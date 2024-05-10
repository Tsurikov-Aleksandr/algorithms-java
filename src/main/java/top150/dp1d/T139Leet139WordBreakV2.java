package top150.dp1d;

import java.util.List;

public class T139Leet139WordBreakV2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] table = new boolean[s.length()];

        for (int i = 0; i < table.length; i++) {
            for (int x = 0; x <= i; x++) {
                if (x == 0 || table[x - 1]) {
                    if (wordDict.contains(s.substring(x, i + 1))) {
                        table[i] = true;
                        break;
                    }
                }
            }
        }

        return table[table.length - 1];
    }
}
