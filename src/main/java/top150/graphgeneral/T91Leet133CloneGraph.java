package top150.graphgeneral;

import java.util.HashMap;
import java.util.Map;

public class T91Leet133CloneGraph {
    private final Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfsclone(node);
    }

    private Node dfsclone(Node node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node clone = new Node(node.val);
        map.put(clone.val, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfsclone(neighbor));
        }

        return clone;
    }


}
