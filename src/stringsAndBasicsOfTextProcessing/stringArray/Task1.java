package stringsAndBasicsOfTextProcessing.stringArray;

import java.util.Arrays;

public class Task1 {
    static void task1() {

        System.out.println("1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.");

        String[]a={"toString","toCharArray","toLowerCase"};

        System.out.println(Arrays.toString(a));

        for (int k=0;k<a.length;k++){
            String cases=a[k];

            char[] camelCaseSymbols = cases.toCharArray();
            int upperCaseCount = 0;

            for (char symbol : camelCaseSymbols) {

                if (Character.isUpperCase(symbol)) {
                    upperCaseCount++;
                }
            }
            char[] snakeCaseSymbols = new char[camelCaseSymbols.length + upperCaseCount];

            for (int i = 0, j = 0; i < camelCaseSymbols.length; i++, j++) {

                if (Character.isUpperCase(camelCaseSymbols[i])) {
                    snakeCaseSymbols[j] = '_';
                    snakeCaseSymbols[++j] = Character.toLowerCase(camelCaseSymbols[i]);

                } else {
                    snakeCaseSymbols[j] = camelCaseSymbols[i];
                }
            }
            System.out.println(snakeCaseSymbols);
        }

    }


}
