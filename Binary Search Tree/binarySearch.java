import java.util.Scanner;



class node{
	node left;
	node right;
	public int data;
	node head;
	node temp;

	public node()
	{
		head = null;
		temp = null;
		left = null;
		right = null;
	}

	public node(node l, node r, int val){
		left = l;
		right = r;
		data = val;
	}
	
	public node returnHead()
	{
		return head;
	}

	public void createNode(int val)
	{
		//node freshnode = new node();
		if(head==null)
		{
			head = new node(null, null, val);
			temp = head;
		}
		else
		{
			temp=head;
			traverseAdd(val);
		}
	}
	
	public void traverseAdd(int val)
	{
		if(val>temp.data)
			{
				if(temp.right==null)
				{
					temp.right=new node(null, null, val);
					return;
				}
				else
				{
					temp=temp.right;
					traverseAdd(val);
				}
			}
			else if(val<temp.data)
			{
				if(temp.left==null)
				{
					temp.left=new node(null, null, val);
					return;
				}
				else
				{
					temp=temp.left;
					traverseAdd(val);
				}	
			}
	}

	public void displayInorder(node temp)
	{
		if(temp==null)
		{
			return;
		}
		else
		{
			displayInorder(temp.left);
			System.out.printf("%d ",temp.data);
			displayInorder(temp.right);
		}
	}
}

class binarySearch{
	public static void main(String[] args)
	{
		int i;
		node obj = new node();
		Scanner scan = new Scanner(System.in);
 		for(i=0;i<10;i++)
 		{
 			obj.createNode(scan.nextInt());
 		}
 		node temp = obj.returnHead();
 		obj.displayInorder(temp);
 	}
}


