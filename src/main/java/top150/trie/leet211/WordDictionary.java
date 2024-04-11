package top150.trie.leet211;

public class WordDictionary {

    private final WordDictionary[] children;
    private boolean isEnd;

    public WordDictionary() {
        children = new WordDictionary[26];
    }

    public void addWord(String word) {
        WordDictionary cur = this;
        char[] s = word.toCharArray();
        for (char ch : s) {
            int index = ch - 'a';
            if (cur.children[index] == null) {
                cur.children[index] = new WordDictionary();
            }
            cur = cur.children[index];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return searchHelper(this, word, 0);

    }

    private boolean searchHelper(WordDictionary cur, String word, int start) {
        int n = word.length();
        if (start == n) {
            return cur.isEnd;
        }

        char ch = word.charAt(start);

        if (ch != '.') {
            return cur.children[ch - 'a'] != null && searchHelper(cur.children[ch - 'a'], word, start + 1);
        }

        for (int i = 0; i < 26; i++) {
            if (cur.children[i] != null && searchHelper(cur.children[i], word, start + 1)) {
                return true;
            }
        }
        return false;
    }
}
