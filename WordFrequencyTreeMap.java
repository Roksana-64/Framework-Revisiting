import java.util.*;

public class WordFrequencyTreeMap {

    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        TreeMap<String, Integer> map = new TreeMap<>();

        String[] words = text.split(" ");

        for(String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        System.out.println(map);
    }
}
