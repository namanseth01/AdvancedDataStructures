/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 10/11/21
 *   Time: 11:20 AM
 *   File: CircularLinkedList.java
 */

package LinkedList.CircularLinkedList;

import java.util.List;

public class CircularLinkedList {
    private ListNode last;
    private int length;


    private class ListNode {
        private ListNode next;
        private int data;


        public ListNode(int data) {
            this.data = data;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
    }

    public void display(int data) {

    }



    public static void main(String[] args) {
        CircularLinkedList csll = new CircularLinkedList();
        csll.createCircularLinkedList();
    }
}
