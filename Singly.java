import java.lang.*;
import java.util.Scanner;

 class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    public Node insertBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public void insertEnd(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head = newNode;
            return;
        }

        Node cur = head;

        while(cur.next!=null)
            cur = cur.next;

        cur.next = newNode;

    }

    public void insertAfter(int n,int data)
    {
        
            Node newNode = new Node(data);
            // required to traverse
            Node cur = head;
            int i=1;
            // traverse to the nth node
            while(i<n-1)
               {cur=cur.next;
                i=i+1;
               }

            newNode.next= cur.next;
            cur.next = newNode;
        
    }

   public void DeleteFirst()
	{
		    this.head = this.head.next;
	}
  
	public void DeleteEnd()
	{     
		Node cur = head;
        while (cur.next.next != null)
            cur = cur.next;
  
        // Change next of second last
        cur.next = null;
  
        
	}
    public void display()
    {
        Node cur = head;
        //as linked list will end when Node reaches Null
        while(cur!=null)
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    
	
}
  class Singly{
    public static void main(String args[])
    {   int ch,data,pos;
        Scanner a = new Scanner(System.in);
        LinkedList listObj = new LinkedList();
        do{
                System.out.println("1. Insert at Begining");
                System.out.println("2. Insert at End");
                System.out.println("3. Insert at specific position");
                System.out.println("4. Delete First");
					System.out.println("5. Delete End");
					System.out.println("6. Display");
                System.out.println("7. Exit");
					System.out.println();
   					System.out.println("Enter Your Choice:");
					
					ch=a.nextInt();
                switch (ch)
                {
                    case 1: 
                            System.out.println("Enter the data:");
                            data=a.nextInt();
                            listObj.insertBeginning(data);
                            System.out.println("Successfully Inserted");
                            break;
                    case 2:  System.out.println("Enter the data:");
                            data=a.nextInt();
                            listObj.insertEnd(data);
								  System.out.println("Successfully Inserted");
                            break;
                    case 3: 
                             System.out.println("Enter the data:");
                             data=a.nextInt();
                             System.out.println("Enter the position:");
                            pos=a.nextInt();
                           listObj.insertAfter(pos,data);
                            System.out.println("Successfully Inserted");
                            break;
                    case 4: listObj.DeleteFirst();
                            System.out.println("Successfully Deleted");
                            break;
                    case 5: listObj.DeleteEnd();
								  System.out.println("Successfully Deleted");
                            break;
                    case 6:  listObj.display(); 
                            break;
                    case 7:break; 

                }
        }while(ch!=7);


        }

}