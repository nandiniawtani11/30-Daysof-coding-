import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public static Node tail=null;

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            tail=head;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
        return head;
        
    }

	public static void display(Node head) {
