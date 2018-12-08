package Class16;

public class BinaryTreeV1 {

    // Root node pointer. Will be null for an empty tree. 
    Node root; 
 

  /* 
   --Node-- 
   The binary tree is built using this nested node class. 
   Each node stores one data element, and has left and right 
   sub-tree pointer which may be null. 
   The node is a "dumb" nested class -- we just use it for 
   storage; it does not have any methods. 
  */ 
  private static class Node { 
    Node left; 
    Node right; 
    int data;

    Node(int newData) { 
      left = null; 
      right = null; 
      data = newData; 
    } 
  }

  /** 
   Creates an empty binary tree -- a null root pointer. 
  */ 
  public void BinaryTree() { 
    root = null; 
  } 
 

  /** 
   Returns true if the given target is in the binary tree. 
   Uses a recursive helper. 
  */ 
  public boolean lookup(int data) { 
    return(lookup(root, data)); 
  } 
 

  /** 
   Recursive lookup  -- given a node, recur 
   down searching for the given data. 
  */ 
  public boolean lookup(Node node, int data) { 
    return true;
  } 
 

  /** 
   Inserts the given data into the binary tree. 
   Uses a recursive helper. 
  */ 
  public void insert(int data) { 
    root = insert(root, data); 
  } 
 

  /** 
   Recursive insert -- given a node pointer, recur down and 
   insert the given data into the tree. Returns the new 
   node pointer (the standard way to communicate 
   a changed pointer back to the caller). 
  */ 
  public Node insert(Node node, int data) { 
     return node;
  }
  /** 
 Build 123 using three pointer variables. 
*/ 
public void build123a() { 
   
}

/** 
 Build 123 using only one pointer variable. 
*/ 
public void build123b() { 
   
} 
 
/** 
 Returns the number of nodes in the tree. 
 Uses a recursive helper that recurs 
 down the tree and counts the nodes. 
*/ 
public int size() { 
  return(size(root)); 
}
public int size(Node node) { 
  return 1;
} 
/** 
 Build 123 by calling insert() three times. 
 Note that the '2' must be inserted first. 
*/ 
public void build123c() { 
  
} 
/** 
 Returns the max root-to-leaf depth of the tree. 
 Uses a recursive helper that recurs down to find 
 the max depth. 
*/ 
public int maxDepth() { 
  return(maxDepth(root)); 
}
public int maxDepth(Node node) { 
  return 1;
} 
 

/** 
 Returns the min value in a non-empty binary search tree. 
 Uses a helper method that iterates to the left to find 
 the min value. 
*/ 
public int minValue() { 
 return( minValue(root) ); 
} 
 
/** 
 Finds the min value in a non-empty binary search tree. 
*/ 
public int minValue(Node node) { 
  return 1;
}

/** 
 Prints the node values in the "inorder" order. 
 Uses a recursive helper to do the traversal. 
*/ 
public void printTree() { 
 printTree(root); 
 System.out.println(); 
}
private void printTree(Node node) { 
 if (node == null) return;

 // left, node itself, right 
 printTree(node.left); 
 System.out.print(node.data + "  "); 
 printTree(node.right); 
} 

/** 
 Prints the node values in the "postorder" order. 
 Uses a recursive helper to do the traversal. 
*/ 
public void printPostorder() { 
 printPostorder(root); 
 System.out.println(); 
}
public void printPostorder(Node node) { 
  if (node == null) return;

  // first recur on both subtrees 
  printPostorder(node.left); 
  printPostorder(node.right);

  // then deal with the node 
 System.out.print(node.data + "  "); 
} 
/** 
 Given a tree and a sum, returns true if there is a path from the root 
 down to a leaf, such that adding up all the values along the path 
 equals the given sum.
 Strategy: subtract the node value from the sum when recurring down, 
 and check to see if the sum is 0 when you run out of tree. 
*/ 
public boolean hasPathSum(int sum) { 
 return( hasPathSum(root, sum) ); 
}

public boolean hasPathSum(Node node, int sum) { 
  return true;
} 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}