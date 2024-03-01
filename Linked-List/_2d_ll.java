import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data1){
this.data=data1;
this.next=null;
this.prev=null;
    }
}
public class _2d_ll{
    public static Node cvt_arr_to_2dll(int[]arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node remove_head(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node back=head;
        head=head.next;
        head.prev=null;
        back.next=null;
    return head;
    }
    public static Node remove_tail(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        Node back=temp.prev;
            back.next=null;
            temp.prev=null;
        return head;
    }
    public static Node remove_node_kpos(Node head,int k){
      
        if(head==null){
            return null;
        }
        Node temp=head;
        int counter=0;
        while(temp!=null){
            counter++;
            if(counter==k)break;
                temp=temp.next;
            
           
        }
        Node back=temp.prev;
        Node front=temp.next;
        if(back==null&&front==null){
            return null;
        }
        else if(back==null){
          return   remove_head(head);
        }
        else if(front==null){
          return  remove_tail(head);
        }
       back.next=front;
       front.prev=back;
       temp.next=null;
       temp.prev=null;
        return head;
    }
    public static Node remove_element(Node head,int element){
      
        if(head==null){
            return null;
        }
        Node temp=head;
      
        while(temp.data!=element){
            
                temp=temp.next;
                
            
           
        }
        Node back=temp.prev;
        Node front=temp.next;
        if(back==null&&front==null){
            return null;
        }
        else if(back==null){
          return   remove_head(head);
        }
        else if(front==null){
          return  remove_tail(head);
        }
       back.next=front;
       front.prev=back;
       temp.next=null;
       temp.prev=null;
        return head;
    }
  public static void delete_node(Node temp){
    Node front=temp.next;
    Node back=temp.prev;
    if(front==null){
        back.next=null;
        temp.prev=null;
    }
    front.prev=back;
    back.next=front;
    temp.next=null;
    temp.prev=null;
  }
  public static Node inst_bfr_head(Node head,int val){
    if(head==null){
        return new Node(val);
    }
    Node newnode=new Node(val);
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
    return head;
}
public static Node insert_after_tail(Node head,int val){
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node back=temp.prev;
    Node newnode=new Node(val);
    back.next=newnode;
    temp.prev=newnode;
    newnode.next=temp;
    newnode.prev=back;
    return head;
}
public static Node insert_before_kpos(Node head,int val,int k){
    Node temp=head;
    
    int counter=0;
    while(temp!=null){
        counter++;
        if(counter==k)
        break;
        temp=temp.next;
    }
    Node back=temp.prev;

    Node newnode=new Node(val,temp,back);
    back.next=newnode;
    temp.prev=newnode;
    return head;
}
public static Node insert_before_element(Node head,int ele,int val){
    Node temp=head;
    while(temp.data!=ele){
        temp=temp.next;
    }
    Node back=temp.prev;
    Node newnode=new Node(val,temp,back);
    back.next=newnode;
    temp.prev=newnode;
    return head;
}
// reverse a linked list using stack
 public static Node reverse_ll(Node head){
    Stack<Integer>st=new Stack<>();
    Node temp=head;
    while(temp!=null){
        st.push(temp.data);
        temp=temp.next;
    }
    temp=head;
    while(temp!=null){
        temp.data=st.peek();
        st.pop();
        temp=temp.next;
    }

    return head;
}
//reverse a linked list by swaping their link
public static Node reverse_ll2(Node head){

Node current=head;
Node last=null;
while(current!=null){
     last=current.prev;
    current.prev=current.next;
    current.next=current.prev;
    current=current.prev;
}
head=last.prev;

    return head;
}
public static Node add_two_no(Node head1,Node head2){
    int carry=0;
Node dummynode=new Node(-1);
Node curr=dummynode;
Node temp1=head1;
Node temp2=head2;
while(temp1!=null&&temp2!=null){
    int sum=carry;
    if(temp1!=null){
        sum=sum+temp1.data;
    }
    if(temp2!=null){
        sum=sum+temp2.data;
    }
    Node newnode=new Node(sum%10);
    carry=sum/10;
    curr.next=newnode;
    curr=curr.next;
    if(temp1!=null){
        temp1=temp1.next;
    }

    if(temp2!=null){
        temp2=temp2.next;
    }
    if(carry>0){
        newnode=new Node(carry);
        curr.next=newnode;
    }
    
}
return dummynode.next;
    
}
public static Node merge_odd_even_ll(Node head){
    Node temp=head;
    ArrayList<Integer>al=new ArrayList<>();
    while(temp!=null){
al.add(temp.data);
if(temp.next!=null){
    temp=temp.next.next;
}
else{
    temp=null;
}
    }
    temp=head.next;
    while(temp!=null){
        al.add(temp.data);
        if(temp.next!=null){
            temp=temp.next.next;
        }
        else{
            temp=null;
        }
            }
            temp=head;
            int i=0;
            while(temp!=null&&i<al.size()){

                temp.data=al.get(i);
                temp=temp.next;
                i++;
            }
        

    return head;
}
public static Node marge_odd_even2(Node head){
    if(head==null&&head.next==null){
        return head;
    }
    Node odd=head;
    Node even=head.next;
    Node evenhead=head.next;
    while(even!=null&&even.next!=null){
        odd.next=odd.next.next;
        even.next=even.next.next;
        odd=odd.next;
        even=even.next;
    }
    odd.next=evenhead;
    return head;
}
public static Node sort_ll(Node head){
    Node temp=head;
    int count0=0;
    int count1=1;
    int count2=0;
    while(temp!=null){
        if(temp.data==0){
            count0++;
        }
     else if(temp.data==1){
            count1++;
        }
        else{
            count2++;
        }
        temp=temp.next;

    }
    temp=head;
    while(temp!=null){
        if(count0>0){
            temp.data=0;
            count0--;
        }
       else if(count1>0){
            temp.data=1;
            count1--;
        }
       else{
            temp.data=2;
            count2--;
        }
        temp=temp.next;
    }
    return head;
}
public static Node sort_ll_optimize(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node zerohead=new Node(-1);
    Node onehead=new Node(-1);
    Node twohead=new Node(-1);
    Node zero=zerohead;
    Node one=onehead;
    Node two=twohead;
Node temp=head;
while(temp!=null){
    if(temp.data==0){
        zero.next=temp;
        zero=temp;
    }
   else if(temp.data==1){
        one.next=temp;
        one=temp;
    }
    else{
        two.next=temp;
        two=temp;
    }
    temp=temp.next;
}
zero.next=(onehead.next!=null)?onehead.next:twohead.next;
one.next=twohead.next;
two.next=null;
Node newhead=zerohead.next;
return newhead;

}
//remove nth onde form the end of the ll
public static Node remove_nth_node(Node head,int n){
    Node temp=head;
    int counter=0;
  while(temp!=null){
    counter++;
    temp=temp.next;
  }
  if(counter==n){
    Node newnode=head.next;
    return newnode;
  }
  int result=counter-n;
  temp=head;
while(temp!=null){

    result--;
    if(result==0)
        break;
        temp=temp.next;
    
   
    
}
Node delnode=temp.next;
temp.next=temp.next.next;
    return head;
}
public static Node remove_nth_node_optimize(Node head,int n){
    Node fast=head;
    Node slow=head;
    for(int i=0;i<n;i++){
        fast=fast.next;
    }

    if(fast==null){
        Node newnode=head.next;
        return newnode;
    }
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
   
    Node delnode=slow.next;
    slow.next=slow.next.next;

    return head;
}
public static Node rvrs_ll(Node head){
    Node temp=head;
    Node prev=null;
   
    while(temp!=null){
        Node front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
return prev;
}
public static Node reverse_ll_recursive(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node newhead=reverse_ll_recursive(head.next);
    Node front=head.next;
    front.next=head;
    head.next=null;
    return newhead;
}
public static boolean  is_palindrome_optimal(Node head){
    if(head==null||head.next==null){
        return true;
    }
    Node slow=head;
    Node fast=head;
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    Node newhead=reverse_ll_recursive(slow.next);
    Node first=head;
    Node second=newhead;
    while(second!=null){
        if(first.data!=second.data){
            reverse_ll_recursive(newhead);
            return false;
        }
        first=first.next;
        second=second.next;
    }
    reverse_ll_recursive(newhead);
    return true;

}
public static Node add_one_to_ll(Node head){
    head=reverse_ll_recursive(head);
    Node temp=head;
    int carry=1;
    while(temp!=null){
        temp.data=temp.data+carry;
        if(temp.data<10){
            carry=0;
            break;
        }
        else{
            carry=temp.data/10;
            temp.data=temp.data%10;


        }
        temp=temp.next;
    }
   head= reverse_ll_recursive(head);
   if(carry>0){
    Node newnode=new Node (carry);
    newnode.next=head;
    head=newnode;
   }
    return head;
}
public static int helper(Node temp){
    if(temp==null){
        return 1;
    }
    int carry=helper(temp.next);
    temp.data=temp.data+carry;
    if(temp.data<10)
    return 0;
    temp.data=0;
    return 1;
}
public static Node addone(Node head){
    int carry=helper(head);
    if(carry==1){
        Node newnode=new  Node(1);
        newnode.next=head;
        head=newnode;
    }
    return head;
}
public static Node find_mid(Node head){
    Node temp=head;
    int counter=0;
    while(temp!=null){
        counter++;
        temp=temp.next;
    }
int mid=(counter/2)+1;
temp=head;
while(temp!=null){
    mid=mid-1;
    if(mid==0)
    break;
    temp=temp.next;
   
}

    return temp;
}
    public static void main(String[]args){
int[]arr={9,9,9,6,7};
Node head=cvt_arr_to_2dll(arr);
//print(head);
//  head=remove_head(head);
// print(head);
// head=remove_tail(head);
// print(head);
//  head=remove_node_kpos(head,2);
// print(head);
// delete_node(head.next);
// print(head);
// head=inst_bfr_head(head, 3);
// print(head);
// head=insert_after_tail(head, 78);
// print(head);

// head=insert_before_kpos(head,67,2);
// print(head);
// head=insert_before_element(head,4,12);
// print(head);
// head=reverse_ll2(head);
// print(head);
// Node reversed=reverse_ll(head);
// System.out.println(reversed.data);
// Node head1=cvt_arr_to_2dll(arr);
// Node head2=cvt_arr_to_2dll(arr);
// Node dmnode=add_two_no(head1, head2);
// print(dmnode);
// head=marge_odd_even2(head);
// print(head);
// head=sort_ll_optimize(head);
// print(head);
// head=remove_nth_node_optimize(head,6);
// print(head);
// Node nhead=rvrs_ll(head);
// print(nhead);
// head=reverse_ll_recursive(head);
// print(head);

// System.out.println(is_palindrome_optimal(head));

// head=add_one_to_ll(head);
// print(head);
// head=addone(head);
// print(head);
Node mid=find_mid(head);
System.out.println(mid.data);

    }
}
