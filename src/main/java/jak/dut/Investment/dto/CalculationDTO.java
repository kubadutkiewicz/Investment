package jak.dut.Investment.dto;

import jak.dut.Investment.model.calculation.CalculationType;

import java.math.BigDecimal;

public class CalculationDTO {

    private final Double amount;
    private final CalculationType calculationType;

    public CalculationDTO(Double amount, CalculationType calculationType) {
        this.amount = amount;
        this.calculationType = calculationType;
    }

    public Double getAmount() {
        return amount;
    }

    public CalculationType getCalculationType() {
        return calculationType;
    }

    @Override
    public String toString() {
        return "CalculationDTO{" +
                "amount=" + amount +
                ", calculationType=" + calculationType +
                '}';
    }
}
