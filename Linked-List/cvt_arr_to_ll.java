class Node{
    int data ;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }


}
public class  cvt_arr_to_ll{ 
    private static Node convert_arr_to_ll(int[]arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
          
        }
        return head;
    }
    public static int find_ll_length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;

        }
        return count;
    }
    public static Node insert_kth_pos(Node head,int k,int val){
        if(head==null){
            if(k==1){
                return new Node (val);
            }
            else{
                return null;
            }
        }
       if(k==1){
        Node temp=new Node(val,head);
        return temp;

       }
       Node temp=head;
       int counter=0;
       while(temp!=null){
        counter++;
        if(counter==k-1){
Node newnode=new Node(val);
newnode.next=temp.next;
temp.next=newnode;
break;
        }
     
        temp=temp.next;
       }
       
       return head;
    }
    public static Node insert_before_value(Node head,int el,int val){
        if(head==null){
           return null;
        }
       if(head.data==val){
        Node temp=new Node(val,head);
        return temp;

       }
       Node temp=head;
      
       while(temp.next!=null){
       
        if(temp.next.data==val){
Node newnode=new Node(el);
newnode.next=temp.next;
temp.next=newnode;
break;
        }
     
        temp=temp.next;
       }
       
       return head;
    }
    public static Node insert_first_pos(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node deletehead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }
    public static Node deletetail(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deletekthelement(Node head,int k){
        if(head==null){
            return head;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        int counter=0;
        while(temp!=null){
            counter++;
            if(counter==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    return head;
    }

    public static Node deleteelement(Node head,int value){
        if(head==null){
            return head;
        }
        if(head.data==value){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        
        while(temp!=null){
           
            if(temp.data==value){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    return head;
    }
    public static Node insrttail(Node head,int val){
      if(head==null){
        return new Node(val);
      }
        Node temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
            
        }
        Node newnode=new Node(val);
        temp.next=newnode;
        return head;
    }
    public static void search_element_ll(Node head,int val){
        Node temp=head;
        int count=1;
      
      
        while(temp!=null){
            if(temp.data==val){
                System.out.println("item found at pos"+count);
                return;

            }
            temp=temp.next;
            count++;
        }
      System.out.println("eleement not present");

       }
    
    public static void main(String[]args){
        int arr[]={2,5,6,8};
        // Node y=new Node(arr[0]);
        // System.out.println(y.data);
        Node head=convert_arr_to_ll(arr);
        Node temp=head;
       
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
// int length=find_ll_length(head);
// System.out.println(length);

// search_element_ll(head, 2);
// head=deletehead(head);
// print(head);
// head=deletetail(head);
// print(head);
//   head=deletekthelement(head,2);
// print(head);
// head=deleteelement(head, 8);
// print(head);
// head=insert_first_pos(head, 11);
// print(head);
// head=insrttail(head,3);
// print(head);
// head=insert_kth_pos(head,2,34);
// print(head);
head=insert_before_value(head, 17, 5);
print(head);

        }
        // System.out.println(head.data);
        
        

    }
