package programmingWithClasses.aggregationAndComposition.text;
//Агрегация и композиция
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Main {
    public static void main(String[] args) {
        Text text = new Text("Заголовок","Некоторый текст. ");
        text.addSentence(new Sentence("Добавляем предложение. "));
        text.addWord("Слово");
        text.printTitle();
        text.printText();
    }
}
