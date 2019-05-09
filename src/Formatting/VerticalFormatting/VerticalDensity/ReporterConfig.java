package Formatting.VerticalFormatting.VerticalDensity;
import Formatting.VerticalFormatting.VerticalDensity.HelperClasses.Property;

import java.util.*;

public class ReporterConfig {
    private String m_className;
    private List<Property> m_properties = new ArrayList<Property>();

    public void addProperty(Property property) {
        m_properties.add(property);
    }
}
