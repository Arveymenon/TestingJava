package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

// import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class MinimumDepth {
    public MinimumDepth(){
        BST myTree = new BST();
        Node root = myTree.root;

        System.out.println(getMinimumDepth(root));
    }

    public int getMinimumDepth(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        int height = 1;
        while(!queue.isEmpty()){
            int count = queue.size();

            for(int i = 0; i < count; i++){
                Node qNode = queue.remove();
                if(qNode.left == null && qNode.right == null){
                    return height;
                }
                if(qNode.left != null) queue.add(qNode.left);
                if(qNode.right != null) queue.add(qNode.right);
            }
            height++;
        }

        return height;
    }

    class BST{
        Node root = new Node(1);
        BST(){
            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);

            root.left.right.left = new Node(6);
        }

    }
}
