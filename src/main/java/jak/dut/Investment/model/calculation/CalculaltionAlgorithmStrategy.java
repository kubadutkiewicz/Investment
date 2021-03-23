package jak.dut.Investment.model.calculation;

import java.math.BigDecimal;

@FunctionalInterface
public interface CalculaltionAlgorithmStrategy {

    Double calculation(Calculation calculation);

}
