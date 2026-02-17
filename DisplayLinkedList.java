// package LinkedList;
// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val = val;
//     }
// }
// public class DisplayLinkedList {
//     public static void display(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }
//     }
//     public static void main(String[] args) {
//          Node a = new Node(10); //head node
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         Node f = new Node(5);
//         // connect karenge (link krenge)
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = f;
//         display(a);
//     }
// }




// by using recursion 1:30
package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class DisplayLinkedList {
    public static void displayrec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayrec(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10); //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        // connect karenge (link krenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // displayrec(a);sout
        System.out.println(get(a,2));
    }
    private static int get(Node head,int idx){
        for(int i =0;i<idx;i++){
            head=head.next;
        }
        return head.val;
    }
}
