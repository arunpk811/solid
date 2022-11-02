package single_responsibility.good;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
    String content;

    Persistence(String input) {
        content = input;
    }

    public void saveFile(String filename) {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
