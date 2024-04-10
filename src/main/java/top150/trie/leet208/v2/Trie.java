package top150.trie.leet208.v2;

class Node {
    public Node[] children;
    public boolean exists = false;
    public String val;

    public Node() {
        this.children = new Node[26];
    }

    public Node(String val) {
        this.val = val;
    }

    public boolean isLeaf() {
        return this.val != null;
    }
}

class Trie {
    private final Node root;

    public Trie() {
        this.root = new Node();
    }

    private int charAt(String s, int pos) {
        return (int) (s.charAt(pos)) - (int) ('a');
    }

    public void insert(String word) {
        this._insert(word, this.root, 0);
    }

    private void _insert(String word, Node root, int lo) {
        int pos = charAt(word, lo);
        Node match = root.children[pos];
        if (match == null) {
            root.children[pos] = new Node(word);
            return;
        }
        if (lo == word.length() - 1) {
            match.exists = true;
        } else {
            if (match.isLeaf()) {
                Node newNode = new Node();
                root.children[pos] = newNode;
                this._insert(match.val, root, lo);
                match = newNode;
            }
            this._insert(word, match, lo + 1);
        }
    }

    public boolean search(String word) {
        return this._search(word, this.root, 0);
    }

    public boolean _search(String word, Node root, int lo) {
        int pos = charAt(word, lo);
        Node match = root.children[pos];
        if (match == null) {
            return false;
        }
        if (lo == word.length() - 1) {
            return match.exists || word.equals(match.val);
        }
        if (match.isLeaf()) {
            return word.equals(match.val);
        }
        return this._search(word, match, lo + 1);
    }

    public boolean startsWith(String prefix) {
        return this._startsWith(prefix, this.root, 0);
    }

    public boolean _startsWith(String word, Node root, int lo) {
        int pos = charAt(word, lo);
        Node match = root.children[pos];
        if (match == null) {
            return false;
        }
        if (match.isLeaf()) {
            return match.val.startsWith(word);
        }
        if (lo == word.length() - 1) {
            return true;
        }
        return this._startsWith(word, match, lo + 1);
    }
}

