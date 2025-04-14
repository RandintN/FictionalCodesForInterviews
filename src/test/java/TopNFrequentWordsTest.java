
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TopNFrequentWordsTest {
    @Test void
    should_have_top_N_as_the_size_of_the_list() {
        // Arrange
        List<String> wordsToBeChecked = Arrays.asList("Java", "Javascript",
        "java", "C++", "javaScript", "Groovy", "jAvA", "abap","ABAP", "aBaP");
        int topMost = 3;

        // Act
        final var actualResult = TopNFrequentWords.findTopNFrequentWords(wordsToBeChecked, topMost); // Class Under Test

        // Assert
        assertThat(actualResult).hasSize(3);
    }

    @Test void
    should_have_most_frequently_words_on_the_list() {
        // Arrange
        List<String> wordsToBeChecked = Arrays.asList("Java", "Javascript", "java", "C++", "javaScript", "Groovy", "jAvA", "abap","ABAP", "aBaP");
        int topMost = 3;

        // Act
        final var actualResult = TopNFrequentWords.findTopNFrequentWords(wordsToBeChecked, topMost); // Class Under Test

        // Assert
        assertThat(actualResult)
                .satisfiesExactly(word -> assertThat(word).isEqualTo("abap"),
                                 word2 -> assertThat(word2).isEqualTo("java"),
                                 word3 -> assertThat(word3).isEqualTo("javascript"));
    }

}
