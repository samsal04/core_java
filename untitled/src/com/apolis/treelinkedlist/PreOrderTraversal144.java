package com.apolis.treelinkedlist;



import java.util.ArrayList;
import java.util.List;

import static com.apolis.treelinkedlist.BinarySearchTree.root;

public class PreOrderTraversal144 {
    private static List<Integer> preOrderTraversal(BinarySearchTree.Node root) {

        List<Integer> list=new ArrayList<>();

        while(root!=null) {
            if(root.right!= null && root.left!= null) {
                list.add(root.value);
                root= root.left;
            }
            else if(root.left==null){
                list.add(root.value);
                root=root.right;
            }else {
                list.add(root.value);
                root=root.left;

            }
        }

        return list;
    }
    public static void main(String[] args) {

        System.out.println(preOrderTraversal(root));

    }
}
