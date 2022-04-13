package basicsOfOOP.textFile;
//Задача 1.
//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public class Main {
    public static void main(String[] args) {
        File file = new File("Файл","Некоторый текст");
        Directory directory = new Directory("Рабочий стол","C/workdesk");
        TextFile textFile = new TextFile(file,directory);
        textFile.addContent(" Добавляем текст.");
        textFile.rename("Второй файл");
        textFile.outPut();
        textFile.remove(file);
    }
}
