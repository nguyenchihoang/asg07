
public class MyList implements Item {
   private Node start;
   private Node end;
    private int leng;
    public MyList()
    {
        start=null;
		end=null;
        leng =0;

    }
    public Item clone()
    {
        MyList myList  = new MyList();
        myList.appendList(this);
        return myList;
    }

    public boolean isEmpty()
    {
        return start==null;
    }
    public void append(Item item)
    {
         if (!isEmpty()) {
             end.next = new Node(item,null);
             end = end.next;
         } else start=end= new Node(item,null);
       
    }
    public void appendList(MyList myList)
    {
        Node node = myList.start;
        while (node != null)
        {
            append(node.data);
            node = node.next;
        }
    }

    public  String toString()
    {
        String str1 = "(" ;
        Node node = this.start;
        boolean bool = true;
        while (node!=null)
        {
            if(bool)
            {
                str1 = str1 + node.data.toString();
                bool = false;
            }
            else
                str1 = str1 + ", " + node.data.toString();
                node = node.next;
        }
        str1= str1+ ")";
        return str1;
    }
    public int length()
    {
        int count=0;
        while(!isEmpty())
        {
                count++;
			   start=start.next;
        }
        return count;
    }
	 

}


