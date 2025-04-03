Data Structures and Algorithms my notes - https://docs.google.com/document/d/1LAXWpE91545MvzdL0LV7mk1-_WRt-alFcPa1YYmLiCk/edit?usp=sharing

## Data Structures & Algorithms (DSA) short note from ChatGPT

## **1. Arrays**
- Fixed-size, contiguous memory allocation.
- Fast access (O(1) for indexing), but costly insertion/deletion (O(n)).
- Example:
  ```java
  int[] arr = {1, 2, 3};
  ```

## **2. Linked List**
- Dynamic size, elements stored in nodes with pointers.
- Efficient insertion/deletion (O(1) at head/tail), but slow lookup (O(n)).
- Types: **Singly Linked List**, **Doubly Linked List**, **Circular Linked List**.
- Example:
  ```java
  class Node {
      int data;
      Node next;
      Node(int data) { this.data = data; this.next = null; }
  }
  ```

## **3. Stack (LIFO)**
- Operations: `push()`, `pop()`, `peek()`.
- Implemented using **Array** or **Linked List**.
- Example:
  ```java
  Stack<Integer> stack = new Stack<>();
  stack.push(10);
  stack.pop();
  ```

## **4. Queue (FIFO)**
- Operations: `enqueue()`, `dequeue()`, `peek()`.
- Types: **Simple Queue**, **Circular Queue**, **Priority Queue**, **Deque**.
- Example:
  ```java
  Queue<Integer> queue = new LinkedList<>();
  queue.add(1);
  queue.poll();
  ```

## **5. HashMap (Key-Value Pair)**
- Unordered, fast lookup (O(1) average, O(n) worst-case due to collisions).
- Example:
  ```java
  Map<String, Integer> map = new HashMap<>();
  map.put("Alice", 25);
  System.out.println(map.get("Alice"));
  ```

## **6. Set (Unique Elements)**
- Types: **HashSet (O(1))**, **TreeSet (O(log n), sorted)**, **LinkedHashSet (insertion order maintained)**.
- Example:
  ```java
  Set<Integer> set = new HashSet<>();
  set.add(5);
  ```

## **7. Trees**
- **Binary Tree:** Each node has at most 2 children.
- **Binary Search Tree (BST):** Left < Root < Right.
- **Balanced Trees:** AVL, Red-Black Tree.
- Example:
  ```java
  class TreeNode {
      int val;
      TreeNode left, right;
      TreeNode(int x) { val = x; }
  }
  ```

## **8. Graphs**
- **Representation:** Adjacency List (Efficient) or Adjacency Matrix.
- **Traversal Algorithms:** BFS (Queue), DFS (Stack/Recursion).
- Example BFS:
  ```java
  Queue<Integer> q = new LinkedList<>();
  q.add(startNode);
  while (!q.isEmpty()) { int node = q.poll(); }
  ```

## **9. Sorting Algorithms**
- **O(n log n):** Merge Sort, Quick Sort, Heap Sort.
- **O(n²):** Bubble Sort, Selection Sort, Insertion Sort.
- Example Quick Sort:
  ```java
  void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }
  ```

## **10. Searching Algorithms**
- **Linear Search (O(n))** – Unsorted arrays.
- **Binary Search (O(log n))** – Sorted arrays only.
- Example Binary Search:
  ```java
  int binarySearch(int[] arr, int x) {
      int low = 0, high = arr.length - 1;
      while (low <= high) {
          int mid = low + (high - low) / 2;
          if (arr[mid] == x) return mid;
          if (arr[mid] < x) low = mid + 1;
          else high = mid - 1;
      }
      return -1;
  }
  ```

## **11. Time Complexity Cheatsheet**
| Operation       | Array | Linked List | Stack | Queue | HashMap | BST (Balanced) |
|----------------|-------|-------------|--------|--------|---------|---------------|
| Access        | O(1)  | O(n)        | O(1)   | O(n)   | O(1)    | O(log n)      |
| Search        | O(n)  | O(n)        | O(n)   | O(n)   | O(1)    | O(log n)      |
| Insert        | O(n)  | O(1)        | O(1)   | O(1)   | O(1)    | O(log n)      |
| Delete        | O(n)  | O(1)        | O(1)   | O(1)   | O(1)    | O(log n)      |

## **12. Important Concepts**
- **Recursion:** Base case + recursive case, used in DFS, trees.
- **Dynamic Programming:** Stores previous results to avoid recomputation.
- **Greedy Algorithms:** Locally optimal choices.
- **Divide & Conquer:** Split problem into smaller subproblems.
