package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task7 {
    public static void task7() {
        System.out.println("7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено \"abc cde\n" +
                "def\", то должно быть выведено \"abcdef\".");

        StringBuilder a =new StringBuilder("sddffsff  dfdgdghhy rrrrr");
        System.out.println("Дано:\n " + a);
        int size=a.length();
        for (int i =0;i<size;i++){
            for (int j =i+1;j<size;j++){
              if(a.charAt(i)==a.charAt(j)||a.charAt(j)==' '){
                  a.deleteCharAt(j);
                  size--;
                  j--;
              }
            }
        }
        System.out.println("После удаления:\n" + a);
    }
}
