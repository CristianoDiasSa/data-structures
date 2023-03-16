/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */

public interface BinaryTree <T extends Comparable<T>>
{
    public boolean isEmpty();       // States if the tree is empty or not
    public void insert(T elem);     // Add nodes type T and the element
    public int size();              // Count the nodes
    public T findBest();            // Find the best airport (The lowest waiting index)
    public T findWorst();           // Find the worst airport (The highest waiting index)
}
