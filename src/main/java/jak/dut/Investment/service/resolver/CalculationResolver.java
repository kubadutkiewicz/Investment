package jak.dut.Investment.service.resolver;

import jak.dut.Investment.model.calculation.CalculaltionAlgorithmStrategy;
import jak.dut.Investment.model.calculation.CalculationType;

public interface CalculationResolver {

    CalculaltionAlgorithmStrategy resolve(CalculationType calculationType);
}
