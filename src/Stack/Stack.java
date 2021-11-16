/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 15/11/21
 *   Time: 11:15 AM
 *   File: Stack.java
 */

package Stack;

/*
Stack is a linear Data structure used for storing the data.
It is an ordered list in which insertion and deletion are done at one end, called top.
The last element inserted is the first one to be deleted called as "LIFO"
 */

import LinkedList.SinglyLinkedList.SinglyLinkedList;

public class Stack {

    private ListNode top;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {

    }

}
