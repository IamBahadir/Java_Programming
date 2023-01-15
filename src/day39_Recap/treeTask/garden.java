package day39_Recap.treeTask;

public class garden {

    public static void main(String[] args) {

        smallTree smallTree = new smallTree('S',"green");
        System.out.println(smallTree);
        smallTree.oxygen();
        System.out.println("---------------------------");

        mediumTree mediumTree = new mediumTree('M',"Yellow");
        System.out.println(mediumTree);
        mediumTree.oxygen();

        System.out.println("---------------------------");

        longTree longTree = new longTree('L',"Purple");
        System.out.println(longTree);
        longTree.oxygen();

    }


}
