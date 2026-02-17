package LinkedList; //3:10
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Linkedlist{
    Node tail;
    Node head;
    int size;
    void addathead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addattail(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next = temp;
            tail=temp;
        }
        size++;
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
    void insert(int val,int idx){
        if(idx==0) addathead(val);
        else if(idx==size) addattail(val);
        else if(idx<0 || idx>size){
            System.out.println("not insert");
        }
        else{
            Node t = new Node(val);
            Node temp = head;
            for(int i =0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
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
    void get(int idx){
        Node temp=head;
        for(int i =0;i<idx;i++){
            temp=temp.next;
        }
        temp.val=temp.val;
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("invalid idx");
            return;
        }
        if(idx==0){
            deleteathead();
        }
        Node temp = head;
        for(int i =0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1) temp=tail;
        size--;
    }

}

public class DeleteAnyIdxValue {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addattail(10);
        ll.addattail(20);
        ll.addattail(30);
        ll.addathead(5);
        ll.addathead(4);
        ll.deleteathead();
        ll.display();
        ll.insert(2, 45);
        ll.display();
    }
}