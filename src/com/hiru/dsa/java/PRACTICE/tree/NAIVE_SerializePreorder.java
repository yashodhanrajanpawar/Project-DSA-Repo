package com.hiru.dsa.java.PRACTICE.tree;

import com.hiru.dsa.java.PRACTICE.tree.impl.MyBinarySearchTree;
import com.hiru.dsa.java.PRACTICE.tree.impl.MyNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * How to Serialize:
 * >>>>>>>>>>>>>>> FUNC_PREORDER (root, outputStrList) >>>>>>>>>>>>>>>
 * ......... BASE--> :  add "-" for null
 * ......... PREORDER--> outputStrList.add(new String(root.data));
 * ......... PREORDER--> FUNC_PREORDER(root.left,encoded)
 * ......... PREORDER--> FUNC_PREORDER(root.right,encoded)
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * How to De-Serialize:
 * ..........Node FUNC_PREORDER (Iterator<String> iter)
 * ..........BASE --> RETURN Null if iter.hasNext() == false...else
 * ..........BASE--> RETURN null for "-".... else.....
 * ..........PREORDER--> root = new Node(iterSerialized.next());
 * ..........PREORDER--> root.left = FUNC_PREORDER(iter)
 * ..........PREORDER--> root.right = FUNC_PREORDER(iter)
 * ..........PREORDER --> RETURN root;
 */
public class NAIVE_SerializePreorder {
    /**
     * ===========================================================
     * [PRE-ORDER] Serialize as List of String with "-" String representation for NULL children
     * ===========================================================
     */
    static void serialize(MyNode root, List<String> encoded) {
        // Base (Leaf node)
        if (root == null) {
            encoded.add("-");
            return;
        }
        //Preorder and update string
        encoded.add(root.data + ""); // Add root
        serialize(root.left, encoded); // Recurse left**
        serialize(root.right, encoded); // Recurse right**

    }

    /**
     * ===========================================================
     * [PRE-ORDER] Deserialize Above tree from List of String to bst and return root
     * ===========================================================
     */
    public static MyNode deserialize(Iterator<String> iter) {
        if (iter.hasNext()) {
            String dataStr = iter.next();
            if (dataStr == "-") {
                return null;
            }
            MyNode root = new MyNode(Integer.parseInt(dataStr));
            root.left = deserialize(iter);
            root.right = deserialize(iter);
            return root;
        }
        return null;
    }


    public static void main(String args[]) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        int[] input = new int[]{6, 5, 2, 1, 3, 8, 7, 9};
        System.out.println("==== Construct Tree: " + Arrays.toString(input));

        bst.insertAll(input);
        System.out.println("==== PreOrder Constructed Tree");
        bst.traversePreorder(bst.root);
        ArrayList<String> encoded = new ArrayList<>();
        System.out.println("\n==== Serialize Tree");
        serialize(bst.root, encoded);
        System.out.println("Serialized tree: " + encoded); // Serialize
        System.out.println("==== DE-Serialize Tree");
        MyNode reconstructedRoot = deserialize(encoded.iterator());
        encoded = new ArrayList<>();
        System.out.println("==== Serialize Tree");
        serialize(reconstructedRoot, encoded);
        System.out.println("Re-Serialized tree(From De-serialized Version): " + encoded); // Serialize
    }
}
