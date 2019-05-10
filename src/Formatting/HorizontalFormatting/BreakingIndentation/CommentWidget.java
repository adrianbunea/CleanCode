package Formatting.HorizontalFormatting.BreakingIndentation;

import Formatting.HorizontalFormatting.BreakingIndentation.HelperClasses.ParentWidget;
import Formatting.HorizontalFormatting.BreakingIndentation.HelperClasses.TextWidget;

public class CommentWidget extends TextWidget {
    public static final String REGEXP = "^#[^\\r\\n]*(?:(?:\\r\\n)|\\n|\\r)?";

    public CommentWidget(ParentWidget parent, String text) {
        super(parent, text);
    }

    public String render() throws Exception {
        return "";
    }
}
