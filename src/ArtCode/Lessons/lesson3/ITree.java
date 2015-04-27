package ArtCode.Lessons.lesson3;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Master on 25-Apr-15.
 */
public interface ITree<T extends Comparable> {
    public class TNode<T extends Comparable> {
        private TNode<T> left=null;
        private TNode<T> right=null;
        private TNode<T> parent=null;
        private T value=null;

        public TNode<T> getLeft() {
            return left;
        }

        public void setLeft(TNode<T> left) {
            this.left = left;
        }

        public TNode<T> getRight() {
            return right;
        }

        public void setRight(TNode<T> right) {
            this.right = right;
        }

        public TNode<T> getParent() {
            return parent;
        }

        public void setParent(TNode<T> parent) {
            this.parent = parent;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public TNode(TNode<T> parent, TNode<T> left, TNode<T> right, T value) {
            this.parent = parent;
            this.left = left;
            this.right = right;
            this.value = value;
        }
        public TNode (){

        }
    }
    boolean add (T t);
    T remove(T t);
    boolean contains (T t);
    void rotate ();
    void traverse ();

}



