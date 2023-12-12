package CompleteBT;

class LinearProbingHashTable {
  private static final int SIZE = 12;
  private int[] table;

  public LinearProbingHashTable() {
    table = new int[SIZE];
    for (int i = 0; i < SIZE; i++) {
      table[i] = -1; // Initialize all slots to -1 (indicating empty)
    }
  }

  public void insert(int value) {
    int index = hashFunction(value);
    int originalIndex = index;

    while (table[index] != -1) {
      // Linear probing: move to the next slot if the current slot is occupied
      index = (index + 1) % SIZE;

      // If we have traversed the entire table and haven't found an empty slot, break
      if (index == originalIndex) {
        System.out.println("Table is full. Unable to insert " + value);
        return;
      }
    }

    table[index] = value;
  }

  public boolean search(int value) {
    int index = hashFunction(value);
    int originalIndex = index;

    while (table[index] != -1) {
      if (table[index] == value) {
        return true;
      }

      // Linear probing: move to the next slot
      index = (index + 1) % SIZE;

      // If we have traversed the entire table, break
      if (index == originalIndex) {
        break;
      }
    }

    return false;
  }

  public void display() {
    for (int i = 0; i < SIZE; i++) {
      System.out.println(i + ": " + table[i]);
    }
  }

  private int hashFunction(int value) {
    return value % SIZE;
  }

  public static void main(String[] args) {
    LinearProbingHashTable linearProbingTable = new LinearProbingHashTable();
    int[] data = {5, 3, 7, 11, 10, 20, 30, 9, 14, 22, 29};

    for (int value : data) {
      linearProbingTable.insert(value);
    }

    System.out.println("Linear Probing Hash Table:");
    linearProbingTable.display();

    // Search for a value in the hash table
    int searchValue = 22;
    System.out.println("Search for " + searchValue + ": " + linearProbingTable.search(searchValue));
  }
}