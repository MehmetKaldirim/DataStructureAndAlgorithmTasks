package CalculateInvoice.lcp;

public class Solutioin {
    public static void main(String[] args) {

        TreeNode rootTreeNode = new TreeNode(3);


        TreeNode rootRight = new TreeNode(1);
        TreeNode rootRightRight = new TreeNode(8);
        TreeNode rootRightLeft = new TreeNode(0);

        rootRight.rightChild = rootRightRight;
        rootRight.leftChild = rootRightLeft;

//        ================================================

        TreeNode rootLeft = new TreeNode(5);
        TreeNode rootLeftRight = new TreeNode(2);
        TreeNode rootLeftLeft = new TreeNode(6);
        TreeNode rootLeftRightRight = new TreeNode(4);
        TreeNode rootLeftRightLeft = new TreeNode(7);

        rootLeftRight.rightChild = rootLeftRightRight;
        rootLeftRight.leftChild = rootLeftRightLeft;
        rootLeft.rightChild = rootLeftRight;
        rootLeft.leftChild = rootLeftLeft;

        rootTreeNode.rightChild = rootRight;
        rootTreeNode.leftChild = rootLeft;

        System.out.println(lowestCommonAncestor(rootTreeNode, rootLeftRightRight, rootRightRight).value);



    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isLeftChild&&isRight)

        return lowestCommonAncestor(root,p,q);
    }
}
