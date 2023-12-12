package CompleteBT;

import java.util.LinkedList;

class ChainingHashTable {
  private static final int SIZE = 12;
  private LinkedList<Integer>[] table;

  public ChainingHashTable() {
    table = new LinkedList[SIZE];
    for (int i = 0; i < SIZE; i++) {
      table[i] = new LinkedList<>(); // Initialize each slot with an empty linked list
    }
  }

  public void insert(int value) {
    int index = hashFunction(value);
    table[index].add(value);
  }

  public boolean search(int value) {
    int index = hashFunction(value);
    return table[index].contains(value);
  }

  public void display() {
    for (int i = 0; i < SIZE; i++) {
      System.out.println("Index " + i + ": " + table[i]);
    }
  }

  private int hashFunction(int value) {
    return value % SIZE;
  }

  public static void main(String[] args) {
    ChainingHashTable chainingTable = new ChainingHashTable();
    int[] data = {5, 3, 7, 11, 10, 20, 30, 9, 14, 22, 29};

    for (int value : data) {
      chainingTable.insert(value);
    }

    System.out.println("Chaining Hash Table:");
    chainingTable.display();

    // Search for a value in the hash table
    int searchValue = 22;
    System.out.println("Search for " + searchValue + ": " + chainingTable.search(searchValue));
  }
}