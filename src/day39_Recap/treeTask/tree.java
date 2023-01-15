package day39_Recap.treeTask;

public class tree {

    private String name;

    public char size;
    public String color;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name");
            System.exit(1);
        }
        if (name.isBlank()||name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public tree(String name, char size, String color) {
        setName(name);
        this.size = size;
        this.color = color;
    }

    public void oxygen(){
        System.out.println("Trees produce oxygen through a process called photosynthesis.");
    }

    @Override
    public String toString() {
        return "tree{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }


}
