package Assignments;

class TreeNode {
  int data;
  TreeNode left, right;

  public TreeNode(int item) {
    data = item;
    left = right = null;
  }
}

public class CBT {
  private TreeNode root;

  public CBT() {
    root = null;
  }

  public void insert(int[] values) {
    for (int value : values) {
      root = insertRec(root, value);
    }
  }

  private TreeNode insertRec(TreeNode root, int value) {
    if (root == null) {
      root = new TreeNode(value);
      return root;
    }

    if (value <= 14 / 2) {
      root.left = insertRec(root.left, value);
    } else {
      root.right = insertRec(root.right, value);
    }

    return root;
  }

  public void inorder() {
    System.out.println("Inorder traversal:");
    inorderRec(root);
    System.out.println();
  }

  private void inorderRec(TreeNode root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.data + " ");
      inorderRec(root.right);
    }
  }

  public static void main(String[] args) {
    CBT tree = new CBT();
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    tree.insert(values);
    tree.inorder();
  }
}