package BinaryTree;

public class BinarySearchTree {

	Tree tree = new Tree(70);

	public static void main(String[] args) {

		BinarySearchTree obj = new BinarySearchTree();

		int root = obj.tree.addTree(4, 0);
		root = obj.tree.addTree(5, root);
		root = obj.tree.addTree(1, root);
		root = obj.tree.addTree(2, root);
		root = obj.tree.addTree(6, root);
		root = obj.tree.addTree(11, root);
		root = obj.tree.addTree(8, root);
		root = obj.tree.addTree(3, root);
		root = obj.tree.addTree(14, root);

		obj.tree.listTree(root);
	}

	class Tree {

		private Integer[] tree;

		public Tree(Integer size) {
			tree = new Integer[size];
		}

		public void listTree(int root) {

			if (!leftNodeEmpty(root)) {
				listTree(root * 2 + 1);
			}
			System.out.println(tree[root]);
			if (!rightNodeEmpty(root)) {
				listTree(root * 2 + 2);
			}

		}

		private boolean isTreeEmpty() {

			if (tree[0] == null) {
				return true;
			}
			return false;
		}

		public int addTree(int node, int root) {
			if (isTreeEmpty()) {
				tree[0] = node;
				return 0;
			}

			if (node < tree[root]) {
				if (leftNodeEmpty(root)) {
					tree[root * 2 + 1] = node;
					return 0;
				} else {
					addTree(node, root * 2 + 1);
				}
			} else if (node > tree[root]) {
				if (rightNodeEmpty(root)) {
					tree[root * 2 + 2] = node;
					return 0;
				} else {
					addTree(node, root * 2 + 2);
				}

			}
			return 0;
		}

		private boolean rightNodeEmpty(int root) {
			if (tree[root * 2 + 2] == null)
				return true;
			return false;
		}

		private boolean leftNodeEmpty(int root) {
			if (tree[root * 2 + 1] == null)
				return true;
			return false;
		}

	}

}
