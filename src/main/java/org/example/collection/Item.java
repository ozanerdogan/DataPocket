package org.example.collection;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Item<T> {
    private final T data;
    private Item<T> next;

}
