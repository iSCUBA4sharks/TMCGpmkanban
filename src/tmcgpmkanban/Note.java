package tmcgpmkanban;

import java.text.NumberFormat;

public class Note {

    private String noteNumber;
    private String noteSummary;
    private String taskOwner;
    

    public Note() {
        noteNumber = "";
        noteSummary = "";
        taskOwner = "";
        
    }
    
    public Note(String noteNumber, String taskOwner, String noteSummary) {
        this.noteNumber = noteNumber;
        this.noteSummary = noteSummary;
        this.taskOwner = taskOwner;
        
    }    

    public void setOwner(String taskOwner) {
        this.taskOwner = taskOwner;
    }

    public String getOwner() {
        return taskOwner;
    }

    public void setCode(String noteNumber) {
        this.noteNumber = noteNumber;
    }

    public String getCode() {
        return noteNumber;
    }

    public void setDescription(String noteSummary) {
        this.noteSummary = noteSummary;
    }

    public String getDescription() {
        return noteSummary;
    }

        
    
}