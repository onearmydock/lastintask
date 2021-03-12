

//linked list


class mainClass{
	public static void main(String[] arg){
		LinkedList linked = new LinkedList();
		linked.insert(10);
		linked.insert(12);
		linked.insert(33);
		linked.insert(5);
		linked.show();
		linked.insert2(22);
		linked.insert2(1332);
		linked.insert2(332);
		linked.insert2(322);
		linked.insert2(312);
		linked.insert2(52);
		linked.show2();
		System.out.println("");
		linked.join(1);
		linked.show();
		System.out.println("");
		linked.show2();
	}
}


class LinkedList{
	Node head;
	Node head2;
	
	public void insert(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
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
	public void insert2(int data){
		Node node = new Node();
		node.data = data;
		if(head2==null){
			head2 = node;
		}
		else{
			Node n = head2;
			while(n.next!=null){
			n=n.next;
			}
			n.next = node;
		}
	}
	
	public void join(int index){
		if(head2==null){
			System.out.println("second linked list is empty");
		}
		else if(head == null){
			System.out.println("first linked list is empty");
		}
		else{
			Node n = head2;
			while(n.next!=null){
			n=n.next;
			}
			
			Node one = head;
			int i =0;
			while(one.next!=null&&i!=index){
				one=one.next;
				i++;
			}
			n.next = one;
		}
	}
	
	
	
	
	public void show(){
		Node n = head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
	public void show2(){
		Node p = head2;
		while(p.next!=null){
			System.out.println(p.data);
			p=p.next;
		}
		System.out.println(p.data);
	}
	
}

class Node{
	
	int data;
	Node next;
}