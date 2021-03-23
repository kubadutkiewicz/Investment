package jak.dut.Investment.model.calculation;

import jak.dut.Investment.model.investment.capitalizationPeriod.CapitalizationPeriod;

import java.math.BigDecimal;

public class EndInvestmentCalculation implements CalculaltionAlgorithmStrategy {

    @Override
    public BigDecimal calculation(Calculation calculation) {
        BigDecimal value = calculation.getAmount();
        Double interest = calculation.getInvestment().getInterest();
        CapitalizationPeriod capitalizationPeriod = calculation.getInvestment().getCapitalizationPeriod();

        return null;
    }
}
