package com.apolis.treelinkedlist;


class anotherClass{
    public static void main(String[] args) {

            BinarySearchTree bst= new BinarySearchTree();
            bst.insert(50);
            bst.insert(75);
            bst.insert(15);
            bst.insert(95);

            System.out.println("InOrder traversal of binary tree:");
            bst.inOrder(bst.root);

        }
    }

class BinarySearchTree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
        public void displayData() {
            System.out.println(value + " ");
        }
    }
//    Node root;
//    Node node;
//
//
//    // inserting using iteration
//    public void insert(int i){
//        Node newNode=new Node(i);
//        if(root==null){
//            root= newNode;
//        }else{
//            Node current= root;
//            Node parent;
//            while(true){
//                parent=current;
//                if(i<current.value){
//                    current=current.left;
//                    if(current==null){
//                        parent.left= newNode;
//                        return;
//                    }
//                }
//                else {
//                    current=current.right;
//                    if(current==null){
//                        parent.right= newNode;
//                        return;
//
//                    }
//                }
//            }
//        }
//
//      // inserting using recursion
//
//        public Node insert(Node node, int value){
//
//            if (node==null){
//                return new Node(value);
//            }
//
//            if (value<node.value){
//                node.left= insert(newNode.left,value);
//
//            }
//            else if(value>node.value){
//                node.right=insert(node.right,value);
//            }
//            return node;
//
//        }
//
//
//        //searching
//
//        public Node find(int searchedValue){
//            Node current=root;
//            while(current.value!=searchedValue){
//                if(searchedValue<current.value){
//                    current=current.left;
//                }
//                else{
//                    current=current.right;
//                }
//                if(current==null){
//                    return null;
//
//                }
//            }
//            return current;
//        }

    static Node root;
    BinarySearchTree(){
        root=null;
    }
    public void insert(int i){
            root= insert (root,i);
    }

        public Node insert(Node node, int value){
            if(node==null){
                return new Node(value);
            }

            if(value<node.value){
                node.left=insert(node.left,value);
            }
            else if(value>node.value){
                node.right=insert(node.right, value);
            }
            return node;
        }

        public Node find(int searchValue){
            Node current=root;
            while(current.value!=searchValue){
                if(searchValue<current.value){
                    current=current.left;
                }
                else if(searchValue>current.value){
                    current=current.right;
                }
                if(current==null){
                    return null;
                }

            }
            return current;
        }

        public void inOrder(Node node){
            if(node!= null){
                inOrder(node.left);
                node.displayData();
                inOrder(node.right);
            }
        }

        public void preOrder(Node node){
            if(node!=null){
                node.displayData();
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public void postOrder(Node node){
            if(node!=null){
                postOrder(node.left);
                postOrder(node.right);
                node.displayData();
            }

        }
    }



