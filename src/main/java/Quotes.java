public class Quotes {
    public String text;
    public String author;

    public Quotes(String text,String author){
        this.text = text;
        this.author = author;
    }
    public String toString(){
        return "Quote: \n"+ text +"\n"+ "--"+author;
    }
}
