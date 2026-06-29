package projeto.teste.widgets.openfinance;

import projeto.teste.widgets.templates.Button;
import projeto.teste.widgets.templates.TabularLine;
import projeto.teste.widgets.templates.TextChip;

public class OpenFinanceService {
    public TextChip buildTextChip() {
        return new TextChip("Saldo disponível", "R$ 2.500,00");
    }

    public TabularLine buildTabularLine() {
        return new TabularLine("Conta", "0001-0");
    }

    public Button buildButton() {
        return new Button("Ver detalhes");
    }

    public OpenFinanceWidget build() {
        return new OpenFinanceWidget(
                    buildTextChip(),
                    buildTabularLine(),
                    buildButton());
    }
}
