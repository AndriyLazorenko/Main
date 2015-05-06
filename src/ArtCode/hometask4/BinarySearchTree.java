package ArtCode.hometask4;


/**
 * Created by Master on 25-Apr-15.
 */
public class BinarySearchTree<T extends Comparable> implements ITree<T> {

    private TNode<T> root = null;
    private int size;


    @Override
    public boolean add(T t) {
        if (root != null){
            TNode <T> iter=root;
            while (iter!=null) {
                if (t.compareTo(iter.getValue()) < 0) {
                    if (iter.getLeft() == null) {
                        iter.setLeft(new TNode(iter, null, null, t));
                        size++;
                    } else {
                        iter = iter.getLeft();
                    }
                } else if (t.compareTo(iter.getValue()) > 0) {
                    if (iter.getRight() == null) {
                        iter.setRight(new TNode(iter, null, null, t));
                        size++;
                    } else {
                        iter = iter.getRight();
                    }
                }
            }
        }
        else {
            root=new TNode<>(null,null,null,t);
            size++;
            return true;
        }
        return false;
    }

    @Override
    public T remove(T t) {
        if (contains(t)) {
            if (isRoot(t)) {
                if (hasOneChild(t)) {
                    if (hasLeft(t)) {
                        TNode<T> node = getNode(t);
                        root = node.getLeft();
                        return t;
                    } else {
                        TNode<T> node = getNode(t);
                        root = node.getRight();
                        return t;
                    }
                } else if (isLeaf(t)) {
                    root = null;
                    return t;
                } else {
                    TNode<T> node = getNode(maxLeftOf(t));
                    root.setValue(node.getValue());
                    if (node.getParent()!=root){
                        node.getParent().setRight(node.getLeft());
                    }
                    else{
                        root.setLeft(node.getLeft());
                    }
                    return t;
                }
            } else if (isLeaf(t)) {
                TNode<T> node = getNode(t);
                if (hasLeft(node.getParent().getValue())) {
                    node.getParent().setLeft(null);
                    return t;
                } else {
                    node.getParent().setRight(null);
                    return t;
                }

            } else if (hasOneChild(t)) {
                if (hasLeft(t)) {
                    if (isLeftChildifOneChild(t)){
                        TNode<T> node = getNode(t);
                        node.getParent().setLeft(node.getLeft());
                        return t;
                    }
                    else{
                        TNode<T> node = getNode(t);
                        node.getParent().setRight(node.getLeft());
                        return t;
                    }
                }
                else {
                    if (isLeftChildifOneChild(t)){
                        TNode<T> node = getNode(t);
                        node.getParent().setLeft(node.getRight());
                        return t;
                    }
                    else {
                        TNode<T> node = getNode(t);
                        node.getParent().setRight(node.getRight());
                        return t;
                    }
                }
            }
            else {
                TNode<T> nodeL = getNode(maxLeftOf(t));
                TNode<T> nodeT = getNode(t);
                if (nodeL.getParent()!=nodeT){
                    nodeL.getParent().setRight(nodeL.getLeft());
                }
                else{
                    nodeT.setLeft(nodeL.getLeft());
                }
                nodeT.setValue(nodeL.getValue());
                return t;
            }
        }
        return null;
    }
    private boolean isLeftChildifOneChild (T t){
        TNode<T> node = getNode(t);
        if (hasLeft(node.getParent().getValue())){
            return true;
        }
        else return false;
    }
    private boolean hasLeft(T t){
        TNode<T> node= getNode(t);
        if (node.getLeft()!=null){
            return true;
        }
        return false;
    }
    private boolean hasOneChild (T t){
        TNode<T> node= getNode(t);
        if(node.getLeft()==null&&node.getRight()!=null||node.getLeft()!=null&&node.getRight()==null){
            return true;
        }
        return false;
    }
    private boolean isLeaf (T t){
        TNode<T> node= getNode(t);
        if (node.getRight()==null&&node.getLeft()==null){
            return true;
        }
        return false;
    }
    private boolean isRoot (T t){
        if (t==root.getValue()){
            return true;
        }
    return false;
    }
    private TNode<T> getNode(T t){
        if (root != null) {
            TNode<T> iter = root;
            if (iter.getValue() == t) return iter;
            else if (t.compareTo(iter.getValue()) < 0) {
                if (iter.getLeft() == t) {
                    return iter.getLeft();
                } else {
                    recursionForGet(iter.getLeft(), t);
                }
            } else if (t.compareTo(iter.getValue()) > 0) {
                if (iter.getRight() == t) {
                    return iter.getRight();
                } else {
                    recursionForGet(iter.getRight(), t);
                }
            }
        }
        return null;
    }
    private TNode<T> recursionForGet (TNode<T> iter, T t){
        if (t.compareTo(iter.getValue()) < 0) {
            if (iter.getLeft() == t) {
                return iter.getLeft();
            } else {
                recursionForContains(iter.getLeft(),t);
            }
        } else if (t.compareTo(iter.getValue()) > 0) {
            if (iter.getRight() == t) {
                return iter.getRight();
            } else {
                recursionForContains(iter.getRight(),t);
            }
        }
        return null;
    }
    private T maxLeftOf(T t){
        TNode<T> node = getNode(t);
        if(isLeaf(node.getLeft().getValue())||(hasOneChild(node.getLeft().getValue())&&hasLeft(node.getLeft().getValue()))){
            return node.getLeft().getValue();
        }
        else {
            return recursionForMaxLeftOf(node.getLeft().getRight().getValue());
        }
    }
    private T recursionForMaxLeftOf (T t){
        TNode<T> node = getNode(t);
        if(isLeaf(node.getRight().getValue())||(hasOneChild(node.getRight().getValue())&&hasLeft(node.getRight().getValue()))){
            return node.getRight().getValue();
        }
        else {
            return recursionForMaxLeftOf(node.getRight().getRight().getValue());
        }
    }

    @Override
    public boolean contains(T t) {
        if (root != null) {
            TNode<T> iter = root;
            if (iter.getValue() == t) return true;
            else if (t.compareTo(iter.getValue()) < 0) {
                if (iter.getLeft() == t) {
                    return true;
                } else {
                    recursionForContains(iter.getLeft(),t);
                }
            } else if (t.compareTo(iter.getValue()) > 0) {
                if (iter.getRight() == t) {
                    return true;
                } else {
                    recursionForContains(iter.getRight(),t);
                }
            }
        }
        return false;
    }
    private boolean recursionForContains (TNode<T> iter, T t){
        if (t.compareTo(iter.getValue()) < 0) {
            if (iter.getLeft() == t) {
                return true;
            } else {
                recursionForContains(iter.getLeft(),t);
            }
        } else if (t.compareTo(iter.getValue()) > 0) {
            if (iter.getRight() == t) {
                return true;
            } else {
                recursionForContains(iter.getRight(),t);
            }
        }
       return false;
    }


    @Override
    public void rotate() {

    }

    @Override
    public void traverse() {
        traverse(root);
    }

    @Override
    public String toString() {
        return traverseStr(root);
    }
    public int getSize(){
        return size;
    }

    private void traverse(TNode node){
        if(node == null) return;

        traverse(node.getLeft());
        System.out.println(node.getValue());
        traverse(node.getRight());

    }

    private String traverseStr(TNode curr){
        String res = "";

        if(curr == null) {
            return res;
        }


        res += traverseStr(curr.getLeft());
        res += curr.getValue().toString() +"\n";
        res += traverseStr(curr.getRight());

        return res;
    }
}