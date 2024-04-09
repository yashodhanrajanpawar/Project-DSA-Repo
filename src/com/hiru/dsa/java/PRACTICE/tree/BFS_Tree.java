package com.hiru.dsa.java.PRACTICE.tree;

import com.hiru.dsa.java.PRACTICE.tree.impl.MyBinarySearchTree;
import com.hiru.dsa.java.PRACTICE.tree.impl.MyNode;
import com.hiru.dsa.java.PRACTICE._commonUtils.MyLogger;

import java.util.LinkedList;

public class BFS_Tree {
    public static void main(String args[]) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        levelOrderTraverse(tree);

    }

    /**
     * ===================================================================
     * LOT is Tree BFS. Its even more simpler than graph BFS.
     * You just need to process each level element (NESTED FOR()) inside while(q.empty())
     * This will give us control over processing only LEVEL L elements without mixing LEVEL L+1 despite queing them
     * ===================================================================
     */
    static void levelOrderTraverse(MyBinarySearchTree tree) {
        int level = 0;
        LinkedList<MyNode> queue = new LinkedList<>();
        queue.add(tree.root);

        while (queue.isEmpty() == false) {
            // Process level and keep adding next nodes
            int currLevelNodes = queue.size();
            MyLogger.info("BFS/LOT: ------ level----------------" + level++);
            for (int i = 0; i < currLevelNodes; i++) {
                MyNode node = queue.remove();
                MyLogger.info("BFS/LOT: " + node.data);
                // Enqueue next level nodes
                MyNode left = node.getLeft();
                if (left != null) {
                    queue.add(left);
                }
                MyNode right = node.getRight();
                if (right != null) {
                    queue.add(right);
                }
            }
        }
    }
}
