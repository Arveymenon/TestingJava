package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class LevelAverage {
    public LevelAverage(){
        BinaryTree myTree = new BinaryTree(4);
        Node root = myTree.root;

        List<Float> result = new ArrayList<>();
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(root);
        
        while(myQueue.size() > 0){
            int count = myQueue.size();

            int total = 0;
                        
            int i = 0;
            while(i < count){
                Node node = myQueue.remove();
                if(node.left != null) myQueue.add(node.left);
                if(node.right != null) myQueue.add(node.right);
                i++;
                total += node.value;
            }
            result.add((float) total/count);
        }

        System.out.println(result.toString());
    }
}
