package programmingWithClasses.simplestClassesAndObjects;

import java.util.Arrays;
import java.util.Random;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
    private String name;
    private int group;
    private int[] grade = new int[5];

    public Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    public Student() {
    }

    public Student(String name, int group, int[] grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student[] student= createStudents();
        printStudents(student);
        System.out.println("Отличники:");
        studentsNineTeen(student);
    }

    public static Student[] createStudents(){
        Student[] student= new Student[10];
        student[0]=new Student("Капустин П.С.",345765,rand());
        student[1]=new Student("Вишневский К.В.",345761,rand());
        student[2]=new Student("Орлова М.В.",345762,rand());
        student[3]=new Student("Литвин А.Т.",345762,rand());
        student[4]=new Student("Капустин Л.Г.",345762,rand());
        student[5]=new Student("Колосов Р.В.",345767,rand());
        student[6]=new Student("Батин Л.О.",345761,rand());
        student[7]=new Student("Болотин М.В.",345764,rand());
        student[8]=new Student("Кузин Р.Н.",345765,rand());
        student[9]=new Student("Мамай А.В.",345764,rand());

        return student;
    }
    public static void printStudents(Student[] students){
        for (Student s:students) {
            System.out.println(s.getName()+" "+Arrays.toString(s.getGrade()));
        }
    }
    public static int[] rand(){
        Student st= new Student();
        int[]k=new int[st.getGrade().length];
        for (int i=0;i<st.getGrade().length;i++) {
            k[i]= new Random().nextInt(3)+8;
        }
        return k;
    }

    public static void studentsNineTeen(Student[] student) {
        for (Student s:student) {
            if (studentsNineTeenOne(s)){
                System.out.println(s.getName()+" гр. "+s.getGroup());
            }
        }
    }
    public static boolean studentsNineTeenOne(Student student) {
        for (int f: student.getGrade()) {
            if (f<9){
                return false;
            }
        }
        return true;
    }

}
