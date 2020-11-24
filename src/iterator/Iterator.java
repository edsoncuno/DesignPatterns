package iterator;

import list.*;

public class Iterator {
    private CircularLinkedList list;
    private int index;
    private int sw;

    public Iterator(CircularLinkedList x) {
        list = x;
        index = 0;
        sw = 0;
    }

    public Object first() {
        index = 0;
        return list.get(index);
    }

    public Object last() {
        index = list.size() - (1 + 2 * sw);
        return list.get(index);
    }

    public Object center() {
        index = (list.size() - (1 + 2 * sw)) / 2;
        return list.get(index);
    }

    public Object next() {
        index++;
        if (index > list.size() - (1 + 2 * sw)) {
            index = 0;
        }
        return list.get(index);
    }

    public Object back() {
        index--;
        if (index < 0) {
            index = list.size() - (1 + 2 * sw);
        }
        return list.get(index);
    }

    public void sw() {
        sw = (sw == 0) ? 1 : 0;
    }

}
