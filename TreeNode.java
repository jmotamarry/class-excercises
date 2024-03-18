public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    int height;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
        height = -1;
    }
}