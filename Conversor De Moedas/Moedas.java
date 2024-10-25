import java.util.Map;

public class Moedas {
    private String codigoMoeda;
    private Map<String, Double> conversion_rates;

    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public Map<String, Double> getTaxasDeConversao() {
        return conversion_rates;
    }

    public void setTaxasDeConversao(Map<String, Double> taxasDeConversao) {
        this.conversion_rates = taxasDeConversao;
    }
}