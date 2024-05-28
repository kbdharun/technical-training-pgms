import java.util.*;
class HelloWorld {
    static class node
    {
        int data;
        node next=null;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class linkedlist
    {
        node head=null;
        node tail=null;
        void insertAtBeg(int data)
        {
            node newnode=new node(data);
            if(head==null)
            {
                head=newnode;
                tail=newnode;
            }
            else
            {
                newnode.next=head;
                head=newnode;
            }
        }
        void deletebeg()
        {
            node temp=head;
            head=head.next;
            temp.next=null;
        }
        void deletemid(int pos)
        {
            int count=1;
            if(pos==0)
            {
                if(head==null)
                {
                    return;
                }
                else
                {
                    deletebeg();
                }
            }
            else
            {
                node temp=head;
                while(temp.next!=null)
                {
                    if(count==pos)
                    {
                        temp.next=temp.next.next;
                        break;
                    }
                    temp=temp.next;
                    count++;
                }
                if(temp.next==null)
                {
                    deleteend();
                }
            }
        }
        void deleteend()
        {
            node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        void insert(int data,int index)
        {
            node temp=head;
            node newnode=new node(data);
            int count=1;
            if(index==0)
            {
                if(temp==null)
                {
                    head=newnode;
                    tail=newnode;
                }
                else
                {
                    this.insertAtBeg(data);
                }
            }
            else
            {
                while(temp!=null)
                {
                    if(count==index)
                    {
                        newnode.next=temp.next;
                        temp.next=newnode;
                    }
                    temp=temp.next;
                    count++;
                }
            }
        }
        void insertAtEnd(int data)
        {
            node newnode=new node(data);
            if(head==null)
            {
                head=newnode;
                tail=newnode;
            }
            else
            {
                tail.next=newnode;
                tail=newnode;
                
            }
        }
        void print()
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void reverse()
        {
            node curr=head;
            node prev=null;
            node next=null;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
 
    }
static class merger {
    node merge(node h1, node h2) {
        node dummy = new node(0);
        node sort = dummy;
        
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                sort.next = h1;
                h1 = h1.next;
            } else {
                sort.next = h2;
                h2 = h2.next;
            }
            sort = sort.next;
        }
        
        if (h1 != null) {
            sort.next = h1;
        }
        
        if (h2 != null) {
            sort.next = h2;
        }
        
        return dummy.next;
    }

    void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        linkedlist l2=new linkedlist();
        int i,j;
        Scanner sc=new Scanner(System.in);
        while((i=sc.nextInt())!=-1)
        {
            ll.insertAtEnd(i);
        }
        while((j=sc.nextInt())!=-1)
        {
            l2.insertAtEnd(j);
        }
        ll.print();
        System.out.println();
        l2.print();
        merger listm=new merger();
        node sortedhead=listm.merge(ll.head,l2.head);
        listm.print(sortedhead);
    }
}
