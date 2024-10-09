package nivel01.ejercicio03.main.java.com.modules;

import java.util.*;

public class QuizGame {
    private HashMap<String, String> countryCapitalMap;
    private int score;
    private Scanner scanner;

    public QuizGame(HashMap<String, String> countryCapitalMap) {
        this.countryCapitalMap = countryCapitalMap;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public void start(String userName) {
        Random random = new Random();
        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
        if (countryCapitalMap.size() > 0) {
            int randomIndex = new Random().nextInt(countryCapitalMap.size());
        } else {
            System.out.println("No countrys available.");
            return;
        }

        for (int i = 0; i < 10; i++) {
            String country = countries.get(random.nextInt(countries.size()));
            System.out.print("¿What is the capital of " + country + "? ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(countryCapitalMap.get(country))) {
                System.out.println("¡Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The capital of " + country + " is " + countryCapitalMap.get(country) + ".");
            }
        }

        System.out.println(userName + ", your score is: " + score + "/10");
    }

    public int getScore() {
        return score;
    }
}

