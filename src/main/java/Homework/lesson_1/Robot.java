package Homework.lesson_1;

public class Robot implements Runable, Jumpable {

    private int runDistance;
    private int jumpHeight;
    private String name;

    public Robot(int runDistance, String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }


    public int getJumpHeight() {
        return jumpHeight;
    }

    public void jump() {
        System.out.println(this.name + " перепрыгнул " + jumpHeight);
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void run() {
        System.out.println(this.name + " пробежал " + runDistance);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
