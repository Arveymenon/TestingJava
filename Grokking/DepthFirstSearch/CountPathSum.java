package DepthFirstSearch;

import java.util.Scanner;

import BreadthFirstSearch.BinaryTree.Node;

public class CountPathSum {
    int count = 0;
    public CountPathSum(){
        Tree myTree = new Tree();
        // int checkSum = new Scanner(System.in).nextInt();
        int checkSum = 12;

        this.getCount(myTree.root, checkSum);
        System.out.println(count);
    }

    void getCount(Node node, int sum){
        if(node == null) return;
        if(node.left == null && node.right == null && sum - node.value == 0) {count++; return;};

        getCount(node.left, sum - node.value);
        getCount(node.left, sum);

        getCount(node.right, sum - node.value);
        getCount(node.right, sum);
    }

    class Tree{
        Node root = new Node(1);
        Tree(){
            root.left = new Node(7);
            root.right = new Node(9);

            root.left.left = new Node(6);
            root.left.right = new Node(5);
            root.right.left = new Node(2);
            root.right.right = new Node(3);
        }
    }
}
