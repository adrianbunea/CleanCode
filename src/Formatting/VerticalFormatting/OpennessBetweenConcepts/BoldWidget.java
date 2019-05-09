package Formatting.VerticalFormatting.OpennessBetweenConcepts;
import Formatting.HelperClasses.ParentWidget;
import Formatting.HelperClasses.Widgets;

import java.util.regex.*;
public class BoldWidget extends ParentWidget {
    public static final String REGEXP = "'''.+?'''";
    private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
            Pattern.MULTILINE + Pattern.DOTALL);

    public BoldWidget(ParentWidget parent, String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
        Widgets.addChildWidgets(match.group(1));
    }

    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<b>");
        html.append(Widgets.childHtml()).append("<b>");
        return html.toString();
    }
}
