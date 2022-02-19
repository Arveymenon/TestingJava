package BreadthFirstSearch.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class Problem1 {
    public Problem1(){
        BinaryTree myTree = new BinaryTree(3);
        Node root = myTree.root;

        List<Node> results = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node prev = null, first = null;
        while (!queue.isEmpty()) {
            int count = queue.size();

            for(int i = 0; i < count; i++){
                Node node = queue.remove();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

                if(prev != null){
                    prev.right = node;
                } else {
                    first = node;
                }
                prev = node;
            }
            
            results.add(first);
        }
        Node node = first;
        while(node != null) {
            System.out.println(node.value);
            node = node.right;
        }

    }
}
