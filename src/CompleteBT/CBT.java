package CompleteBT;

/*
* Create complete binary with following operations
1.       Insert
2.       Update
3.       Delete
4.       Search
* */


class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}

public class CBT {
  private Node root;

  public CBT() {
    root = null;
  }

  // Insert a key into the BST
  public void insert(int key) {
    root = insertRec(root, key);
  }

  private Node insertRec(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }

    if (key < root.key)
      root.left = insertRec(root.left, key);
    else if (key > root.key)
      root.right = insertRec(root.right, key);

    return root;
  }

  // Update a key in the BST
  public void update(int oldKey, int newKey) {
    root = deleteRec(root, oldKey);
    root = insertRec(root, newKey);
  }

  // Delete a key from the BST
  public void delete(int key) {
    root = deleteRec(root, key);
  }

  private Node deleteRec(Node root, int key) {
    if (root == null)
      return root;

    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else {
      // Node with only one child or no child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // Node with two children: Get the inorder successor (smallest
      // in the right subtree)
      root.key = minValue(root.right);

      // Delete the inorder successor
      root.right = deleteRec(root.right, root.key);
    }

    return root;
  }

  private int minValue(Node root) {
    int minValue = root.key;
    while (root.left != null) {
      minValue = root.left.key;
      root = root.left;
    }
    return minValue;
  }

  // Search for a key in the BST
  public boolean search(int key) {
    return searchRec(root, key);
  }

  private boolean searchRec(Node root, int key) {
    if (root == null)
      return false;

    if (key == root.key)
      return true;

    if (key < root.key)
      return searchRec(root.left, key);
    else
      return searchRec(root.right, key);
  }

  // Example usage
  public static void main(String[] args) {
    CBT tree = new CBT();

    // Insert keys
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    // Search for a key
    System.out.println("Search 20: " + tree.search(20)); // true
    System.out.println("Search 90: " + tree.search(90)); // false

    // Update a key
    tree.update(20, 25);

    // Delete a key
    tree.delete(30);

    // Print inorder traversal of the BST
    System.out.println("Inorder traversal:");
    tree.inorder();
  }

  // Inorder traversal of the BST
  private void inorder() {
    inorderRec(root);
  }

  private void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.key + " ");
      inorderRec(root.right);
    }
  }
}

