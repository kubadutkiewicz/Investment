package jak.dut.Investment.model.calculation.resolver;

import jak.dut.Investment.model.calculation.CalculaltionAlgorithmStrategy;
import jak.dut.Investment.model.calculation.CalculationType;

public interface CalculationResolver {

CalculaltionAlgorithmStrategy resolve(CalculationType calculationType);
}
