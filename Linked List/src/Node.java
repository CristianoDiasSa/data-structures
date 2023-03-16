public class Node {
    Movies movie;
    Node next;

    public Node(Movies movie, Node next){
        this.movie = movie;
        this.next = next;
    }
    public Node(Movies movie){
        this.movie = movie;
    }
    @Override
    public String toString(){
        return movie.toString();
    }
}
