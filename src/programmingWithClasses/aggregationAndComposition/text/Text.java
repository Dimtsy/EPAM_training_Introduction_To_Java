package programmingWithClasses.aggregationAndComposition.text;

public class Text {
private String title;
private StringBuilder text;

    public Text(String title, String text) {
        this.title = title;
        this.text = new StringBuilder(text);
    }

    public void addSentence(Sentence sentence){
        text.append(sentence.getSentence());
    }
    public void addWord(String word){
        text.append(word);
    }
    public void printText(){
        System.out.println(text);
    }
    public void printTitle(){
        System.out.println(title);
    }
}
