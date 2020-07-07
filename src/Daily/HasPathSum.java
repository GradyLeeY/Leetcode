package Daily;

import java.util.LinkedList;
import java.util.Queue;

/**路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * @author grady
 * @date 2020 20-7-7 下午4:44
 */
public class HasPathSum {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val = x;
        }
    }

    /**
     * 广度有限搜索
     * 使用两个队列分别储存即将遍历的节点，以及根节点到这些节点的路径和
     * @param root
     * @param sum
     * @return
     */
    private static boolean solution(TreeNode root,int sum){
        if (root == null){
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();

        queNode.offer(root);
        queVal.offer(root.val);

        while (!queNode.isEmpty()){
            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if (now.left == null && now.right ==null){
                if (temp == sum){
                    return true;
                }
                continue;
            }
            if (now.left != null){
                queNode.offer(now.left);
                queVal.offer(now.left.val+temp);
            }
            if (now.right != null){
                queNode.offer(now.right);
                queVal.offer(now.right.val+temp);
            }
        }
        return false;
    }

    /**
     * 递归
     * @param root
     * @param sum
     * @return
     */
    private static boolean solution2(TreeNode root,int sum){
        if (root == null){
            return false;
        }
        if (root.left == null && root.right ==null){
            return sum == root.val;
        }
        return solution2(root.left,sum - root.val) || solution2(root.right,sum - root.val);
    }
}
