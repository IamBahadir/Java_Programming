package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(10, 200, 50, 40, 25, 10, 200));

        System.out.println(set);


        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        System.out.println("---------------------------");


        Stack<Integer>stack = new Stack<>();
        stack.addAll(Arrays.asList(10,20,30,40,50,60,60,70));
        System.out.println(stack);
        // pop--> there is a method which name is pop that we can use it, if we want to LIFO

        for (int i = 0; i < 3; i++) {
            stack.pop();
        }
        System.out.println("stack = " + stack);
        System.out.println("---------------------------");

        Queue<Integer>queue = new ArrayDeque<>();
        queue.addAll(Arrays.asList(10,20,10,20,10, 20, 30, 40, 50));


        for (int i = 0; i < 4; i++) {
            queue.poll();
        }
        System.out.println("queue = " + queue);


    }


}// end line of the class
