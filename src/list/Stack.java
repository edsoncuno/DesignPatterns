package list;

public class Stack extends CircularLinkedList {

    public Object peek() {
        if (super.isEmpty()) {
            return null;
        } else {
            return super.get(0);
        }
    }

    public Object pop() {
        if (super.isEmpty()) {
            return null;
        } else {
            Object object = super.get(0);
            super.remove(0);
            return object;
        }
    }

    public Object push(Object object) {
        super.add(0, object);
        return object;
    }

}
