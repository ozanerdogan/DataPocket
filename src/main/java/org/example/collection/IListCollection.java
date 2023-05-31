package org.example.collection;

public interface IListCollection<T> {
    void add(T data);
    T removeByIndex(int index);
    T removeByData(T data);
    int getSize();
    boolean isEmpty();

}
