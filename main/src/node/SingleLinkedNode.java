package node;

public class SingleLinkedNode {
    private SingleLinkedNode next;

    private int data;

    public SingleLinkedNode(SingleLinkedNode next, int data) {
        this.next = next;
        this.data = data;
    }

    public void setNext(SingleLinkedNode next) {
        this.next = next;
    }

    public SingleLinkedNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
