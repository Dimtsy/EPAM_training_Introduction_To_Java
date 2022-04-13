package task6.notepad.action;

import task6.library.user.User;
import task6.notepad.note.Note;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;

public class Action {
    private String fileName = "notePade.txt";
    private ArrayList<Note> notes = new ArrayList<>();

    public Action() {
        readerNotesFromFile();
    }
    public void addNote(Note note){
        notes.add(note);
    }

    public void writeNotesToFile(){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            for (Note note : notes) {
                String date = simpleDateFormat.format(note.getCreateDate());

                bufferedWriter.write(note.getTopic()+"|"+date+"|"+note.getMsg()+"|"+note.getEmail());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Ошибка при добавлении записей в файл");
        }
    }
    public void readerNotesFromFile(){
        String line;
        String[] buffer;
        File file = new File(fileName);
        if(file.exists()){
            try (BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName))){
                while (null != (line = bufferedReader.readLine())){
                    buffer=line.split("\\|");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

                    if (buffer.length>1){
                        notes.add(new Note(buffer[0],simpleDateFormat.parse(buffer[1]),buffer[2],buffer[3]));
                    }

                }
            } catch (IOException | ParseException e) {
                System.out.println("Ошибка при чтении записей из файла");
            }

        }
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public ArrayList<Note> sortNotes(ArrayList<Note> arrayList) {
         arrayList.sort(Comparator.comparing(Note::getTopic));
         return arrayList;
    }

    public ArrayList<Note> findTopic(String topic){

        return sortNotes(notes.stream().filter(p->p.getTopic().equals(topic)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public ArrayList<Note> findCreationData(Date date){

        return sortNotes(notes.stream().filter(p->p.getCreateDate().equals(date)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public ArrayList<Note> findEmail(String email){

        return sortNotes(notes.stream().filter(p->p.getEmail().equals(email)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public ArrayList<Note> findMsg(String msg){

        return sortNotes(notes.stream().filter(p->p.getMsg().equals(msg)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public ArrayList<Note> findTopicAndEmail(String topic,String email){

        return sortNotes(notes.stream().
                filter(p->p.getTopic().equals(topic)).
                filter(p->p.getEmail().equals(email)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public ArrayList<Note> findMsgAndCreationDate(String msg,Date createDate){

        return sortNotes(notes.stream().
                filter(p->p.getMsg().equals(msg)).
                filter(p->p.getCreateDate().equals(createDate)).
                collect(Collectors.toCollection(ArrayList::new)));
    }
    public void removeNote(String topic){
        notes.removeIf(p->p.getTopic().equals(topic));
    }
}
