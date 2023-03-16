/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */

import java.util.*;
public class BinaryTreeBaseCode<T extends Comparable<T>> implements BinaryTree<T>{

    protected BTNode<T> root;

    //This Method should check if the tree is empty
    public boolean isEmpty()
    {
        return root == null;
    }

    //we should be able to grab a new node and drop it into the tree
    //we need to use the comparable component to find where
    //we should like place the object by examining the waiting time index...

    //-------------------------------------------------------------------------------------------------------
    //Insert


    // This is the method the user will call, so it has to be public
    public void insert(T elem)
    {   // Firstly we check if the element we are trying to add will be the root or not,
        // in case the tree is empty, then this first element will be the root!
        if(isEmpty())
        { root = new BTNode<>(elem);
        }
        else
        // In case the element that we are trying to add, will not the the root (The tree is not empty),
        // We will be calling another method of same name, but that will take 2 arguments, the root and the
        // new element
        { insertNode(elem, root);
        }
    }

    // This next method will be called every time we are trying to add an element when the tree is not empty
    // Differenty from the very first method, it takes two arguments instead of one, as it needs to compare the
    // objects in order to know if it will be added on the left or right side of the root.

    // This is an intern method that is not available to the user, and will be called inside the public method,
    // therefore it is private.
    private void insertNode(T elem, BTNode<T> current){
        //The big decision is to run the comparison of the new element
        // Against the value of the waiting time index of the current node
        if(elem.compareTo(current.element) == -1)
        {   // If the waiting index is smaller, we will add it to the left side of the root,
            // but firstly, we have to check if we already have an element on the left side,
            // if we do not have one, the new element will become the left element of the current one
            if(current.left == null)
            {   current.left = new BTNode<>(elem);

            // If the left side is not empty, we have to recursively call this method until it does, so we
            //can add this new element on  the left side
            } else
            {   insertNode(elem, current.left);
            }

            //If the element that we are trying to add has a higher waiting index than the root,
            // we will start looking for somewhere to place it on the right side of the current element,
            // it will take the same steps as above, check if the right element is null, if it is,
            // will add the element there, if it is not, will recursively call the method until it does!
        }  else
        {
            //Right element is empty, so just add the new element
            if(current.right == null)
            { current.right = new BTNode<>(elem);
            } else

            // The right element is not empty, recursively call the method until it is empty and simple add it!
            { insertNode(elem, current.right);
            }
        }}

    //-------------------------------------------------------------------------------------------------------
    //Size

    // This is the method the user will call, so it has to be public
    public int size()
    {   return size(root);
    }

    // This is an intern method that is not available to the user, and will be called inside the public method,
    // therefore it is private.
    private int size(BTNode<T> current)
    {
        // we need to define the base case to stop the search,
        // that will be when the current node is empty, and if it
        // is the case, return 0 to the user, as the tree is empty
        if(current == null)
        { return 0;
        } else
        { // Search left and right and add 1 because there is an element in the tree
          // If the current element is not null, then we keep traversing our tree until it does
          // and sum the size of both sides and add 1 because it is not empty, so we have the value
          // on the root as well
            return 1 + size(current.left) + size(current.right);
        }
    }


    //-------------------------------------------------------------------------------------------------------
    //Find Worst


    // This is the method the user will call, so it has to be public
    public T findWorst()
    {
        if(isEmpty())
        // If the tree is empty, it is impossible to find anything on it, so just throw an exception
        {   throw new NoSuchElementException();
        }   else
        // If the tree is not empty, call the intern method to find the worst element
        {   return (T)findWorst(root);
        }
    }



    // This is an intern method that is not available to the user, and will be called inside the public method,
    // therefore it is private.
    private T findWorst(BTNode<T> current)
    {   // This method will be called only if the tree is not empty, therefore
        // we do not need to check it again.

        if(current.right == null)
        // If the current.right element is null, that means that this is the fartest you
        // can go to the left, so it means that this is the element with the highest
        // waiting time index, so it is the worst

        {   return current.element;
        }else

        // If the right side is not empty, keep calling the method until it does!
        {   return findWorst(current.right);
        }
    }


    //-------------------------------------------------------------------------------------------------------
    //Find Best

    // This is the method the user will call, so it has to be public
    public T findBest()
    {
        // If the tree is empty, it is impossible to find anything on it, so just throw an exception
        if(isEmpty())
        {   throw new NoSuchElementException();
        }else
        // If the tree is not empty, call the intern method to find the best element
        {   return (T)findBest(root);
        }
    }




    // This is an intern method that is not available to the user, and will be called inside the public method,
    // therefore it is private.
    private T findBest(BTNode<T> current)
    {
        // This method will be called only if the tree is not empty, therefore
        // we do not need to check it again.

        if(current.left == null)
        // If the current.right element is null, that means that this is the fartest you
        // can go to the left, so it means that this is the element with the lowest
        // waiting time index, so it is the best
        { return current.element;
        }else

        // If the right side is not empty, keep calling the method until it does!
        { return findBest(current.left);
        }
    }
    //-------------------------------------------------------------------------------------------------------
}


