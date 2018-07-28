package taks1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> taskString = new ArrayList<>();
        Collections.addAll(taskString,
                "this",
                "is", "lots", "of",
                "fun", "for", "every",
                "java", "programmer");
        markLenght4(taskString);
        for (String element : taskString) {
            System.out.println(element);
        }
    }

    private static void markLenght4(List<String> taskString) {
        for (int i = 0; i < taskString.size(); i++) {
            if (taskString.get(i).length() == 4) {
                taskString.add(i, "****");
                i++;
            }
        }
    }
}