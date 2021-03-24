package jak.dut.Investment.dto;

import jak.dut.Investment.model.calculation.CalculationType;

import java.math.BigDecimal;

public class CalculationDTO {

    private final BigDecimal amount;
    private final CalculationType calculationType;

    public CalculationDTO(BigDecimal amount, CalculationType calculationType) {
        this.amount = amount;
        this.calculationType = calculationType;
    }

    public BigDecimal getAmount() {
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
