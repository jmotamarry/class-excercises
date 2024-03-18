import java.lang.Math;

public class AVLTree {
    TreeNode root;

    public AVLTree() {
        root = null;
    }

    public boolean insert(int value, TreeNode currNode) {
        if (root == null) {
            root = new TreeNode(value);
            root.height = computeHeightFromChildren(root)
            return true;
        }
        if (value > currNode.value) {
            if (currNode.right == null) {
                currNode.right = new TreeNode(value);
                return true;
            }
            insert(value, currNode.right);
        } else {
            if (currNode.left == null) {
                currNode.left = new TreeNode(value);
                return true;
            }
            insert(value, currNode.left);
        }
        return false;
    }

    public int computeHeightFromChildren(TreeNode curr) {
        if (curr != null) {
            return Math.max(computeHeightFromChildren(curr.left), computeHeightFromChildren(curr.right)) + 1;
        } else {
            return -1;
        }
    }

    public int getBalance(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        return curr.left.height - curr.right.height;
    }

    public TreeNode leftRotate(TreeNode curr) {
        TreeNode newRoot = curr.right;
        TreeNode T2 = newRoot.left;
        newRoot.left = curr;
        curr.right = T2;
        curr.height = computeHeightFromChildren(curr);
        newRoot.height = computeHeightFromChildren(newRoot);
        return newRoot;
    }

    public TreeNode rightRotate(TreeNode curr) {
        TreeNode newRoot = curr.left;
        curr.left = newRoot.right;
        newRoot.right = curr;
        curr.height = computeHeightFromChildren(curr);
        newRoot.height = computeHeightFromChildren(newRoot);
        return newRoot;
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(5, tree.root);
        tree.insert(6, tree.root);
        tree.insert(7, tree.root);
        tree.leftRotate(tree.root);
    }
}