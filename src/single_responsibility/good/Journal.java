package single_responsibility.good;

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

    @Override
    public String toString(){
        return String.join(System.lineSeparator(), journals);
    }
}

