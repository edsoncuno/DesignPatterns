package list;

public class Queue extends CircularLinkedList {

    public Object push(Object object) {
        super.add(super.size(), object);
        return object;
    }

    public Object front() {
        if (super.isEmpty()) {
            return null;
        } else {
            return super.get(0);
        }
    }

    public Object pop() {
        Object object = front();
        super.remove(0);
        return object;
    }
}
