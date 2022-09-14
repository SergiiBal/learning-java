package learning.ostap.collections;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        String[] engMonths = null;
        playWithMonth(engMonths);

    }

    public static void playWithMonth(String[] engMonths) {
        String englishWord = " UGUST";
        String firstCaseLetter = englishWord.trim().toUpperCase().substring(0, 1);
        String lastLetters = englishWord.trim().toLowerCase().substring(1);
        String englishWord2 = firstCaseLetter.concat(lastLetters);

        Map<String, String> enguaMonths = new HashMap<>();
        enguaMonths.put("January", "Січень");
        enguaMonths.put("February", "Лютий");
        enguaMonths.put("March", "Березень");
        enguaMonths.put("April", "Квітень");
        enguaMonths.put("May", "Травень");
        enguaMonths.put("June", "Червень");
        enguaMonths.put("July", "Липень");
        enguaMonths.put("August", "Серпень");
        enguaMonths.put("September", "Вересень");
        enguaMonths.put("October", "Жовтень");
        enguaMonths.put("November", "Листопад");
        enguaMonths.put("December", "Грудень");
        System.out.println(enguaMonths);

        if (enguaMonths.containsKey(englishWord2)) {
            System.out.println(enguaMonths.get(englishWord2));
        } else {
            System.out.println("В словнику наразі немає такого слова. Сбробуйте ще раз!");
            addTranslation(englishWord2);
            enguaMonths.put(englishWord2, addTranslation(englishWord2));
        }
        System.out.println(enguaMonths);
    }

    public static String addTranslation(String obj) {
        System.out.println("Запропонуйте переклад слова " + obj);
        String translation = "fgfgfhf";
        return translation;
    }
}
