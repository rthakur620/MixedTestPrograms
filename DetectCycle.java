package com.linkedlist;

public class DetectCycle {

	
	boolean hasCycle(Node head) {

	    if(head==null){
	        return false;
	    }
	    Node firstCounter = head;
	    Node secondCounter = head;
	    while(firstCounter!=null && secondCounter!=null && secondCounter.next!=null){
	        firstCounter = firstCounter.next;
	        secondCounter = secondCounter.next.next;
	        if(firstCounter==secondCounter){
	            return true;
	        }
	    }
	    
	    return false;
	    
	}
}
