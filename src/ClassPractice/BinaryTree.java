package ClassPractice;

class Node{
  int data;
  Node left, right;

  Node(int value){
    this.data = value;
    this.left = this.right = null;
  }
}

public class BinaryTree {
  Node root;

  BinaryTree(){
    this.root = null;
  }
  BinaryTree(Node root){
    this.root = root;
  }


  public static void main(String[] args) {

    Node root = new Node(10);

    BinaryTree tree = new BinaryTree(root);
    tree.root.left = new Node(20);
    tree.root.right = new Node(30);

  }
}
