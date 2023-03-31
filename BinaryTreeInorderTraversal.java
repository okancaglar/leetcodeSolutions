import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(result,root);
        return result;
    }

    public void inorder(List<Integer> res, TreeNode temp){
        if (temp==null) return;

        inorder(res,temp.left);
        res.add(temp.val);
        inorder(res, temp.right);
    }
}
