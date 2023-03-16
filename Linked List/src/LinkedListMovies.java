public class LinkedListMovies {
    Node first;
    Node last;
    public boolean isEmpty(){
        return first == null;
    }
    public void add(Movies elem){
        if(isEmpty()){
            Node insertion = new Node(elem);
            first = insertion;
            last = first;
        }
        else {
            last.next = new Node(elem);
            last = last.next;
        }
    }
    @Override
    public String toString(){
        String rep = "\n";
        Node current = first;
        while(current != null) {
            rep += current + "\n";
            current = current.next;
        } rep += "----------------------------";
        return rep;
    }

    public String genreSearch(String genre) {
        String rep = "\n";
        int count = 0;
        Node current = first;
        while(current != null) {
            if (current.movie.genre.equals(genre)) {
                rep += current + "\n";
                current = current.next;
                rep += "----------------------------\n";
                count++;
            }else{
                current = current.next;
            }
        }
        if(count == 0){
            System.out.println("No movie of this genre found");
        }
        return rep;
    }
    public Double averageRating() {
        int counter = 0;
        double averageRatings = 0;

        Node current = first;
        while(current != null) {
            averageRatings += current.movie.rating;
            counter++;
            current = current.next;
        }
        averageRatings = averageRatings/counter;
        return averageRatings;
    }
    public String remove(String target){
        Node current =  first   ;
        int index = 0;
        while(current != null  && !current.movie.movieTitle.equals(target)){
            current = current.next;
            index++;
        }
        if(current != null && current.movie.movieTitle.equals(target)){
            remove(index);
        }else {
            System.out.println("You are trying to remove " + target + ", but it doesn't exist in the list!");
        }
        return target;
    }
    public int remove(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            first = first.next;
            if(first == null){
                last = null;
            }
        }else{
            Node pred = first;
            for(int k = 1; k<= index-1 ; k++) {
                pred = pred.next;
            }
            // rooting over the node we are removing
            pred.next = pred.next.next;
            if (pred.next == null){
                last = pred;
            }
        } return index;
    }
    public int size(){
        int size = 0;
        Node current = first;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;

    }
}

