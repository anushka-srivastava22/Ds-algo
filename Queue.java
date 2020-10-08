class Queue
{
    int ar[];
    int r, f;
    public Queue(int size)
    {
        ar = new int[size];
        r=-1;
        f=-1;
    }
    public void enqueue(int n)
    {
        if(r < ar.length - 1)
        {
            r++;
            ar[r] = n;
        }
        else
        {
            System.out.println("Queue Overflow");
        }
    }
    public void dequeue()
    {
        if(f < r)
        {
            f++;
            System.out.println("Dequeue Element : "+ar[f]);
        }
        else
        {
            System.out.println("Underflow");
        }
    }
    public void display()
    {
        for(int i = 0; i < r; i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public int front()
    {
        if(f<r)
        {
           return ar[f++];
        }
        else
        {
            return -9999;
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.dequeue();
        
    }
}

        