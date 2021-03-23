package jak.dut.Investment.service;

import jak.dut.Investment.dto.CalculationDTO;
import jak.dut.Investment.model.calculation.Calculation;

import java.util.List;

public interface CalculationService {

    List<Calculation> fingAllCalculationByInvestmentId(Long investmentId);

    void addCalculation(CalculationDTO calculationDTO);

}
