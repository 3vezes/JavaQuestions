package main.java.com.data.tree;

public class BinaryNode<T> {

    private final BinaryNode left;
    private final BinaryNode right;

    private final T value;

    public BinaryNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(BinaryNode left, BinaryNode right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public T getValue() {
        return value;
    }

    public boolean hasLeft(){
        return left != null;
    }

    public boolean hasRight(){
        return right != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryNode that = (BinaryNode) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
