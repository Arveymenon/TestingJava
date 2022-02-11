package BreadthFirstSearch.BinaryTree;

public class BinaryTree {
    int level;
    public Node root;
    public BinaryTree(int height){
        this.level = level;

        this.root = new Node(1);
        this.branchOut(this.root, 0, height);
        
        this.printTree(this.root);
    }

    private void branchOut(Node node, int level, int height){
        if(level < height){

            Node left = new Node((2 * node.value));
            Node right = new Node((2 * node.value) + 1);
            node.left = left;
            node.right = right;

            this.branchOut(node.left, level + 1, height);
            this.branchOut(node.right, level + 1, height);
        }
    }

    void printTree(Node root){
        if(root != null){
            System.out.println(root.value);
            printTree(root.left);
            printTree(root.right);
        }
    }

}
