/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 06/10/21
 *   Time: 11:07 AM
 *   File: SinglyLinkedList.java
 */

package LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /*
    Algo to insert node at beginning
    1. ListNode newNode = new ListNOde(value);
    2. newNOde.next = head;
    3. head = newNode;
     */

    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /*
    Algo to insert node at last
    1. ListNode newNOde = new ListNode(value);
    2. if (head == null) { head = newNode; return; }
    3. ListNode current = head;
    4. while (current.next != null) { current = current.next; }
    5. current.next = newNode;
     */

    public void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /*
    Algo to delete first node
    1. if (head = null) { return null; }
    2. ListNode temp = head;
    3. head = head.next;
    4. temp.next = null;
    5. return temp;
     */

    public ListNode deleteAtFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        System.out.println("-------------------------");
        sll.insertAtBeginning(11);
        sll.insertAtBeginning(8);
        sll.insertAtBeginning(1);
        sll.display();
        System.out.println("------------------------");
        sll.insertAtLast(15);
        sll.insertAtLast(26);
        sll.display();
        System.out.println("------------------------");
        sll.deleteAtFirst();
        sll.deleteAtFirst();
        sll.display();
        System.out.println("Length of linked list: " + sll.length());
    }
}
