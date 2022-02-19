package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BreadthFirstSearch.BinaryTree.*;
public class ZigZagTraversal {

    List<List<Integer>> bfs = new ArrayList<>();
    
    public ZigZagTraversal(){
        BinaryTree mytree = new BinaryTree(4);
        Node root = mytree.root;
        
        this.createBFS(root, 0);
        System.out.println(this.bfs.toString());
    }
    
    public void createBFS(Node node, int level){
        Queue<Node> levelNodes = new LinkedList<>();
        levelNodes.add(node);

        int i = 0;
        while(levelNodes.size() > 0){

            int level_length = (int) Math.pow(2,i);
            List<Integer> nodes = new ArrayList<>();
            
            for(int j = 0; j < level_length; j++){
                if(levelNodes.peek().left != null) levelNodes.add(levelNodes.peek().left);
                if(levelNodes.peek().right != null) levelNodes.add(levelNodes.peek().right);
                
                if(i%2 == 0){
                    nodes.add(levelNodes.remove().value);
                } else {
                    nodes.add(0, levelNodes.remove().value);
                }
            }
            bfs.add(nodes);
            i++;
        }
    }
}
