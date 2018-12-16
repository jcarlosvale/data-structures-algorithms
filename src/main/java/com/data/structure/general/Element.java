package com.data.structure.general;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Element{" + "value=" + value + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Element<?> element = (Element<?>) o;
        return Objects.equals(value, element.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
