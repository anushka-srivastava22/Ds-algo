class CircularLinkedList
{
    Node head;
    Node tail;
    public void insert(int data)
    {
        Node new_node = new Node();
        new_node.data  = data;
        if(head == null)
        {
            head = new_node;
            tail = new_node;
            new_node.next = head;
        }
        else
        {
            tail.next = new_node;
            tail = new_node;
            tail.next = head;
        }
    }
    public void display()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("List is Empty");
            
        }
        do
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!= head);
        System.out.println();
    }
    public static void main(String args[])
    {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.display();
    }
}
    