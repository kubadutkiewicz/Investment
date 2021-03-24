package jak.dut.Investment.service;

import jak.dut.Investment.model.calculation.Calculation;
import jak.dut.Investment.model.calculation.CalculationType;
import jak.dut.Investment.repository.CalculotionRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {

    private final CalculotionRepo calculotionRepo;
    private final InvestmentService investmentService;

    public CalculationServiceImpl(CalculotionRepo calculotionRepo, InvestmentService investmentService) {
        this.calculotionRepo = calculotionRepo;
        this.investmentService = investmentService;
    }

    @Override
    public List<Calculation> findAllCalculationByInvestmentId(Long investmentId) {
        List<Calculation> allCalculationByInvestmentId = new ArrayList<>();
        calculotionRepo.findAllByInvestmentId(investmentId).iterator().forEachRemaining(allCalculationByInvestmentId::add);
        return allCalculationByInvestmentId;
    }

    @Override
    public void addCalculation(Double amount, CalculationType calculationType) {
        Calculation newCalculation = new Calculation();
        newCalculation.setAmount(amount);
        newCalculation.setCalculationType(calculationType);
        LocalDate localDate = getLocalDate();
        newCalculation.setCalculationDate(localDate);
        //TODO !!
    }

    private LocalDate getLocalDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        return LocalDate.now();
    }


}
