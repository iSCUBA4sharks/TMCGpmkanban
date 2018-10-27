package tmcgpmkanban;

public class TaskDB {
    
    public Note getNote(String noteName) {
        // In a more realistic application, this code would
        // get the data for the product from a database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Note note;

        // fill the Note object with data
        if (noteName.equalsIgnoreCase("first")) {
            note = new Note(noteName, "Murach's Java Programming");
        } else if (noteName.equalsIgnoreCase("second")) {
            note = new Note(noteName, "Murach's Java Servlets and JSP");
        } else if (noteName.equalsIgnoreCase("third")) {
            note = new Note(noteName, "Murach's MySQL");
        } else if (noteName.equalsIgnoreCase("fourth")) {
            note = new Note(noteName, "Murach's Android Programming");
        } else {
            note = new Note(noteName, "Unknown");
        }
        return note;
    }
}