package day39_Recap.treeTask;

public class mediumTree extends tree{

    public mediumTree(char size, String color) {
        super("Kavak", size, color);
    }

    @Override
    public void oxygen() {
        System.out.println("Kavak Trees produce oxygen through a process called photosynthesis.");
    }

    @Override
    public String toString() {
        return "Kavak{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
