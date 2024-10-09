package nivel01.ejercicio03.main.java.com.modules;

import java.util.HashMap;
import java.util.Scanner;

public class CountryCapitalQuizApp {

    public void run() {
        FileManager fileManager = new FileManager();

        HashMap<String, String> countryCapitalMap = fileManager.loadCountryCapitalData("src/nivel01/ejercicio03/resources/countries.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String userName = scanner.nextLine();

        QuizGame quizGame = new QuizGame(countryCapitalMap);
        if (quizGame != null) {

        }
        quizGame.start(userName);

        fileManager.saveScore("src/nivel01/ejercicio03/resources/classificacio.txt", userName, quizGame.getScore());

        scanner.close();    }
}

