package Homework.lesson_1;

public class Wall {
    int height;
    String name;

    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public boolean take(Jumpable jumpable) {
        jumpable.jump();

        if (getHeight() <= jumpable.getJumpHeight()) {
            System.out.println(" cмог перепрыгнуть " + getHeight());
            return true;

        } else {
            System.out.println(" не смог перепрыгнуть " + getHeight());
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
