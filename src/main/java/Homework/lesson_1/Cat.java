package Homework.lesson_1;

public class Cat implements Runable, Jumpable {
    private int runDistance;
    private int jumpHeight;
    private String name;

    public Cat(int runDistance, String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void jump() {
        System.out.println(this.name + " прыгнул на " + jumpHeight);
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void run() {

        System.out.println(this.name + " бежал " + runDistance);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
