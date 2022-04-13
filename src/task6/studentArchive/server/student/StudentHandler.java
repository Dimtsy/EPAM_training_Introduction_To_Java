package task6.studentArchive.server.student;


import javax.xml.stream.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentHandler {
    private static StudentHandler instance = new StudentHandler();
    private List<Student> students = new ArrayList<>();
    private String fileName = "src\\task6\\studentArchive\\server\\data\\Students.xml";

    public static StudentHandler getInstance() {
        try {
            instance.readStudentsData();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addNewStudent(Student student) throws FileNotFoundException, XMLStreamException {
        students.add(student);
        writeStudentsData();
    }

    public String showAllStudents(){
        return students.stream().map(Objects::toString).collect(Collectors.joining("/"));

    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    private void readStudentsData() throws IOException, XMLStreamException {
        String name;
        int averageMark;

        File file = new File(fileName);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(new FileInputStream(file));

        while (parser.hasNext()) {
            int event = parser.next();

            if (event == XMLStreamConstants.START_ELEMENT) {
                if ("student".equals(parser.getLocalName())) {
                    name = parser.getAttributeValue(0);
                    averageMark = Integer.parseInt(parser.getAttributeValue(1));

                    students.add(new Student(name, averageMark));
                }
            }

        }
    }

    public void writeStudentsData() throws FileNotFoundException, XMLStreamException {

        XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream(fileName, false));

        writer.writeStartDocument();
        writer.writeCharacters("\n");

        writer.writeStartElement("students");

        for (Student student : students) {
            writer.writeCharacters("\n");
            writer.writeEmptyElement("student");

            writer.writeAttribute("name", student.getName());
            writer.writeAttribute("averageMark", String.valueOf(student.getAverageMark()));
        }

        writer.writeCharacters("\n");
        writer.writeEndDocument();
    }

}
