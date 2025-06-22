package com.example.task;

public class TaskListTest {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        list.add(new Task("T1", "Design API",   "Pending"));
        list.add(new Task("T2", "Write tests",  "In Progress"));
        list.add(new Task("T3", "Fix bugs",     "Pending"));

        System.out.println("All tasks:");
        list.traverse();

        System.out.println("\nSearch T2:");
        System.out.println(list.search("T2"));

        System.out.println("\nDelete T1:");
        list.delete("T1");
        list.traverse();
    }
}
