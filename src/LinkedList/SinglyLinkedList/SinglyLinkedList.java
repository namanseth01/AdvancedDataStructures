/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 06/10/21
 *   Time: 11:07 AM
 *   File: SinglyLinkedList.java
 */

package LinkedList.SinglyLinkedList;

public class SinglyLinkedList {

    private static class ListNode {
        private final int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode head;

    public void display() {
        ListNode current = head;
        while (current != null) {
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

    /*
    Algo to delete the last node
    1. if (head == null || head.next == null) { return head; }
    2. current = head;
    3. previous = null;
    4. while (current.next != null) { previous = current; current =  current.next }
    5. previous.next = null;
    6. return current;
     */

    public ListNode deleteFromLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    /*
    Algo to insert a node at given position.
    1. ListNode newNode = new ListNode(data);
    2. if (pos == 1) { newNode.next = head; head = newNode; }
            else { ListNode prev = head; int count = 1;
                        while (count < pos - 1) {
                        prev = prev.next;
                        count++;
                        }
    3.              ListNode current = prev.next;
    4.              prev.next = newNode;
    4.              newNode.next = current;
                 }
     */

    public void insertAtPosition(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    /*
    Algo to delete the node at particular position.
    1. if (pos == 1) { head = head.next; }
            else { prev = head; int count = 1;
                    while (count < pos - 1) {
                        prev = prev.next;
                        count++;
                    }
                   current = prev.next;
                   prev.next = current.next;
            }
     */

    public void deleteFromPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    /*
    Algo to find middle node of a linked list.
    1. slowPtr = head;
    2. fastPtr = head;
    3. while (fatsPtr != null && fast.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
       }
    4. return slowPtr;
     */

    public ListNode findMiddleNode() {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    /*
    Find nth element from end of a linked List.
    1. mainptr = head;
    2. refptr = head;
    3. count = 0;
    4. while (count < n) {
            refptr = refptr.next;
            count++;
       }
    5. while (refptr != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
       }
    6. return mainptr;
     */

    public ListNode findNodeFromEnd(int n) {
        ListNode mainPointer = head;
        ListNode refPointer = head;
        int count = 0;
        while (count < n) {
            refPointer = refPointer.next;
            count++;
        }
        while (refPointer != null) {
            refPointer = refPointer.next;
            mainPointer = mainPointer.next;
        }
        return mainPointer;
    }

    /*
    Remove duplicates from sorted list.
    1. current = head;
    2. while (current != null && current.next != null) {
                if (current.data = current.next.data) {
                        current.next = current.next.next;
                } else {
                        current = current.next;
                }
       }
     */

    public void removeDuplicatesInSortedList() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertNodeAtSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head ==  null) {
            return newNode;
        }
        return head;
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
        System.out.println("---------------------------");
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
        System.out.println("-------------------------");
        sll.deleteFromLast();
        sll.display();
        System.out.println("-------------------------");
        sll.insertAtPosition(2, 3);
        sll.display();
        System.out.println("--------------------------");
        sll.deleteFromPosition(3);
        sll.display();
        System.out.println("---------------------------");
        sll.insertAtBeginning(11);
        sll.display();
        System.out.println("Third node from end: " + sll.findNodeFromEnd(3).data);
        System.out.println("Fifth node from end: " + sll.findNodeFromEnd(5).data);
        System.out.println("Middle node:" + sll.findMiddleNode().data);
        System.out.println("Length of linked list: " + sll.length());
    }
}
