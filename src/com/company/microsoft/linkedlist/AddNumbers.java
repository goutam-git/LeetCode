package com.company.microsoft.linkedlist;

public class AddNumbers {
    public static void main(String[] args) {
        // 2-4-3
        // 5-6-4
        Node _2 = new Node(2);
        Node _4 = new Node(4);
        Node _3 = new Node(3);
        Node _5 = new Node(5);
        Node _6 = new Node(6);
        Node __4 = new Node(4);

        _2.next = _4;
        _4.next = _3;
        _5.next = _6;
        _6.next = __4;

        printNodes(_2);
        System.out.println();
        printNodes(_5);

        Node node = addTwoNumbers(_2,_5);
        System.out.println();
        printNodes(node);

    }
    public static void printNodes(Node node){
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node cur = dummy;
        int carry = 0;
        int sum = 0;
        while(l1 != null && l2!= null){
            int x = l1.val;
            int y =  l2.val;
            sum = x + y + carry;
            carry = sum / 10;
            cur.next = new Node(sum % 10);
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return  dummy.next;
    }


    public static class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
        }
    }
}
