public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root){

        return sumTraversal(root,"");
    }

    public int sumTraversal(TreeNode root, String num){


        if (root.left != null || root.right!=null){

            int num1=0;
            int num2 = 0;

            if (root.left!=null){num1 = sumTraversal(root.left, num + String.valueOf(root.val));}
            if (root.right!=null){num2 = sumTraversal(root.right, num + String.valueOf(root.val));}

            return num1 + num2;
        }
        return Integer.parseInt(num + String.valueOf(root.val));
    }

    public static void main(String[] args) {
        SumRootToLeafNumbers test = new SumRootToLeafNumbers();
        TreeNode testTree = new TreeNode();
        testTree = new TreeNode(4);
        testTree.left = new TreeNode(9);
        testTree.left.left = new TreeNode(5);
        testTree.left.right = new TreeNode(1);
        testTree.right = new TreeNode(0);
        System.out.println(test.sumNumbers(testTree));
    }


    /* ALTERNATE SOLUTION
     public int sumNumbers(TreeNode root) {
           return sumNumbersUtils(root, new ArrayList<>(), new int[1]);
    }

     private static int sumNumbersUtils(TreeNode root, List<Integer> sum , int[] totalSum)
    {
        if(root  == null)
        {
            return 0;
        }
        sum.add(root.val);
        if(root.left == null && root.right == null)
        {
            for (int i = 0; i < sum.size(); i++) {
                totalSum[0] += (int)(Math.pow(10,sum.size()-1-i) )* sum.get(i);
            }
        }

        sumNumbersUtils(root.left, sum, totalSum );

        sumNumbersUtils(root.right, sum, totalSum);
        sum.remove(sum.size()-1);

        return totalSum[0];
    }
    */


}
