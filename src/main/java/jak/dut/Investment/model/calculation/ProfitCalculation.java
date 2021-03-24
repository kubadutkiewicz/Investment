package jak.dut.Investment.model.calculation;

import jak.dut.Investment.model.calculation.resolver.CalculationResolver;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProfitCalculation {

    private final CalculationResolver calculationResolver;

    public ProfitCalculation(CalculationResolver calculationResolver) {
        this.calculationResolver = calculationResolver;
    }

    public BigDecimal calculateProfit(Calculation calculation) {
        CalculationType calculationType = calculation.getCalculationType();

        CalculaltionAlgorithmStrategy calculaltionAlgorithmStrategy = calculationResolver.resolve(calculationType);
        BigDecimal profit = calculaltionAlgorithmStrategy.calculation(calculation);

        return profit;
    }
}
