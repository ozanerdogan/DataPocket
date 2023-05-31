package org.example.collection;

public class LinkedList<T> implements IListCollection<T> {
    private Item<T> head = null;
    private Item<T> tail = null;
    private int size = 0;

    @Override
    public void add(final T data) {
        if (isEmpty()) {
            head = new Item<T>(data);
            head.setNext(null);
            tail = head;

            size++;

            return;
        }

        final Item<T> newItem = new Item<T>(data);

        tail.setNext(newItem);
        newItem.setNext(null);
        tail = newItem;

        size++;
    }

    @Override
    public T removeByIndex(final int index) {
        Item<T> current = head;

        if (index == 0){
            head = head.getNext();

            size--;

            return current.getData();
        }

        int counter = 0;
        while (counter < index - 1){
            current = current.getNext();
            counter++;
        }

        final Item<T> oldNext = current.getNext();
        current.setNext(current.getNext().getNext());

        size--;

        return oldNext.getData();
    }

    @Override
    public T removeByData(final T data) {
        Item<T> current = head;

        if (data == null){
            System.out.println("Data is null");
            return null;
        }

        if (data.equals(head.getData())){
            head = head.getNext();
            return current.getData();
        }

        while (!data.equals(current.getNext().getData())){
            current = current.getNext();
        }

        final Item<T> oldNext = current.getNext();

        current.setNext(current.getNext().getNext());

        size--;

        return oldNext.getData();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
