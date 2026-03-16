class Dnode{

	int data;

	Dnode left;

	Dnode right;

}

class Queue {

	Dnode head;

	Dnode tail;

	int length;

		void addFirst(int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			if(head==null) {

				head=newNode;

				tail=newNode;

			}else {

			newNode.right=head;

			head.left=newNode;

			head=newNode;

			}

		}

		void addLast(int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			tail.right=newNode;

			newNode.left=tail;

			tail=newNode;

		}

		void addPos(int pos,int value) {

			Dnode newNode = new Dnode();

			newNode.data=value;

			if(pos<0 || pos>len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) addFirst(value);

			if(pos==len())addLast(value);

			else {

				Dnode temp= head;

				while(pos>1) {

					temp=temp.right;

					pos--;

				}

				newNode.right= temp.right;

				newNode.left=temp;

				temp.right=newNode;

				newNode.right.left=newNode;

			}

		}

		int len() {

			Dnode temp= head;

			length=0;

			while(temp!=null) {

				length++;

				temp=temp.right;

			}

			return length;

		}

		void display() {

			Dnode temp= head;

			while(temp!=null) {

				System.out.println(temp.data);

				temp=temp.right;

			}

			System.out.println("forward");

		}

		void reverse() {

			Dnode temp= tail;

			while(temp!=null) {

				System.out.println(temp.data);

				temp=temp.left;

			}

			System.out.println("reverse");

		}

		

	

	public static void main(String[] args) {

		Queue ob = new Queue() ;

		ob.addFirst(10);

		ob.addFirst(20);

		ob.addLast(30);

		ob.addPos(20, 5);

//		System.out.println(ob.contains(10));

//		ob.deleteFirst();

//		ob.deleteFirst();

//		ob.deletePos(20);

//		ob.update(30, 50);

//		ob.update2(70, 70);

		ob.display();

		ob.reverse();

		System.out.println("Len = "+ob.len());

	}

}



