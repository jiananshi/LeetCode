class MyHashMap {
    class Node {
      public int key, value;
      public Node next;
      public Node(int key, int value) {
        this.key = key;
        this.value = value;
      }
    }
  
    int capacity;
    Node[] bucket;

    /** Initialize your data structure here. */
    public MyHashMap() {
      capacity = 10000;
      bucket = new Node[capacity];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
      int hash = key % capacity;
      Node node = bucket[hash];
      while (node != null) {
        if (node.key == key) {
          node.value = value;
          return;
        }
        node = node.next;
      }
      Node n = new Node(key, value);
      n.next = bucket[hash];
      bucket[hash] = n;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
      int hash = key % capacity;
      Node node = bucket[hash];
      while (node != null) {
        if (node.key == key) {
          return node.value;
        }
        node = node.next;
      }
      return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
      int hash = key % capacity;
      Node prev = null;
      Node cur = bucket[hash];
      while (cur != null) {
        if (cur.key == key) {
          if (prev == null) {
            bucket[hash] = cur.next;
          } else {
            prev.next = cur.next;
          }
          return;
        }
        prev = cur;
        cur = cur.next;
      }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

