package Homework.lesson_1;

public class Treadmill {
    int distance;
    String name;

    public Treadmill(int distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public boolean take(Runable runable) {
        runable.run();
        if (getDistance() <= runable.getRunDistance()) {
            System.out.println(" cмог пробежать " + getDistance());
            return true;
        } else {
            System.out.println(" не смог пробежать " + getDistance());
            return false;
        }
    }
}
