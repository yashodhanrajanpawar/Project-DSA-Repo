package com.hiru.dsa.java.COMPANIES.cpng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * =============================================================
 * =============================================================
 * In Memory file System
 * =============================================================
 * =============================================================
 */
public class CPNG_MemFS {

    public static void main(String args[]) {
        CPNG_MemFS fs = new CPNG_MemFS();
        fs.mkdir("ROOT/dir1");
        fs.mkdir("ROOT/dir1/dir5");
        fs.mkdir("ROOT/dir1/dir4");
        fs.mkdir("ROOT/dir1/dir3");
        fs.mkdir("ROOT/dir1/dir2");

        System.out.println(fs.ls("ROOT/dir1"));
        //System.out.println(fs.ls("ROOT/dir1/dir2"));

    }

    public FNode root;

    ///// Constructor
    public CPNG_MemFS() {
        root = new FNode("ROOT",
                true,
                new TreeMap<>(),
                null);
    }

    //===================================================================
    static class FNode {
        String name;
        boolean dir;
        TreeMap<String, FNode> children;
        String content;

        public FNode(String name, boolean dir, TreeMap<String, FNode> children, String contents) {
            this.name = name;
            this.dir = dir;
            this.children = children;
            this.content = contents;
        }
    }

    /**
     * ====================================================
     * ls (List the contents of file/Dir)
     * Lookup in Tree
     * ====================================================
     */
    public List<String> ls(String path) {
        List<String> output = new ArrayList<>();
        List<String> pathContents = parsePath(path);
        if (pathContents.size() > 0) {
            FNode patentNode = root;
            //Iterate through contents
            for (String fname : pathContents) {
                // IF its directory
                if (patentNode.dir == true) {
                    // If Exist the current fnode
                    if (patentNode.children.containsKey(fname)) {
                        patentNode = patentNode.children.get(fname); //Parent update
                    } else {
                        // Not present
                        return output;
                    }
                }
            }
            //parentNode will point to Desired leaf node in path
            //Chekc if dir
            if (patentNode.dir) {
                // Itereate through children
                for (String child : patentNode.children.keySet()) {
                    output.add(patentNode.children.get(child).name);
                }

            } else {
                output.add(patentNode.name);
            }
        }

        return output;
    }

    /**
     * ====================================================
     * Mkdir (create given file/dir including intermediate dirs)
     * Insert New Node(s) Including the intermediate dirs
     * ROOT/dir1/dir2 --Leaf is file
     * ====================================================
     */
    public void mkdir(String path) {
        //TODOS: Path ending with '/' will be new dir creation
        List<String> pathContents = parsePath(path);
        int counter = 0;
        if (pathContents.size() > 0) {
            FNode patentNode = root;
            //Iterate through contents
            for (String fname : pathContents) {
                // IF its directory
                if (patentNode.dir == true) {
                    // If Exist the current fnode
                    if (patentNode.children.containsKey(fname)) {
                        patentNode = patentNode.children.get(fname); //Parent update
                        continue;
                    } else {
                        // Subdirectory creation
                        FNode newFileNode = new FNode(fname,
                                true,
                                new TreeMap<>(),
                                null);
                        patentNode.children.put(fname, newFileNode);
                        patentNode = newFileNode; //Parent update
                    }
                }
                // Create if not exist
                counter++;
            }
        }
    }

    private List<String> parsePath(String path) {
        List<String> pathContents = new ArrayList<>();
        if (path != null) {
            path = path.trim();
            if (path.startsWith("ROOT/")) {
                path = path.substring(path.indexOf('/') + 1);
                // ROOT/dir1/dir2 ==> dir1/ dir2
                path.replace(" ", "");
                //dir1/ dir2 ==> dir1/dir2
                pathContents = Arrays.asList(path.split("/"));

            }
        }
        return pathContents;
    }


    /**
     * ====================================================
     * Add Content To Fiile (Create and add if not exist OR append)
     * File -- Return Contents (String)
     * Dir -- Ignore (return null)
     *
     * Lookup + (Insert NEW +append Content ||  append contents if exist)
     * ====================================================
     */
    public void addContentToFile(String absFilePath, String contents) {
        // Minor tweak to mkdir with check for leaf node as DIR or fle
        // IF leaf is file ( IF contens ? ==APPEND else Init contents)
        // skip INVALID paths
    }

    /**
     * ====================================================
     * Read Contents Of Path
     * File -- Return Contents (String)
     * Dir -- Ignore (return null)
     * Lookup + Read IF exist (Else Ignore)
     * ====================================================
     */
    public String readContentsOfFile(String absFilePath) {
        //Lookup
        // IF find ( check if dir ? return NULL)
        // IF find ( check if NOT DIR ? return fnode.contents)
        return "";
    }

}


/**
 * Problem statement =====================================
 * // /**
 * // Design an MEM FS system :
 *
 * // `ls`: Given a path in string format.
 * // If  file path, return a list that only contains this file's name.
 * // If directory path, return the list of file and directory names in this directory.
 * // Your output should in lexicographic order.
 *
 * // `mkdir`: Given a directory path that does not exist, make a new directory according to the path.
 * // If the middle directories in the path don't exist either,create them as well.
 * // void return type.
 *
 * // `addContentToFile`: Given a file path and file content in string format.
 * // If file doesn't exist, create that file with content.
 * // If file already exists, append  content to original content.
 * // void return type.
 *
 * // `readContentFromFile`: Given a file path, return its content in string.*
 * //
 */