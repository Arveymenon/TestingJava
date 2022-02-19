package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class ConnectLevelOrderSiblings {
    public ConnectLevelOrderSiblings(){
        BinaryTree myTree = new BinaryTree(3);
        Node root = myTree.root;

        List<Node> results = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            Node prev = null, first = null;

            for(int i = 0; i < count; i++){
                Node node = queue.remove();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

                if(prev != null){
                    prev.right = node;
                } else {
                    first = node;
                }
                if(i == count - 1)
                    node.right = null;
                prev = node;
            }
            
            results.add(first);
        }

        for(int i = 0; i < results.size(); i++){
            Node node = results.get(i);
            while(node != null){
                System.out.println(node.value);
                node = node.right;
            }
            System.out.println("---Next List---");
        }

    }
}
