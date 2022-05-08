package dsa.interview;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTree {
    static Node root;


    private void insert(int value) {
        if(root == null) {
            root = new Node(value);
            return;
        }
        Node temp;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if(temp.left == null) {
                temp.left = new Node(value);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right == null) {
                temp.right = new Node(value);
                break;
            }
            else
                q.add(temp.right);
        }
    }
    private void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    private void levelorder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node node = q.peek();
            q.remove();
            System.out.print(node.data + " ");
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        CreateBinaryTree bt = new CreateBinaryTree();
        bt.insert(5);
        bt.insert(6);
        bt.insert(7);
        bt.insert(8);
        bt.insert(9);
        bt.insert(1);
        bt.insert(2);

        System.out.println("Inorder");
        bt.inorder(root);
        System.out.println("\nLevel order");
        bt.levelorder(root);
    }


}
