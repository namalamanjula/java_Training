import java.util.LinkedList;
import java.util.Queue;




class Tnode{

	int data;

	Tnode left;

	Tnode right;

	Tnode(int value){

		data=value;

	}

}

class Delete{

		void inorder(Tnode root) {

			if(root==null)return;

			inorder(root.left);

			System.out.println(root.data);

			inorder(root.right);

		}

		void preorder(Tnode root) {

			if(root==null)return;

			System.out.println(root.data);

			preorder(root.left);

			preorder(root.right);

		}

		void postorder(Tnode root) {

			if(root==null)return;

			postorder(root.left);

			postorder(root.right);

			System.out.println(root.data);

		}

		void level(Tnode root) {

			if(root==null)return;

			Queue<Tnode> t = new LinkedList<>();

			t.offer(root);

			while(!t.isEmpty()) {

				Tnode temp = t.poll();




				System.out.println(temp.data);

				if(temp.left!=null)

					t.offer(temp.left);

				if(temp.right!=null)

					t.offer(temp.right);

			}

		}

		Tnode BST (Tnode root,int value) {

			if(root==null) {

				return new Tnode(value);

			}

			if(value<root.data) {

				root.left=BST(root.left,value);

			}

			else if(value>root.data) {

				root.right=BST(root.right,value);

			}

			return root;

		}

		int depth(Tnode root) {

			if(root==null) {

				return 0;

			}

			int left = depth(root.left);

			int right = depth(root.right);

			 return Math.max(left, right)+1;

		}

		int height(Tnode root) {

			if(root==null) {

				return -1;

			}

			int left = height(root.left);

			int right = height(root.right);

			 return Math.max(left, right)+1;

		}

		boolean search(Tnode root,int target) {

			if(root==null) {

				return false;

			}

			if(root.data==target) return true;

			return search(root.left,target) || search(root.right,target);

		}

		Tnode delete(Tnode root,int target) {

			if(root==null)return null;

			if(target<root.data) {

				root.left=delete(root.left,target);

			}

			else if(target>root.data) {

				root.right = delete(root.right,target);

			}

			else {

				if(root.left==null) {

					return root.right;

				}

				if(root.right==null) {

					return root.left;

				}else {

					root.data=minValue(root.right);

					root.right=delete(root.right,root.data);

				}

			}

			return root;

		}

		int minValue(Tnode root) {

			while(root.left!=null) {

				root=root.left;

			}

			return root.data;

		}




	public static void main(String[] args) {

		Delete ob = new Delete();

		Tnode root=null;

		root=ob.BST(root, 10);

		root=ob.BST(root, 5);

		root=ob.BST(root, 4);

		root=ob.BST(root, 8);

		root=ob.BST(root, 6);

		root=ob.BST(root, 7	);

		root=ob.BST(root, 8);

		root=ob.BST(root, 12);

		root=ob.BST(root, 11);

//		ob.inorder(root);

		ob.delete(root, 5);

		ob.level(root);

		System.out.println("search= "+ob.search(root,9));

		System.out.println("Depth="+ob.depth(root));

	}

}


