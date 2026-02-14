// package LinkedList; // 2:30
// class Node{ //user define data type
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val;
//     }
// }
// class Linkedlist{ //user define data  structure
//     Node head; //null
//     Node tail; //null
//     int size;
//     void addAtTail(int val){
//         Node t = new Node(val);
//         if(tail==null) head = tail =t;
//         else{
//             tail.next =t;
//             tail = t;
//         }
//         size++;
//     }
//     void addAtHead(int val){
        
//         Node temp = new Node(val);
//         if(head==null) head=tail=temp;
//         else{
//             temp.next =head;
//             head = temp;
//         }
//         size++;
//     }
//         void display(){
//         if(head==null) return;
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     void deleteAthead(){
//         if(head==null){
//             System.out.println("list is empty");
//         }
//         head=head.next;
//         if(head==null) tail=null;
//         size--;
//     }
    
// }
// public class LinkedListDataStructure {
//     public static void main(String[] args) {
//         Linkedlist ll = new Linkedlist();
//         ll.addAtTail(10);
//         ll.addAtTail(20);
//         ll.addAtTail(30);
//         ll.addAtTail(40);
//         ll.display();
//         ll.addAtHead(5);
//         ll.addAtHead(4);
//         ll.addAtHead(3);
//         ll.display();
//         ll.deleteAthead();
//         ll.display();
//         System.out.println(ll.size);
//     }
// }


package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAttail(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next = temp;
            tail=temp;
        }
        size++;
    }
    void addathead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteathead(){
        if(head==null){
            System.out.println("list is empty");
        }
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAttail(10);
        ll.addAttail(20);
        ll.display();
        System.out.println(ll.size);
        ll.addathead(5);
        ll.addathead(4);
        ll.display();
        System.out.println(ll.size);
        ll.deleteathead();
        ll.display();
        System.out.println(ll.size);
    }
}