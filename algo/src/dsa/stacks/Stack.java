package dsa.stacks;

public interface Stack<E> {
    int size();
    boolean isEmpty();
    E pop();
    E top();
    void push(E e);
}