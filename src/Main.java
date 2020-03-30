public class Main {

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {


// My answer to HackerRank, Insert a node at a specific position in a linked list
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current_node = head;

        int i = 0;
        while (i < position-1 ){
            current_node = current_node.next;
            i++;
        }

        new_node.next = current_node.next;
        current_node.next = new_node;
        return head;






    }




}
