package dsa.stacks;

public class ArrayStack<E> implements Stack<E> {

public static final int CAPACITY = 1000;
private E[] data;
private int t = -1;

public ArrayStack() {
    this(CAPACITY);
}

public ArrayStack(int capacity) {
    data = (E[]) new Object[capacity];
}

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E pop() {
       if(isEmpty())
            return null;
        E e = data[t];
        data[t--] = null;
        return e;
    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];
    }

    @Override
	public void push(E e)  throws IllegalArgumentException{
        if(size() == data.length)
        throw new IllegalArgumentException("Stack is full");	
        data[++t] = e;
    }
}

   
