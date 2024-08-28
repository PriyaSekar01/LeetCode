public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
public static void main(String args[]){
    SameTree solution = new SameTree();

    TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(solution.isSameTree(p1, q1));

    TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
    TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(solution.isSameTree(p2, q2));
}

}
