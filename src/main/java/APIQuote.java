public class APIQuote {
    public String text;


    public APIQuote(String text){
        this.text = text;

    }

    public String toString(){
//        return "Quote:\n" + body +"\n" + "--" +author;
        return "Quote:\n" + text.replaceAll("\\[", "").replaceAll("\\]","")+"\n" + "--Ron Swanson" ;

    }

}
