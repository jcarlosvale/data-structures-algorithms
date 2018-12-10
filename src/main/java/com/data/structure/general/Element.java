package com.data.structure.general;

public class Element<T extends Comparable<T>> {
    private T value;

    public Element(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isEqualTo(T value) {
        return this.value.compareTo(value) == 0;
    }

    public boolean isLessThan(T value) {
        return this.value.compareTo(value) < 0;
    }

    public boolean isHigherThan(T value) {
        return this.value.compareTo(value) > 0;
    }
}
