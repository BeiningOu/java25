package project25.dataStructures;

import java.util.LinkedList;

public class LinkedListParactice {

    public static void main(String[] args) {
        LinkedList<String> linkedListString = new LinkedList<>();
        linkedListString.add("1a");
        linkedListString.add("2b");
        linkedListString.add("3c");
        linkedListString.add("4d");
        linkedListString.addFirst("11");
        linkedListString.addLast("6");

        System.out.println(linkedListString.remove()); // remove index 0
        System.out.println(linkedListString.remove(4));
        System.out.println(linkedListString);


        System.out.println("!: " + linkedListString.get(2));
        System.out.println(linkedListString.getFirst());
        System.out.println(linkedListString.getLast());
        System.out.println(linkedListString);


        // using as queue: FIFO
        // poll first element
        System.out.println("poll " + linkedListString.poll());
        // offer add to the queue:
        System.out.println("offer " + linkedListString.offer("55")); //return tru
        //peek last element
        System.out.println("peek" + linkedListString.peek());
        System.out.println(linkedListString);

        // using as stack LIFO
        // pop last element
        System.out.println(linkedListString.pop());
        // push element
        linkedListString.push("stack in");




    }
}
