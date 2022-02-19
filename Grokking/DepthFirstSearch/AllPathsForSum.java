package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class AllPathsForSum {
    List<List<Integer>> results = new ArrayList<>();

    public AllPathsForSum() {
        BinaryTree myTree = new BinaryTree(2);
        Node root = myTree.root;
        getAllPaths(root, 11, new ArrayList<>());
        System.out.println(results.toString());
    }

    void getAllPaths(Node node, int targetSum, List<Integer> currentList){
        currentList.add(node.value);
        if(node.left == null && node.right == null){
            if(targetSum - node.value == 0){
                this.results.add(new ArrayList<Integer>(currentList));
            }
        } else {
            getAllPaths(node.left, targetSum - node.value, currentList);
            getAllPaths(node.right, targetSum - node.value, currentList);
        }
        currentList.remove(currentList.size() - 1);
    }
}
