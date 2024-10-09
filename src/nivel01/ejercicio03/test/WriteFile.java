package nivel01.ejercicio03.test;

import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.*;

public class WriteFile {

    private final String fileName;

    public WriteFile(String fileName) {
        this.fileName = fileName;
    }

    public void write(String content) throws IOException {
        try(FileWriter fw = new FileWriter(fileName)){
            fw.write(content);
            out.println("Wrote to file " + fileName);
        } catch (IOException e) {
            out.println("Error writing to file " + fileName);
        }
    }
}
