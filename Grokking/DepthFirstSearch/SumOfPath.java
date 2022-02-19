package DepthFirstSearch;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class SumOfPath {
    int sum = 0;
    public SumOfPath(){
        BinaryTree myTree = new BinaryTree(2);
        Node root = myTree.root;
        myTree.printTree(root);

        this.getSum(root, 0);
        System.out.println(this.sum);
    }

    void getSum(Node node, int c_sum){
        if(node.left == null && node.right == null){
            this.sum += c_sum + node.value;
        } else {
            this.getSum(node.left, (c_sum + node.value) * 10);
            this.getSum(node.right, (c_sum + node.value) * 10);
        }
    }
}
