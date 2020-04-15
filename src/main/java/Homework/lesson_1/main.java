package Homework.lesson_1;

public class main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(50, "road");
        Wall wall = new Wall(5, "wall");
        treadmill.take(new Cat(10, "barsik", 20));
        wall.take(new Cat(10, "barsik", 20));

        System.out.println("=======================");


        Runable[] runables = {
                new Cat(10, "Kitty", 20),
                new Human(10, "Alex", 20),
                new Robot(10, "Chappy", 20)
        };

        Treadmill[] treadmills = {
                new Treadmill(25, "distance 1"),
                new Treadmill(18, "distance 2"),
        };


        for (int i = 0; i < runables.length; i++) {
            for (int j = 0; j < treadmills.length; j++) {

                if (treadmills[j].take(runables[i]))

                    System.out.println(runables[i] + " успешно прошел дистанцию: " + treadmills[j].getName() + "\n");
                else
                    System.out.println(runables[i] + " не смог пройти дистанцию:  " + treadmills[j].getName() + "\n");
            }

        }
    }
}
