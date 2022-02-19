package DepthFirstSearch;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class PathWithSequence {
    public PathWithSequence(){
        BinaryTree myTree = new BinaryTree(2);
        Node root = myTree.root;
        int[] sequence = new int[] {1,3,8};
        System.out.println(checkForSequence(root, sequence, 0));
    }

    boolean checkForSequence(Node node, int[] sequence, int sIndex){
        // if(){}
        if((sIndex == sequence.length) && node == null) return true;
        if(node.value == sequence[sIndex]){
            if(checkForSequence(node.left, sequence, sIndex+1)) { return true; };
            if(checkForSequence(node.right, sequence, sIndex+1)) { return true; };
        }
        return false;
    }
}
