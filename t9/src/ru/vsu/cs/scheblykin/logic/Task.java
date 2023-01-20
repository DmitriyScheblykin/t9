package ru.vsu.cs.scheblykin.logic;

import java.util.ArrayList;

public class Task {
    public static void process(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(list.get(i));
        }
        int size = list.size() / 2;
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
    }
}
