package list;

public interface List {

    void add(int index, Object object);

    void remove(int index);

    int indexOf(Object object);

    Object get(int index);

    boolean isEmpty();

    int size();

}