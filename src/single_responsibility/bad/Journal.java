package single_responsibility.bad;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> journals = new ArrayList<>();
    private int count =0;
    public void addJournal(String note){
        journals.add(++count + ". "+ note);
    }

    public void removeJournal(int index){
        journals.remove(index);
    }

    public void saveJournal(String filename){
        try(PrintStream out = new PrintStream(filename)) {
            out.println(journals);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(), journals);
    }
}

