// LinkedList insertion  , deletion  , traverse  , printing , reverse , find middle
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}
public class LL{
    Node head;

    public void insert(int value){
          if(head == null){
            head = new Node(value);
            return;
          }

          Node temp = head;

          while(temp.next != null){
             temp = temp.next;
          }
          temp.next = new Node(value);
    }

    public void insertAtFirst(int value){
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
    }

    public void insertAtPos(int value ,int pos){
        if(head == null){
            head = new Node(value);
        }
        if(pos == 0){
         Node newnode = new Node(value);
         newnode.next = head;
         head = newnode;
        }

        Node temp = head;
        for(int i = 0; i < pos - 1 ; i++){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        Node newnode = new Node(value);
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int deleteAtHead(){
        int x = head.val;
        head = head.next;
        return x;
    }

    public void deleteAtPos(int pos){
        if(head == null)return;
        if(pos == 0){
            head = head.next;
            return;
        }
          Node temp = head;
        for(int i = 0; i < pos-1; i++){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    public Node middle(Node head){
        if(head == null)return null;
        Node slow = head;
        Node fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void deleteFromNth(int n){
     Node temp = head;
     Node temp2 = head;
     int i = 0;
    while(i < n && temp2 != null){
        temp2 = temp2.next;
        i++;
    }
    if(temp2 == null)return;

    while(temp2.next != null){
        temp = temp.next;
        temp2 = temp2.next;
    }
     temp.next = temp.next.next;
    }

    public Node reverse(Node head){
        if (head == null || head.next == null)
        return head;

    Node newNode = reverse(head.next);

    head.next.next = head;
    head.next = null;

    return newNode;

    }
    public void printList(){
         Node temp = head;
         while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
         }
         System.out.println("null");
    }
  
}