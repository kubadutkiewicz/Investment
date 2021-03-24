package jak.dut.Investment.service;

import jak.dut.Investment.model.calculation.Calculation;
import jak.dut.Investment.model.calculation.CalculationType;

import java.math.BigDecimal;
import java.util.List;

public interface CalculationService {

    List<Calculation> findAllCalculationByInvestmentId(Long investmentId);

    Calculation addCalculation(BigDecimal amount, CalculationType calculationType, Long investmentId);

}
