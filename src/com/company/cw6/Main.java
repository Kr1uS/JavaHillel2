package com.company.cw6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        setList(list);
        showList(list);

        System.out.println(list);


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("2");
        System.out.println(linkedList);

    }

    private static void setList(List<String> list) {
        for (int i = 0; i < 10; ++i) {
            list.add(String.valueOf(i));
        }
    }
    private static void showList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }


    private static void notes() {
        int n = 10;
        String[] strings = new String[n]; //array (массив стрингов)
        int arrL = strings.length;
        String arrElem = strings[4];
        strings[5] = "text";

        List<String> stringList = new ArrayList<>(); //list (список стрингов)
        int listL = stringList.size();
        String listElem = stringList.get(4);
        String oldElem = stringList.set(5, "text"); //устанавливает 5 элементу значение text

        stringList.add("newText"); //добавляет в конец
        stringList.add(5, "newText"); //вставляет в 5 индекс, здвигая остальные

        stringList.remove(3); //(элементы сдвигаются влево на 1)
    }
}
