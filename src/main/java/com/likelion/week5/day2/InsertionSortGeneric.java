package com.likelion.week5.day2;

import java.util.Comparator;

public class InsertionSortGeneric<T> {

    Comparator<T> comp = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                return Integer.compare((Integer)o1, (Integer)o2);
            }
            else if (o1 instanceof Character && o2 instanceof Character) {
                return Character.compare((Character)o1, (Character)o2);
            }
            else {
                throw new IllegalArgumentException("Invalid types: " + o1.getClass() + " and " + o2.getClass());
            }
        }
    };

    public T[] sort(T[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? comp.compare(arr[j - 1],arr[j]) : comp.compare(arr[j],arr[j - 1])) > 0) { // 오름차순 : 내림차순
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }
        return arr;
    }

    public T[] sort(T[] arr) {
        return sort(arr, true);
    }
}
