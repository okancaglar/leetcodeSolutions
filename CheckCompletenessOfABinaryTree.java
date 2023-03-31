import java.util.ArrayList;

public class CheckCompletenessOfABinaryTree {
    public boolean isComplete(TreeNode root){

        int size = countTree(root);


        return completeChecker(root,0,size);
    }
    public boolean completeChecker(TreeNode root, int index, int count){
        if (root == null){
            return true;
        } else if (index >= count) {
            return false;
        }
        return completeChecker(root.left, 2*index+1, count) && completeChecker(root.right, 2*index+2, count);
    }

    public int countTree(TreeNode root){

        if (root!=null){
            return countTree(root.left) + countTree(root.right) + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        CheckCompletenessOfABinaryTree test = new CheckCompletenessOfABinaryTree();
        TreeNode testTree = new TreeNode();
        testTree = new TreeNode(4);
        testTree.left = new TreeNode(9);
        //testTree.left.left = new TreeNode(5);
        testTree.left.right = new TreeNode(1);
        testTree.right = new TreeNode(0);
        System.out.println(test.isComplete(testTree));



    }

    /*ALTERNATE SOLUTION
    * public boolean isCompleteTree(TreeNode root) {
        return process(root).isCBT;
    }
    //判断是否是完全二叉树
    //左树 右树是否是完全二叉树
    //左树 右树是否是满二叉树
    //左树右树的高度

    public class Info{
        public boolean isCBT;
        public boolean isFull;
        public int height;

        public Info(boolean C, boolean F, int H){
            isCBT = C;
            isFull = F;
            height = H;
        }
    }
    public Info process(TreeNode root){
        if(root == null){
            return new Info(true, true, 0);
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);

        boolean isFull = (leftInfo.isFull && rightInfo.isFull) && (leftInfo.height == rightInfo.height);
        //可能性1：满树
        //可能性2：左满 右不满 高度一样
        //可能性3：左不满 右满 高度差为一
        boolean isCBT = false;
        isCBT = isFull || (leftInfo.isFull && rightInfo.isCBT &&(leftInfo.height == rightInfo.height)) || (leftInfo.isCBT && rightInfo.isFull && (leftInfo.height - rightInfo.height == 1));
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(isCBT, isFull, height);
    }*/


}
