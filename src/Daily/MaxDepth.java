package Daily;

import java.util.LinkedList;
import java.util.Queue;

/**二叉树的最深长度
 * @author grady
 * @date 2020 20-7-28 上午10:49
 */
public class MaxDepth {

    public static void main(String[] args) {

    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    //递归
    private int solution(TreeNode treeNode){
        if (treeNode == null){
            return 0;
        }else {
            int left = solution(treeNode.left);
            int right = solution(treeNode.right);
            return Math.max(left,right)+1;
        }
    }

    /**
     * 广度优先搜索
     * @param treeNode
     * @return
     */
    private int solution2(TreeNode treeNode){
        if (treeNode == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        int ans = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            if (size > 0){
                TreeNode curr = queue.poll();
                if (curr.left != null){
                    queue.offer(curr.left);
                }
                if (curr.right != null){
                    queue.offer(curr.right);
                }
                size --;
            }
            ans ++;
        }
        return ans;
    }
}
