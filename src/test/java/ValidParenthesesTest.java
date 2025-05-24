import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidParenthesesTest {

    @Test
    void should_return_true_for_empty_string() {
        assertThat(ValidParentheses.isValid("")).isTrue();
    }

    @Test
    void should_return_true_for_simple_valid_pairs_like_round_brackets() {
        assertThat(ValidParentheses.isValid("()")).isTrue();
    }

    @Test
    void should_return_true_for_simple_valid_pairs_like_square_brackets() {
        assertThat(ValidParentheses.isValid("[]")).isTrue();
    }

    @Test
    void should_return_true_for_simple_valid_pairs_like_curly_brackets() {
        assertThat(ValidParentheses.isValid("{}")).isTrue();
    }

    @Test
    void should_return_true_for_nested_valid_parentheses() {
        assertThat(ValidParentheses.isValid("({[]})")).isTrue();
    }

    @Test
    void should_return_true_for_sequence_of_valid_parentheses() {
        assertThat(ValidParentheses.isValid("()[]{}")).isTrue();
    }

    @Test
    void should_return_false_for_unmatched_closing_bracket() {
        assertThat(ValidParentheses.isValid("([)]")).isFalse();
    }

    @Test
    void should_return_false_for_unmatched_opening_bracket() {
        assertThat(ValidParentheses.isValid("((")).isFalse();
    }

    @Test
    void should_return_false_for_single_opening_bracket() {
        assertThat(ValidParentheses.isValid("{")).isFalse();
    }

    @Test
    void should_return_false_for_single_closing_bracket() {
        assertThat(ValidParentheses.isValid(")")).isFalse();
    }

    @Test
    void should_return_false_for_mismatched_bracket_types() {
        assertThat(ValidParentheses.isValid("(]")).isFalse();
    }

    @Test
    void should_return_false_for_string_with_non_parentheses_characters() {
        assertThat(ValidParentheses.isValid("(a)")).isFalse();
    }

    @Test
    void should_return_false_for_valid_prefix_but_ending_with_open_bracket() {
        assertThat(ValidParentheses.isValid("()(")).isFalse();
    }

    @Test
    void should_return_false_for_valid_suffix_but_starting_with_closing_bracket() {
        assertThat(ValidParentheses.isValid("())")).isFalse();
    }
}
