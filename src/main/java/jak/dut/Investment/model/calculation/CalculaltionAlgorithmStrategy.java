package jak.dut.Investment.model.calculation;

import java.math.BigDecimal;

@FunctionalInterface
public interface CalculaltionAlgorithmStrategy {

    BigDecimal calculation(Calculation calculation);

}
