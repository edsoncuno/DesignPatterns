package singleton;

import list.*;

public class Singleton {

    private static Singleton _instance;
    private CircularLinkedList list;

    static {
        Singleton._instance = null;
    }

    private Singleton() {
        list = new CircularLinkedList();
    }

    public static Singleton getSingleton() {
        if (Singleton._instance == null) {
            Singleton._instance = new Singleton();
        }
        return Singleton._instance;
    }

    public CircularLinkedList abrirSesion(String x) {
        list.add(0, x);
        return list;
    }

    public CircularLinkedList cerrarSesion(String x) {
        int index = list.indexOf(x);
        if (index >= 0) {
            list.remove(index);
        }
        return list;
    }

}