package day39_Recap.treeTask;

public class smallTree extends tree{


    public smallTree(char size, String color) {
        super("Bonsai", size, color);
    }


    @Override
    public void oxygen() {
        System.out.println("Bonsai Trees produce oxygen through a process called photosynthesis.");
    }

    @Override
    public String toString() {
        return "Bonsai{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
