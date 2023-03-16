/*
 * Project.java
 * @author Cristiano
 * 20/08/2022
 */
public class Tags{
    private String tag;


    //Create the constructor
    public Tags(String tag)
    {
        this.tag = tag;

    }


    @Override
    public String toString(){

        return tag;
    }

    //The accessor methods give us access to instance variables...
    public String getTag()
    { return tag;
    }

    public static void main(String[] args) {
        Tags tag = new Tags("<>");
        System.out.println(tag);
    }

}
