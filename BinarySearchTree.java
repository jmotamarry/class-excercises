public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode search(int value) {
        TreeNode currNode = root;

        while (currNode != null && currNode.value != value) {
            if (currNode.value < value) {
                currNode = currNode.left;
            } else if (currNode.value > value) {
                currNode = currNode.right;
            }
        }

        return currNode;
    }

    // my insertion policy is go left
    public void insert(TreeNode node) {
        TreeNode curr = root;

        while (curr != null) {
            if (node.value <= curr.value) {
                curr = curr.left;
            } else if (node.value > curr.value) {
                curr = curr.right;
            }
        }

        System.out.println(curr);
        curr = node;
    }

    public void travel(TreeNode node) {
        while (node != null) {
            travel(node.left);
            System.out.println(node.value + " -> ");
            travel(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        tree.insert(node2);
        System.out.println(tree.search(10));
    }
}