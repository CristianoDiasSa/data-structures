/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */


//This node should have a data piece of type T and
//a pointer to the left and to the right
public class BTNode<T>
{
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;

    public BTNode (T element)
    {
        this.element = element;
    }

    @Override
    public String toString()
    {
        String leftVal = (left == null ? "Null" : left.element.toString());
        String rightVal = (right == null ? "Null" : right.element.toString());
        return "BTNode{" + "element=" + element + ", left=" + leftVal + ", right=" + rightVal +'}';
    }
}
