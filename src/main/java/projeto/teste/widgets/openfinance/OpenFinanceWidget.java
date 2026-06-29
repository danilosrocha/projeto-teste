package projeto.teste.widgets.openfinance;

import projeto.teste.widgets.templates.Button;
import projeto.teste.widgets.templates.TabularLine;
import projeto.teste.widgets.templates.TextChip;

public class OpenFinanceWidget {
    private final TextChip textChip;
    private final TabularLine tabularLine;
    private final Button button;

    public OpenFinanceWidget(TextChip textChip, TabularLine tabularLine, Button button) {
        this.textChip = textChip;
        this.tabularLine = tabularLine;
        this.button = button;
    }

    public TextChip getTextChip() { return textChip; }
    public TabularLine getTabularLine() { return tabularLine; }
    public Button getButton() { return button; }
}
