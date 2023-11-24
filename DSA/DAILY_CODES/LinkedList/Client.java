import java.util.*;
class Node{

	int data;
	Node next = null;

	Node(int data){

		this.data = data;
	}
}

class SinglyLinkedList{

	Node head = null;

	void addAtFirst(int data){
		
		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}
		else{

			newNode.next = head;
			head = newNode;
		}

	}


	void addAtLast(int data){


		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}
		else{
			
			Node temp = head;
			while(temp.next != null){

				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

	void addAtPos(int pos, int data){


		if(pos <= 0 || pos > countNode() + 1){
			System.out.println("Enter Valid Position");
		}else if(pos == 1){
			addAtFirst(data);
		}else if(pos == countNode() + 1){
			addAtLast(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2 > 0){
				temp = temp.next;
				pos--;
			}

			newNode.next = temp.next;
			temp.next = newNode;
		}
	}


	int countNode(){

		if(head == null){

			return 0;
		}else{
			int count = 0;

			Node temp = head;

			while(temp != null){

				count++;
				temp = temp.next;
			}

			return count;
		}
	}

	void printSLL(){

		if(head == null){
			System.out.println("LinkedList is Empty");
		}else{

			Node temp = head;

			while(temp != null){

				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	void delFirst(){

		if(head == null){
			System.out.println("LinkedList is empty");
		}
		else{
			head = head.next;
		}
	}


	void delLast(){

		if(head == null){
			System.out.println("LinkedList is empty");
		}else if(countNode() == 1){
			head = null;
		}
		else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	void delAtPos(int pos){

		if(pos <= 0 || countNode() < pos){
			System.out.println("Enter Valid Position");
		}else if(pos == 1){
			delFirst();
		}else if(pos == countNode()){
			delLast();
		}else{
			Node temp = head;
			while(pos-2 > 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}


	}

}


class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();

		while(true){

			System.out.println("1.AddFirst");
			System.out.println("2.AddLast");
			System.out.println("3.AddAtPosition");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.count");
			System.out.println("8.print");
			System.out.println("9.Exit");
			System.out.println();
			System.out.print("Enter your choice : ");

			int ch = sc.nextInt();

			if(ch == 1){

				System.out.print("Enter Data : ");
				int data = sc.nextInt();
				sll.addAtFirst(data);
			}else if(ch == 2){

				System.out.print("Enter Data : ");
				int data = sc.nextInt();
				sll.addAtLast(data);
			}else if(ch == 3){
				System.out.print("Enter Data : ");
				int data = sc.nextInt();
				System.out.print("Enter Position : ");
				int pos = sc.nextInt();
				sll.addAtPos(pos,data);
			}else if(ch == 4){
				sll.delFirst();
			}else if(ch == 5){
				sll.delLast();
			}else if(ch == 6){
				System.out.print("Enter Position : ");
				int pos = sc.nextInt();
				sll.delAtPos(pos);
			}else if(ch == 7){
				System.out.println(sll.countNode());
			}else if(ch == 8){
				sll.printSLL();
				System.out.println();
			}else if(ch == 9){
				break;
			}


		}
	}
}
