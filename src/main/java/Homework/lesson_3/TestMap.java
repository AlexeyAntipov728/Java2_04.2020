package Homework.lesson_3;

import java.util.*;

public class TestMap {

//    Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать, сколько раз встречается каждое слово.

    private Map<String, Integer> map;

    public TestMap() {
        this.map = new HashMap<>();
    }

    public void testMap(String[] strings) {

        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);

        Set<String> uniqWords = new HashSet<>(Arrays.asList(strings));
        System.out.println(uniqWords);
    }

}
