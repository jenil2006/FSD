class sll{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node first=null;
    void addfirst(int data){
    node n=new node(data);
    if(first==null) {
        first=n;
    }else{
        n.next=first;
        first=n;
    }
    }
    void addlast(int data){
        node n=new node(data);
        if(first==null){
            first=n;
        }else{
            node temp=first;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void insertbefore(int data,int value){
    if(first==null){
        System.out.println("ll is empty");
    }else{
        node dummy=first;
        int flag=0;
        while(dummy!=null){
            if(dummy.data==value){
                flag=-1;
                break;
            }
            dummy=dummy.next;
        }
        if(flag==0){
            System.out.println("value not found");
        }else{
            node n=new node(data);
            if(first.data==value){
                n.next=first;
                first=n;
            }else{
                node temp=first;
                while(temp.next.data!=value){
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
        }
    }
    }
    void insertafter(int data,int value){
        if(first==null){
            System.out.println("ll is empty");
        }else{
            node dummy=first;
            int flag=0;
            while(dummy!=null){
                if(dummy.data==value){
                    flag=-1;
                    break;
                }
                dummy=dummy.next;
            }
            if(flag==0){
                System.out.println("value not found");
            }else{
                node n=new node(data);
                if(first.data==value&&first.next==null){
                    first.next=n;
                }else{
                    node temp=first;
                    while(temp.data!=value){
                        temp=temp.next;
                    }
                    n.next=temp.next;
                    temp.next=n;
                }
            }
        }
    }
    void deletefirst(){
       if(first==null){
        System.out.println("ll is empty");
       }else if(first.next==null){
        System.out.println("deleted node at value:"+first.data);
        first=null;
       }else{
        System.out.println("deleted:"+first.data);
        node temp=first;
        first=first.next;
        temp.next=null;
       }
    }
    void deletelast(){
        if(first==null){
         System.out.println("ll is empty");
        }else if(first.next==null){
         System.out.println("deleted node at value:"+first.data);
         first=null;
        }else{
         node temp=first;
         while(temp.next.next!=null){
            temp=temp.next;
         }
         System.out.println("deleted:"+temp.next.data);
         temp.next=null;
        }
     }
     void deleteparticular(int value){
        int flag=0;
     if(first==null){
        System.out.println("ll is empty");
     }else{
        node dummy=first;
        while(dummy!=null){
            if(dummy.data==value){
                flag=1;
                break;
            }
            dummy=dummy.next;
        }
        if(flag==0){
            System.out.println("value not found");
        }else{
            if(first.data==value){
                System.out.println("deleted:"+first.data);
                first=first.next;
            }else{
                node temp=first;
                while(temp.next.data!=value){
                    temp=temp.next;
                }
                System.out.println("deleted:"+temp.next.data);
                temp.next=temp.next.next;
            }
        }
     }
     }
    void display(){
        node temp=first;
        if(temp==null){
            System.out.println("ll is empty");
        }else{
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    void deleteoddposition(){
        if(first==null){
            System.out.println("ll is empty");
        }else{
            node temp=first;
            while(temp!=null&&temp.next!=null){
                if(temp.next.data%2!=0){
                    temp.next=temp.next.next;
                }else
                temp=temp.next;
            }
        }
    }

    void deleteduplicated(){
        node temp=first;
        while(temp!=null){
            node current=temp;
            while(current.next!=null){
                if(current.next.data==temp.data){
                    current.next=current.next.next;
                }else
                current=current.next;
            }
            temp=temp.next;
        }
    }
}
class oddpo{
    public static void main(String[] args) {
        sll s=new sll();
        s.addfirst(2);
        s.addfirst(1);
        s.addlast(3);
        s.addlast(4);
        s.addlast(5);
        s.addlast(6);
        s.addlast(2);
        s.addlast(4);
        s.addlast(3);
        s.display();
        s.deleteduplicated();
        s.display();
    }
}



