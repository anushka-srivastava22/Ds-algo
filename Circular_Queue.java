class Circular_Queue
{
    int ar[];
    int r , f;
    public Circular_Queue(int size)
    {
        r=-1;
        f=-1;
        ar = new int [size];
    }
    
    public void enqueue(int n)
    {
        if(f == 0 && r == ar.length-1 || f == r+1)//if front is 0 and rear is equal to size of array or front is rear+1
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            if(f==-1)//a no. is inserted and front is -1  then f is initialised to 0 so that element can be incremented
            {
                f = 0;// f is 0
            }
            r = (r + 1)%(ar.length); //find the position where element has to be inserted
            ar[r] = n;//assigning value 
            System.out.println("Inserted");//
        }
    }
    public void dequeue()
    {
        int element;// creating variable to store value
        if(f == -1)//front is -1 that is no value is stored
        {
            System.out.println("Queue Underflow");
        }
        else 
        {
            element = ar[f]; // storing first value to be printd
             if(f == r)// if front is equal to rear that means there is no value to be displayed
            {
                r = -1;
                f = -1;
            }
            else
            {
                f = (f+1)%(ar.length);//finding position where ele m ent has to be inserted
                
            }
            System.out.println(element+"is dequeue");//print value
        }
    }
    void diaplay()
    {
        if(f == -1)
        {
            System.out.println("Empty Queue"); 
        }
        else
        {
            System.out.println("Items ");
            for(int i = f; i!=r; i = (i+1)%(ar.length))
            {
                System.out.println(ar[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Circular_Queue cq = new Circular_Queue(3);
        cq.enqueue(1);
        cq.enqueue(13);
        cq.enqueue(12);
        cq.dequeue();
        cq.enqueue(11);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
    }
}            