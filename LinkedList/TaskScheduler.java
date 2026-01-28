package LinkedList;
class Task {

    private class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    private Node head;
    private Node current;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Node newNode = new Node(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        Node newNode = new Node(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Node newNode = new Node(id, name, priority, dueDate);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByTaskId(int id) {
        if (head == null) return;

        if (head.taskId == id && head.next == head) {
            head = null;
            current = null;
            return;
        }

        if (head.taskId == id) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            head = head.next;
            temp.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next.taskId == id)
            temp.next = temp.next.next;
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) return;

        System.out.println(current.taskId + " " + current.taskName + " " + current.priority + " " + current.dueDate);
        current = current.next;
    }

    public void displayAll() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;

        Node temp = head;
        do {
            if (temp.priority == priority)
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}


public class TaskScheduler {
    public static void main(String[] args) {

        Task scheduler = new Task();

        scheduler.addAtBeginning(1, "Design", 1, "2026-02-01");
        scheduler.addAtEnd(2, "Coding", 2, "2026-02-05");
        scheduler.addAtPosition(2, 3, "Testing", 1, "2026-02-03");

        scheduler.displayAll();

        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        scheduler.displayAll();
    }
}
