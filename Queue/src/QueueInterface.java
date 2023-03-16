/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */

public interface QueueInterface
{
    public boolean isEmpty();       // States if the queue is empty or not
    public void enqueue(Tags data); // Add nodes type Tags and the element
    public void dequeue();          // Basic deletion method on queues
    public int length();            // Count the nodes
    public void print();            // Basic printing method of queue's values
    public void peek();             // Peek on the value in the front of the queue

}