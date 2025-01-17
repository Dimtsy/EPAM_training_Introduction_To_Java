package task6.studentArchive.server.student;

public class Student {
    private String name;
    private int averageMark;

    public Student(String name, int averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return name + " - average mark = " + getAverageMark();
    }
}
