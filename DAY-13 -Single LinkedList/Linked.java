class Snode{

	int data;

	Snode link;

}

class Linked {

	Snode head;// 10 & 1000

	int length;

		void addFirst(int value) {

			Snode newNode = new Snode();// 1016

			newNode.data=value;//20

			if(head==null) {

				head=newNode;

			}else {

			newNode.link=head;//10 & 1000

			head=newNode;// 20 & 1016

			}

		}

		void addLast(int value) {

			Snode newNode = new Snode();

			newNode.data=value;

			Snode temp= head;

			while(temp.link!=null) {

				temp=temp.link;

			}

			temp.link=newNode;// 1008

		}

		void addPos(int pos,int value) {

			Snode newNode = new Snode();

			newNode.data=value;

			if(pos<0 || pos>len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) addFirst(value);

			else {

				Snode temp= head;

				while(pos>1) {

					temp=temp.link;

					pos--;

				}

				newNode.link= temp.link;

				temp.link=newNode;

			}

		}

		void deleteFirst() {

			head=head.link;

		}

		void deleteLast() {

			Snode temp= head;

			if(len()==1)deleteFirst();

			while(temp.link.link!=null) {

				temp=temp.link;

			}

			temp.link=null;

		}

		void deletePos(int pos) {

			if(pos<0 || pos>=len()) {

				System.out.println("invalid position");

				return;

			}

			if(pos==0) deleteFirst();

			else {

				Snode temp= head;

				while(pos>1) {

					temp=temp.link;

					pos--;

				}

				temp.link=temp.link.link;

			}

		}

				//       30   ,     50

		void update(int target,int value) {

			Snode temp = head;

			while(temp!=null) {

				if(temp.data==target) {

					temp.data=value;

				}

				temp=temp.link;

			}

		}

		int len() {

			Snode temp= head;

			length=0;

			while(temp!=null) {

				length++;

				temp=temp.link;

			}

			return length;

		}

		void display() {

			Snode temp= head;// 20

			while(temp!=null) {

				System.out.println(temp.data);

				temp=temp.link;//10

			}

		}

	public static void main(String[] args) {

		Linked ob = new Linked() ;

		ob.addFirst(10);

		ob.addFirst(20);

		ob.addLast(30);

		ob.addPos(3, 5);

//		ob.deleteFirst();

//		ob.deleteFirst();

//		ob.deletePos(20);

		ob.update(30, 50);

		ob.display();

		System.out.println("Len = "+ob.len());

	}

}



