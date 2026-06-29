package projeto.teste.widgets.templates;

public class TextChip {
    private final String label;
    private final String value;

    public TextChip(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() { return label; }
    public String getValue() { return value; }
}
