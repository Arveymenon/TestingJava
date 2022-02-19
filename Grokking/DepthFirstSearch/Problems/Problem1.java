package DepthFirstSearch.Problems;

import BreadthFirstSearch.BinaryTree.Node;

public class Problem1 {
    int maxDiameter = 0;
    public Problem1(){
        Tree myTree = new Tree();
        Node root = myTree.root;

        getDiameter(root);
        System.out.println(maxDiameter);
    }

    int getDiameter(Node node){
        if(node == null)
            return 0;

        int left = node.left != null ? getDiameter(node.left) : 0;
        int right = node.right != null ? getDiameter(node.right) : 0;

        if(left > 0 && right > 0){
            maxDiameter = Math.max(maxDiameter, left + right + 1);
        }

        return Math.max(left, right) + 1;
    }

    class Tree{
        Node root = new Node(1);
        Tree(){
            root.left = new Node(2);
            root.right = new Node(3);
            
            root.right.left = new Node(5);
            root.right.right = new Node(6);
            
            root.right.left.left = new Node(7);
            root.right.left.right = new Node(8);
            
            root.right.right.right = new Node(9);
            
            root.right.left.right.right = new Node(10);
            root.right.right.right.right = new Node(11);
        }
    }
}
