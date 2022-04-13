package task6.notepad.display;

import task6.notepad.note.Note;

import java.util.ArrayList;

public class Display {
    public void displayNotes(ArrayList<Note> arrayList){
        if(arrayList.isEmpty()){
            System.out.println("Блокнот пуст");
        }else {
            arrayList.forEach(System.out::println);
        }
    }
}
