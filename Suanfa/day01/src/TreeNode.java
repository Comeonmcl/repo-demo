import java.util.*;


class Tree{
    public static void main(String[] args) {
        TreeNode treeNode2=new TreeNode(1);
        TreeNode treeNode3=new TreeNode(3);
     TreeNode treeNode1=new TreeNode(2,treeNode2,treeNode3);
        List<Integer> list = Solution09.preorderTraversal(treeNode1);
        for(int l:list){
            System.out.println(l);
        }
    }
}



public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution09 {
    public static List<Integer> preorderTraversal(TreeNode root) {//前序遍历
      List<Integer>result=new ArrayList<>();
        preorder(root,result);
        return result;
    }

    private  static void preorder(TreeNode root, List<Integer> result) {
        if(root==null){
            return;
        }
        result.add(root.val);//中
        preorder(root.left,result);//左
        preorder(root.right,result);//右
    }
    public List<Integer> postorderTraversal(TreeNode root) {//中序遍历
        List<Integer> result=new ArrayList<>();
        postorder(root,result);
        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if(root==null)return;
        preorder(root.left,result);//左
        result.add(root.val);//中
        preorder(root.right,result);//右
    }

    public  List<Integer> preorderTraversal02(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode>stack=new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            result.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }

        return result;
    }

}
class Solution15 {
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer>result=new ArrayList<>();
     Deque<TreeNode>stack=new LinkedList<>();
     TreeNode cur=root;
     if(cur==null)return result;
     while(cur!=null||!stack.isEmpty()){
         if(cur!=null){
             stack.push(cur);
             cur=cur.left;
         }else{
             //result.add(stack.pop().val);这样就是错的 在弹出元素后
             // 我们要将指针移动到这个元素上，然后判断这个元素的右子树是否存在是否辟谣加入到栈里面去
             cur=stack.pop();
             result.add(cur.val);
             cur=cur.right;
         }
     }
     ArrayList<Integer>list=new ArrayList<>();
     return result;
    }
}
