package formatting;

import org.example.formatting.Formatting;

public class FormattingTextTest {
    public static void main(String[] args) {
        Formatting format = new Formatting();
        format.escapeSequences();
        format.textBlock();
        format.conversionNumber();
        format.stringFormatting();
    }
}
