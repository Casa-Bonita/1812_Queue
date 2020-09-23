package com.company;

public class MyQueue {

    private Node head;
    private Node last;
    private int size;

    public void add(int val){
        size++;
        Node node = new Node(val);
        if (head == null) {
            head = node;
            last = node;
        }else {
            last.nextNode = node;
            last = node;
        }
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        if(head!=null){
            return head.val;
        }
        return -1;
    }

    public int poll(){
        int val=0;
        if(head!=null){
            val = head.val;
            size--;
            head = head.nextNode;
            return val;
        }
        return -1;
    }

    private class Node{
        int val;
        Node nextNode;

        public Node(int val) {
            this.val = val;
        }
    }

}
