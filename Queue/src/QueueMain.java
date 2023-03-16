/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */
public class QueueMain {
    public static void main(String[] args){
        Queue myQueue = new Queue();
        Tags opening = new Tags("<>");
        Tags closing = new Tags("</>");

        // Text with matching number or opening and closing tags
         String text = "<></>";

        // text with more closing tags than opening tags
        // String text = "<></></>";

        // text with more opening tags than closing tags
        // String text = "<><></>";

        // We start iterating through the whole length of the given string
        for(int i = 0; i<text.length(); i++){
            // Here we check if the current value of i and the next value of i corresponds to the values of our tag
            // if it is a match, we add that tag to our queue.
            if(text.charAt(i) == '<' && text.charAt(i+1) == '>') {
                myQueue.enqueue(opening);
            }
            // Now we have to check if the current value and the next two correspond for the value of out closing tag
            if(text.charAt(i) == '<' && text.charAt(i+1) == '/' && text.charAt(i+2) == '>') {
                // if it is a match, we try to remove it from our queue
                try {
                    myQueue.dequeue();

                // if we fail to delete the value from the queue, that only means that the queue is empty, so we have
                // a closing tag without one opening tag
                }catch (Exception e){
                    System.out.println("You have "+ closing +" tags without "+opening+" tags!");
                    return;
                }
            }
        }
        // If at the end of the file, the queue is empty, that only means that all added tags where deleted
        // when we found a closing tag, therefore all opening tags have a closing tag
        if (myQueue.isEmpty()){
            System.out.println("All the " + opening + " tags have a correspondent "+ closing +" tag");

        // If the queue is not empty, and we already went through all the length of the file,
        // that means that we have more opening tags than closing ones.
        }else{
            System.out.println("You have more "+ opening +" tags than "+ closing+" tags!");
        }



        //---------------------------------------------------------------------------------------------------------
        // This was just test cases for the queue data structure
/*
        myQueue.enqueue(opening);
        myQueue.enqueue(closing);

        System.out.println("the front element of the queue is");
        myQueue.peek();
        System.out.println("The whole queue is");
        myQueue.print();

        myQueue.dequeue();

        System.out.println("We just deleted the first element of the queue, so the new front element is ");
        myQueue.peek();
        System.out.println("The new queue is ");
        myQueue.print();

        System.out.println("The queue size is");
        System.out.println(myQueue.length());

*/
    }

}