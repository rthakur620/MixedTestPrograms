package com.mix;

public class LinkedList {

	
	
	public static void main(String[] args) {
		DoublyLinkedList llist = new DoublyLinkedList();
		for (int i = 1; i <= 4; i++) {
			
			llist.insertNode(i);
		}
		
		/*DoublyLinkedListNode llist2 = llist.head;
		System.out.println("Before Reverse");
		for (int i = 1; i <= 4; i++) {
			System.out.println(llist2.data);
			llist2 = llist2.next;
		}*/
		
		DoublyLinkedListNode llist1 = reverse(llist.head);
		System.out.println("After Reverse");
		for (int i = 1; i <= 4; i++) {
			System.out.println(llist1.data);
			
			llist1 = llist1.next;
		}
	}
	
	
	static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        
        if(head==null){
            return head;
        }

        DoublyLinkedListNode nextNode = null;
        DoublyLinkedListNode returnNode = null;
        while(head!=null){
            nextNode = head.next;

            if(head.prev==null){
                head.next = null;
                head.prev = nextNode;
                nextNode.next = head;
            }else if(head.prev!=null && head.next!=null){
                head.prev = nextNode;
                nextNode.next = head;
            }else if(nextNode==null){
                head.prev = null;
            }
            returnNode = head;
            head = head.next;
             
        }

        /*while(returnNode !=null){
            System.out.println(returnNode.data);
            returnNode = returnNode.next;
        }*/

        return returnNode;

}
	
	
	static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }
	
	
	static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }
	
	
}
