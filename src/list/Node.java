package list;

public class Node {

    private Object object;
    private Node next;

    public Node(Object object) {
        this.object = object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(object);
    }

}
