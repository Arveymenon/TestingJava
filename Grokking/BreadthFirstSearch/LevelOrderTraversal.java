package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class LevelOrderTraversal {

    List<List<Integer>> bfs = new ArrayList<>();

    public LevelOrderTraversal(){
        BinaryTree mytree = new BinaryTree(2);
        Node root = mytree.root;

        this.createBFS(root, 0);
        System.out.println(this.bfs.toString());
    }

    public void createBFS(Node node, int level){
        if(node != null){
            List<Integer> levelData;

            if(bfs.size() > level){
                levelData = bfs.get(level);
                levelData.add(node.value);
            } else {
                levelData = new ArrayList<>();
                levelData.add(node.value);
                this.bfs.add(level, levelData);
            }
    
            // this.bfs.ad;
            int currentLevel = level + 1;
            createBFS(node.left, currentLevel);
            createBFS(node.right, currentLevel);
        }
    }
}