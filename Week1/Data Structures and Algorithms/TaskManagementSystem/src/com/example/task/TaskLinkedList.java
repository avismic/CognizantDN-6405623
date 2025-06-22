package com.example.task;

public class TaskLinkedList {
    private Node head;

    private static class Node {
        Task task;
        Node next;
        Node(Task task) { this.task = task; }
    }

    public void add(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }

    public Task search(String taskId) {
        Node cur = head;
        while (cur != null) {
            if (cur.task.getTaskId().equals(taskId)) {
                return cur.task;
            }
            cur = cur.next;
        }
        return null;
    }

    public void traverse() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.task);
            cur = cur.next;
        }
    }

    public boolean delete(String taskId) {
        if (head == null) return false;
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return true;
        }
        Node prev = head, cur = head.next;
        while (cur != null) {
            if (cur.task.getTaskId().equals(taskId)) {
                prev.next = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }
}
