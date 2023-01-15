package day39_Recap.treeTask;

public class longTree extends tree{
    public longTree(char size, String color) {
        super("Amazon", size, color);
    }

    @Override
    public void oxygen() {
        System.out.println("Amazon Trees produce oxygen through a process called photosynthesis.");
    }

    @Override
    public String toString() {
        return "Amazon{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
