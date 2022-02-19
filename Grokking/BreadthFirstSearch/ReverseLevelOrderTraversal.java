package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

import BreadthFirstSearch.BinaryTree.*;

public class ReverseLevelOrderTraversal {
    
    List<List<Integer>> bfs = new ArrayList<>();
    int height;
    
    public ReverseLevelOrderTraversal(){
        BinaryTree mytree = new BinaryTree(4);
        Node root = mytree.root;

        this.createBFS(root, 0);
        System.out.println(this.bfs.toString());
    }

    public void createBFS(Node node, int level){
        if(node != null){
            int currentLevel = level + 1;
            createBFS(node.left, currentLevel);
            createBFS(node.right, currentLevel);
            
            List<Integer> levelData;

            level = this.height - level;

            if(bfs.size() > level){
                levelData = bfs.get(level);
                levelData.add(node.value);
            } else {
                levelData = new ArrayList<>();
                levelData.add(node.value);
                this.bfs.add(level, levelData);
            }
    
            // this.bfs.ad;
        } else {
            this.height = level - 1;
        }
    }
}
