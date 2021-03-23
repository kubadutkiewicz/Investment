package jak.dut.Investment.model.calculation;

import java.math.BigDecimal;

public class CurrentInvestmentCalculation implements CalculaltionAlgorithmStrategy {

    @Override
    public BigDecimal calculation(Calculation calculation) {
        BigDecimal value = calculation.getAmount();

        return null;
    }
}
