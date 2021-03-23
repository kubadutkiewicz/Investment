package jak.dut.Investment.model.calculation.resolver;

import jak.dut.Investment.model.calculation.CalculaltionAlgorithmStrategy;
import jak.dut.Investment.model.calculation.CalculationType;
import jak.dut.Investment.model.calculation.CurrentInvestmentCalculation;
import jak.dut.Investment.model.calculation.EndInvestmentCalculation;
import org.springframework.stereotype.Service;

@Service
public class SwitchCalculationResolver implements CalculationResolver {

    @Override
    public CalculaltionAlgorithmStrategy resolve(CalculationType calculationType) {
        CalculaltionAlgorithmStrategy calculaltionAlgorithmStrategy;

        switch (calculationType) {
            case CURRENT:
                calculaltionAlgorithmStrategy = new CurrentInvestmentCalculation();
                break;
            case END:
                calculaltionAlgorithmStrategy = new EndInvestmentCalculation();
                break;
            default:
                throw new IllegalArgumentException("Unknow calculation type " + calculationType);
        }
        return calculaltionAlgorithmStrategy;
    }
}
