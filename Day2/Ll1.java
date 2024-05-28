// Q2. Demonstrating various insert and delete operations on Node
class Ll1 {
    public static void main(String[] args) {
        Node Linked=new Node(5);
        Linked.begininsert(6);
        Linked.endinsert(7);
        Linked.begininsert(8);
        Linked.posinsert(1,10,Linked);
        Linked.delbeg();
        Linked.delend();
        Linked.delpos(2,Linked);
        // Linked.reverse();
        Linked.print();
    }
}
class Node
{
    int data;
    Node next=null;
    static Node tail=null;
    Node(int data1)
    {
        data=data1;
    }
    public void endinsert(int dataTail)
    {
        if (next==null)
        {
            next=new Node(dataTail);
            tail=next;
        }
        else
        {
            tail.next=new Node(dataTail);
            tail=tail.next;
        }
    }
    public void begininsert(int dataTail)
    {
        if (next==null)
        {
            next=new Node(data);
            data=dataTail;
            tail=next;
        }
        else
        {
            Node insert_node=new Node(data);
            insert_node.next=next;
            next=insert_node;
            data=dataTail;
        }
    }
    public void posinsert(int pos,int data_get,Node ref)
    {
        boolean insert_status=false;
        if (pos==0)
        {
            Node insert_node=new Node(data);
            insert_node.next=next;
            next=insert_node;
            data=data_get;
            insert_status=true;
        }
        else
        {
            pos-=1;
            int count=0;
            Node pos_point=ref;
            while (pos_point!=null)
            {
                if (pos==count)
                {
                    Node insert_node=new Node(data_get);
                    insert_node.next=pos_point.next;
                    pos_point.next=insert_node;
                    insert_status=true;
                    break;
                }
                pos_point=pos_point.next;
                count+=1;
            }
        }
        if (!insert_status)
        {
            System.out.println("Out Of Index");
        }
    }
    public void delbeg()
    {
        if (next!=null)
        {
            data=next.data;
            next=next.next;
        }
    }
    public void delend()
    {
        if (next!=null)
        {
            Node delpoint=next;
            while (delpoint.next.next!=null)
            {
                delpoint=delpoint.next;
            }
            delpoint.next=null;
        }
    }
    // public void reverse() {
    //     Node prev = null;
    //     Node current = this;
    //     Node next = null;
    //     while (current != null) {
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     data = prev.data;
    //     next = prev.next;
    // }
    public void delpos(int pos,Node ref)
    {
        if (pos==0)
        {
            if (next!=null)
            {
                data=next.data;
                next=next.next;
            }
        }
        else
        {
            pos-=1;
            int count=0;
            Node pos_point=ref;
            while (pos_point!=null)
            {
                if (pos==count)
                {
                    pos_point.next=pos_point.next.next;
                    break;
                }
                pos_point=pos_point.next;
                count+=1;
            }
        }
    }
    public void print()
    {
        System.out.println(data);
        Node printPoint=next;
        while (printPoint!=null)
        {
            System.out.println(printPoint.data);
            printPoint=printPoint.next;
        }
        
    }
}

// Output:
// ➜  Day2 git:(main) ✗ java Ll1      
// 10
// 6