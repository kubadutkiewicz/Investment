package jak.dut.Investment.model.calculation;

import jak.dut.Investment.model.calculation.resolver.CalculationResolver;
import org.springframework.stereotype.Service;

@Service
public class ProfitCalculation {

    private final CalculationResolver calculationResolver;

    public ProfitCalculation(CalculationResolver calculationResolver) {
        this.calculationResolver = calculationResolver;
    }

    public Double calculateProfit(Calculation calculation) {
        CalculationType calculationType = calculation.getCalculationType();

        CalculaltionAlgorithmStrategy calculaltionAlgorithmStrategy = calculationResolver.resolve(calculationType);
        Double profit = calculaltionAlgorithmStrategy.calculation(calculation);

        return profit;
    }
}
