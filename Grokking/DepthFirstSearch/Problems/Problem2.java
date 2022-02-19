package DepthFirstSearch.Problems;

import BreadthFirstSearch.BinaryTree.Node;

public class Problem2 {
    int maxSum = 0;
    public Problem2(){
        Tree myTree = new Tree();
        Node root = myTree.root;
        
        getLongestBranch(root);
        System.out.println(maxSum);
    }

    int getLongestBranch(Node node){
        if(node == null) return 0;

        int left = Math.max(getLongestBranch(node.left), 0);
        int right = Math.max(getLongestBranch(node.right),0);

        maxSum = Math.max(left + right + node.value, maxSum);
        
        return Math.max(left, right) + node.value;
    }

    class Tree{
        Node root = new Node(1);
        public Tree(){
            root.left = new Node(2);
            root.right = new Node(3);
            
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.left = new Node(5);
            root.right.right = new Node(6);
            
            root.right.left.left = new Node(7);
            root.right.left.right = new Node(-8);
            root.right.right.right = new Node(9);
        }
    }
}
