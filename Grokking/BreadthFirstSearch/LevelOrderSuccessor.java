package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

// import BreadthFirstSearch.BinaryTree.BinaryTree;
import BreadthFirstSearch.BinaryTree.Node;

public class LevelOrderSuccessor {

    public LevelOrderSuccessor(){
        BST myTree = new BST();
        Node root = myTree.root;

        System.out.println(getMinimumDepth(root, 12));
    }

    public int getMinimumDepth(Node node, int successor) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int count = queue.size();

            for(int i = 0; i < count; i++){
                Node qNode = queue.remove();
                if(qNode.left != null) queue.add(qNode.left);
                if(qNode.right != null) queue.add(qNode.right);

                if(qNode.value == successor){
                    return queue.remove().value;
                }
            }
        }

        return 0;
    }

    class BST{
        Node root = new Node(12);
        BST() {
            root.left = new Node(7);
            root.right = new Node(1);
            root.left.left = new Node(9);
            root.right.left = new Node(10);
            root.right.right = new Node(5);
        }

    }
}