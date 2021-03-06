package Homework.lesson_3;

    /*1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
      Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
      Посчитать, сколько раз встречается каждое слово.

      2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
      В этот телефонный справочник с помощью метода add() можно добавлять записи,
      а с помощью метода get() искать номер телефона по фамилии.
      Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
      тогда при запросе такой фамилии должны выводиться все телефоны.
      Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
      взаимодействие с пользователем через консоль и т.д).
      Консоль использовать только для вывода результатов проверки телефонного справочника.
    */

public class Main {
    public static void main(String[] args) {
        String[] wordsArr = {"cat", "dog", "student", "cat", "teacher", "man", "boobs", "kitty", "huawei", "dog", "dog", "boobs"};
        TestMap testMap = new TestMap();
        testMap.testMap(wordsArr);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("alex", "891069419490");
        phoneBook.add("inessa", "816972505026");
        phoneBook.add("alex", "8921564652961");
        phoneBook.add("alex", "8912239403476");

        System.out.println(phoneBook.get("alex"));
        System.out.println(phoneBook.get("inessa"));



    }

}
