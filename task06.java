//task 6 generic


class main{
	
	public static void main(String[] arg){
		LinkedList ln1 = new LinkedList();
		ln1.insert("a");
		ln1.insert("b");
		ln1.insert("c");
		ln1.insert("d");
		ln1.insert("e");
		ln1.insert("f");
		LinkedList ln2 = new LinkedList();
		ln2.insert("x");
		ln1.show();
		System.out.println("");
		ln2.show();
		System.out.println("");
		ln1.join(2,ln2);
		ln1.show();
		
	}
}

class LinkedList{
	Node head;
	
	public void insert(String data){
		Node node = new Node();
		node.data = data;
		if(head==null){
			head = node;
		}
		else{
			Node n = head;
			while(n.next!=null){
			n=n.next;
			}
			n.next = node;
		}
	}
	
	public void join(int index,LinkedList ln){
		Node n = head;
		int i =1;
		while(n.next!=null&&i!=index){
			n=n.next;
			i++;
		}
		//
		Node p = ln.head;
		while(p.next!=null){
			p = p.next;
		}
		p.next=n.next;
		n.next = ln.head;
	}
	public void show(){
		Node n = head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

class Node{
	String data;
	Node next;
}