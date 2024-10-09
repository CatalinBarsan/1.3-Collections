package nivel01.ejercicio03.main.java.com.modules;

import java.io.*;
import java.util.HashMap;

public class FileManager {

    public HashMap<String, String> loadCountryCapitalData(String filePath) {
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+", 2);
                if (parts.length == 2) {
                    countryCapitalMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return countryCapitalMap;
    }

    public void saveScore(String filePath, String userName, int score) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(userName + ": " + score + "/10");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving the score: " + e.getMessage());
        }
    }
}

