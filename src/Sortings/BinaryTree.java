package Sortings;

public class BinaryTree {

    static class Node{
      int data;
      Node left, right;

      Node(int data){
        this.data = data;
        left = right = null;
      }
    }

    static Node root;

    BinaryTree(){
      root = null;
    }

    static void insert(int data){
      root = insertRec(root, data);
    }

    static Node insertRec(Node root, int data){
      if (root == null){
        root = new Node(data);
        return root;
      }

      if (data < root.data){
        root.left = insertRec(root.left, data);
      }else if (data > root.data){
        root.right = insertRec(root.right, data);
      }

      return root;
    }

    static void inorder(){
      inorderRec(root);
    }

    static void inorderRec(Node root){
      if (root != null){
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
      }
    }

    static void deleteKey(int key){
      root = deleteRec(root, key);
    }

    static Node deleteRec(Node root, int key){
      if (root == null){
        return root;
      }

      if (key < root.data){
        root.left = deleteRec(root.left, key);
      }else if (key > root.data){
        root.right = deleteRec(root.right, key);
      }else {
        if (root.left == null){
          return root.right;
        }else if (root.right == null){
          return root.left;
        }

        root.data = minValue(root.right);

        root.right = deleteRec(root.right, root.data);
      }

      return root;
    }

    static int minValue(Node root){
      int minv = root.data;
      while (root.left != null){
        minv = root.left.data;
        root = root.left;
      }
      return minv;
    }

    public static void main(String[] args) {

      BinaryTree tree = new BinaryTree();

      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(60);
      tree.insert(80);

      tree.inorder();

      tree.deleteKey(20);

      System.out.println();

      tree.inorder();

    }
}
