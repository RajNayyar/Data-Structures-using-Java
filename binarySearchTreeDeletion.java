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

		node temp = new node();
		if(head==null)
		{
			head = new node(null, null, val);
			temp = head;
		}
		else
		{
			temp=head;
			traverseAdd(val, temp);
		}
	}
	
	public void traverseAdd(int val, node temp)
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
					traverseAdd(val, temp);
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
					traverseAdd(val, temp);
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

	public node delete(node temp)
	{
		if (temp!=null)
		{
			delete(temp.left);
			delete(temp.right);
			temp=null;
		}
			head=temp;
			return temp;
	}
}


class binarySearchTreeDeletion{
	public static void main(String[] args)
	{
		int i;
		node obj = new node();
		Scanner scan = new Scanner(System.in);
 		for(i=0;i<10;i++)
 		{
 			obj.createNode(scan.nextInt());
 		}
 
 		obj.displayInorder(obj.returnHead());

 		obj.delete(obj.returnHead());
 		obj.displayInorder(obj.returnHead());

 		if(obj.returnHead()==null)
		{
			System.out.printf("\nTREE EMPTY!!!");
		}
		else 
		{
			System.out.printf("\nTREE NOT EMPTY!!!");
		}
 	}
}


