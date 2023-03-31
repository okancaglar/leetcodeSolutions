import java.util.ArrayList;
import java.util.Stack;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root){

        ArrayList<Integer> listL = new ArrayList<>();
        ArrayList<Integer> listR = new ArrayList<>();

        TreeNode iteratorLeft = root.left;
        Stack<TreeNode> lS = new Stack<>();
        lS.push(iteratorLeft);
        while (!lS.isEmpty()&&root.left!=null){
            iteratorLeft = lS.pop();
            listL.add(iteratorLeft.val);
            if (iteratorLeft.right!=null)lS.push(iteratorLeft.right);
            else listL.add(102);
            if (iteratorLeft.left!=null){
                lS.push(iteratorLeft.left);
            }else listL.add(101);
        }

        TreeNode iteratorRight = root.right;
        Stack<TreeNode> lR = new Stack<>();
        lR.push(iteratorRight);
        while (!lR.isEmpty() && root.right!=null){
            iteratorRight = lR.pop();
            listR.add(iteratorRight.val);

            if (iteratorRight.left!=null)lR.push(iteratorRight.left);
            else listR.add(102);
            if (iteratorRight.right!=null)lR.push(iteratorRight.right);
            else listR.add(101);
        }
        if (listR.size()!= listL.size()) return false;
        for (int i = 0; i < listL.size(); i++) {
            if (listR.get(i) != listL.get(i)) return false;
        }
        return true;
    }

    /* ALTERNATE SOLUTION!!
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);

    }

    private boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }

        if (l == null || r == null) {
            return false;
        }
        return l.val == r.val && isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
    */
}
