import org.javatuples.Pair;

public class BinarySearchTree<E extends Comparable<E>> {

    protected TreeNode<E> root;

    protected int size = 0;

    public static class TreeNode<E extends Comparable<E>> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    public BinarySearchTree() {

    }

    public BinarySearchTree(E[] objects) {
        for (E object : objects) insertNode(object);
    }

    public int getSize() {
        return size;
    }

    public Boolean contains(E e) {
        TreeNode<E> current = root;

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;

            } else if (e.compareTo(current.element) > 0) {
                current = current.right;

            } else if (e.compareTo(current.element) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean insertNode(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
            size++;
        } else {
            TreeNode<E> current = root;
            TreeNode<E> parent = null;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else if (e.compareTo(parent.element) > 0) {
                parent.right = new TreeNode<>(e);
            }
            size++;
        }
        return true;
    }

    public boolean deleteNode(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        Boolean doesContain = contains(e);


        if (root == null) {
            return false;
        }
        if (doesContain) {
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    current = current.left;
                }
                else if (e.compareTo(current.element) > 0) {
                    current = current.right;
                }
                else {
                    if (current.left == null)
                        parent = current.right;
                    else if (current.right == null)
                        parent = current.left;

                    current.element = inorder(current);
                }
            }
        }

        size--;
        return true;
    }


}
