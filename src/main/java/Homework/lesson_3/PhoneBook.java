package Homework.lesson_3;

    /*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
      В этот телефонный справочник с помощью метода add() можно добавлять записи,
      а с помощью метода get() искать номер телефона по фамилии.
      Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
      тогда при запросе такой фамилии должны выводиться все телефоны.
      Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
      взаимодействие с пользователем через консоль и т.д).
      Консоль использовать только для вывода результатов проверки телефонного справочника.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> map;

    PhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String surname, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(surname)) {
            numbers = map.get(surname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(surname, numbers);

    }

    Set<String> get(String surname) {
        return map.get(surname);
    }

}
