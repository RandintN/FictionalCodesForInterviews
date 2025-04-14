import java.util.*;
import java.util.stream.Collectors;

public class TopNFrequentWords {
    public static List<String> findTopNFrequentWords(List<String> wordsToBeChecked, int topMost) {
        final var lowerCaseWords = wordsToBeChecked.stream().map(String::toLowerCase).toList();

        lowerCaseWords.stream().sorted().distinct().limit(topMost).toList();

        return lowerCaseWords.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator
                        .comparing(Map.Entry<String, Long>::getValue, Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey))
                .limit(topMost)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
