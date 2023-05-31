package org.example.collection;

public interface IQueueCollection<T> {
    void push();
    T pop();
    T peek();
    int getSize();
    boolean isEmpty();
}
