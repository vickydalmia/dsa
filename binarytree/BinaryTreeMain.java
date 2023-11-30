package binarytree;

public class BinaryTreeMain {

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":" );
        if(root.left != null){
            System.out.print(" L"+root.left.data);
        }
        if(root.right != null){
            System.out.print(" R"+ root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(8);
        BinaryTreeNode<Integer> leftRight = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> rightLeft = new BinaryTreeNode<Integer>(2);
        root.left = left;
        root.right = right;
        left.right = leftRight;
        right.left = rightLeft;

        printTree(root);
    }
}
