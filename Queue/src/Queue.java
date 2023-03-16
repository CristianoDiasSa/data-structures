/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */
import java.util.*;
public class Queue implements QueueInterface{

    private QueueNode frontNode;
    private QueueNode rearNode;
    private int length;

    // Constructor for queue
    public Queue(){
        this.frontNode = null;
        this.rearNode = null;
        this.length = 0;
    }

    //-------------------------------------------------------------------------------------------------------
    //IsEmpty()
    //This Method should check if the tree is empty
    public boolean isEmpty() {
        return length == 0;
    }

    //Length() just to check if the queue is empty

    public int length() {
        return length;
    }

    //-------------------------------------------------------------------------------------------------------
    // Enqueue()
    // This is the basic insert method on a queue

    public void enqueue(Tags tag) {
        QueueNode temp = new QueueNode(tag);
        // if the queue is empty, we just insert the new tag in front of the queue
        if (isEmpty()) {
            frontNode = temp;
        } else {
            // If queue is not empty, we insert the value at the end of the queue
            rearNode.next = temp;
        }
        // the very back of the queue becomes the value that we just inserted
        rearNode = temp;
        // increase in length
        length++;
    }

    //-------------------------------------------------------------------------------------------------------
    // Dequeue method
    // This is the basic delete method on a queue
    public void dequeue() {
        // If queue is empty, just throw an exception
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        // if queue is not empty, the front.next node becomes the front of the queue,
        frontNode = frontNode.next;

        if (frontNode == null) {
            rearNode = null;
        }
        //decrease in length
        length--;

    }


    //-------------------------------------------------------------------------------------------------------
    //Print()
    // Method to print the values in the queue
    public void print() {
        // If queue is empty, there is nothing to print
        if (isEmpty()) {
            System.out.println("The queue is currently empty!");
            return;
        }
        // iterate through the whole queue printing values of the current node until it becomes null
        QueueNode current = frontNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //-------------------------------------------------------------------------------------------------------
    // Peek()
    // This method will show the front object of the queue
    public void peek() {
        System.out.println(frontNode.data);
    }
}







