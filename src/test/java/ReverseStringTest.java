import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStringTest {

    @Test
    void should_return_empty_string_for_empty_input() {
        assertThat(ReverseString.reverse("")).isEqualTo("");
    }

    @Test
    void should_return_same_character_for_single_character_input() {
        assertThat(ReverseString.reverse("a")).isEqualTo("a");
    }

    @Test
    void should_reverse_string_with_multiple_characters() {
        assertThat(ReverseString.reverse("hello")).isEqualTo("olleh");
    }

    @Test
    void should_handle_strings_with_leading_and_trailing_spaces() {
        assertThat(ReverseString.reverse("  world  ")).isEqualTo("  dlrow  ");
    }

    @Test
    void should_correctly_reverse_palindromic_string() {
        assertThat(ReverseString.reverse("madam")).isEqualTo("madam");
    }

    @Test
    void should_handle_string_with_numbers_and_symbols() {
        assertThat(ReverseString.reverse("1a2b!")).isEqualTo("!b2a1");
    }
}
