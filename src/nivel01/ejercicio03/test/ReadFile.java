package nivel01.ejercicio03.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import static java.lang.System.*;

public class ReadFile {
    private final String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public void read() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String pointer =br.readLine();
            while (pointer != null) {
                pointer = br.readLine();
                out.print(pointer);
            }
        } catch (IOException e) {
            out.println("File not found");
        }

    }

    public HashMap<String, String> loadCountryCapitalData(String filePath) {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    countryCapitalMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return countryCapitalMap;
    }

}
