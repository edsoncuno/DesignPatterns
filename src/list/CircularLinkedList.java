package list;

public class CircularLinkedList implements List {

    private Node lastNode;
    private int size;

    public CircularLinkedList() {
        lastNode = null;
        size = 0;
    }

    @Override
    public void add(int index, Object object) {
        if (index < 0 || index > size) {
            System.out.println("add: [0," + size + "]");
            return;
        } else {
            Node newNode = new Node(object);
            if (isEmpty()) {
                lastNode = newNode;
                newNode.setNext(newNode);
            } else {
                if (index == 0) {
                    newNode.setNext(lastNode.getNext());
                    lastNode.setNext(newNode);
                } else {
                    if (index == size) {
                        newNode.setNext(lastNode.getNext());
                        lastNode.setNext(newNode);
                        lastNode = newNode;
                    } else {
                        Node previousNode = getNode(index - 1);
                        newNode.setNext(previousNode.getNext());
                        previousNode.setNext(newNode);
                    }
                }
            }
            size++;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > (size - 1)) {
            System.out.println("remove: [0," + (size - 1) + "]");
            return;
        } else {
            if (index == 0) {
                if (size == 1) {
                    lastNode = null;
                } else {
                    lastNode.setNext(lastNode.getNext().getNext());
                }
            } else {
                if (index == (size - 1)) {
                    Node previousNode = getNode(index - 1);
                    previousNode.setNext(lastNode.getNext());
                    lastNode = previousNode;
                } else {
                    Node previousNode = getNode(index - 1);
                    previousNode.setNext(previousNode.getNext().getNext());
                }
            }
            size--;
        }
    }

    @Override
    public int indexOf(Object object) {
        int index;
        Node currentNode = lastNode.getNext();
        for (index = 0; index < size; index++) {
            currentNode = currentNode.getNext();
            if (object.equals(currentNode.getObject())) {
                break;
            }
        }
        return index = (index == size) ? -1 : index;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > (size - 1)) {
            System.out.println("get: [0," + (size - 1) + "]");
            return null;
        } else {
            return getNode(index).getObject();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private Node getNode(int index) {
        Node currentNode = lastNode.getNext();
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "()";
        } else {
            StringBuffer str = new StringBuffer();
            str.append("(");
            if (lastNode == lastNode.getNext()) {
                str.append(lastNode);
                str.append(")");
                return str.toString();
            } else {
                boolean firstObject = true;
                for (Node currentNode = lastNode.getNext(); currentNode != lastNode; currentNode = currentNode
                        .getNext()) {
                    if (firstObject == true) {
                        str.append(currentNode);
                        firstObject = false;
                    } else {
                        str.append(" ");
                        str.append(currentNode);
                    }
                }
                str.append(" ");
                str.append(lastNode);
                str.append(")");
                return str.toString();
            }
        }
    }

}
