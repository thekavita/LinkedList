

public class App {
   public static void main(String[] args) {
      LL a = new LL();
      a.insert(10);
      a.insert(20);
      a.insert(30);
      a.insert(40);
      a.insert(50);
      a.insert(60);
      a.insert(70);
      a.printList();
   
      // a.middle(a.head);
      a.head =  a.middle(a.head);
     // a.deleteFromNth(3);
     // a.insertAtPos(60, 2);
     //  a.deleteAtHead();
     //  a.deleteAtPos(3);
      a.printList();
   }
    
   }
  
    



