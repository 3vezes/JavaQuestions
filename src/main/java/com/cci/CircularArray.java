package com.cci;

import com.google.common.collect.ForwardingList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Implement a Circular Array that supports an array-like data structure which
 * can be efficiently rotated. The class should use a generic type, and should
 * support iteration via the standard for (Obj o : circularAray) notation.
 */
public class CircularArray<T> extends ForwardingList<T> {

    private List<T> list = Lists.newArrayList();
    private int rotationPoint = 0;

    @Override
    public T get(int index) {
        if (index > rotationPoint -1) {
            return super.get(index % rotationPoint);
        } else {
            return super.get((index + rotationPoint));
        }
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.concat(subList(rotationPoint, list.size()).iterator()
                , subList(0, rotationPoint).iterator());
    }

    public int getRotationPoint() {
        return rotationPoint;
    }

    public void setRotationPoint(int rotationPoint) {
        this.rotationPoint = rotationPoint;
    }

    @Override
    protected List<T> delegate() {
        return list;
    }
}
