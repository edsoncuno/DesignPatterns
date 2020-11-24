package memento;

import list.Stack;

public class Caretaker {

    private Stack stack;

    public Caretaker() {
        stack = new Stack();
    }

    public void push(Memento memento) {
        stack.push(memento);
    }

    public Memento pop() {
        return (Memento) stack.pop();
    }
}