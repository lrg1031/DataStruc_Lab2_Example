package com.mycompany.lab2_lukegreen;

public class OrderedListLinked {
    
    class Node{
    public int data;
    public Node next;
    }
    
    private Node head;
    private int length;
    
    public OrderedListLinked() {
        head = null;
        length = 0;
    }
    
    public void insertItem(int data) {
        
        Node temp;
        temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;
        length++;
        
    }
    
    public void show() {
        Node location;
        location =  head;
        while(location != null) {
            System.out.println(location.data);
            location = location.next;
        }
    }
    
    public static void main(String[] args) {
        OrderedListLinked ol = new OrderedListLinked();
        ol.insertItem(10);
        ol.insertItem(20);
        ol.insertItem(30);
        ol.show();
    }
    
}
