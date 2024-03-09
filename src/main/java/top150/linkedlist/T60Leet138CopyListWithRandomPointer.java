package top150.linkedlist;


import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



public class T60Leet138CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node curNode = head;
        while (curNode != null){
            Node copyNode = new Node(curNode.val);
            map.put(curNode, copyNode);
            curNode = curNode.next;
        }

        curNode = head;
        while (curNode != null){
            Node copyNode = map.get(curNode);
            copyNode.next = map.get(curNode.next);
            copyNode.random = map.get(curNode.random);
            curNode = curNode.next;
        }

        return map.get(head);
    }

}

