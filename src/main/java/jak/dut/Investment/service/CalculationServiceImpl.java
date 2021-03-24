package jak.dut.Investment.service;

import jak.dut.Investment.model.calculation.Calculation;
import jak.dut.Investment.model.calculation.CalculationType;
import jak.dut.Investment.model.calculation.ProfitCalculation;
import jak.dut.Investment.model.investment.Investment;
import jak.dut.Investment.repository.CalculotionRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {

    private final CalculotionRepo calculotionRepo;
    private final InvestmentService investmentService;
    private ProfitCalculation profitCalculation;

    public CalculationServiceImpl(CalculotionRepo calculotionRepo, InvestmentService investmentService, ProfitCalculation profitCalculation) {
        this.calculotionRepo = calculotionRepo;
        this.investmentService = investmentService;
        this.profitCalculation = profitCalculation;
    }

    @Override
    public List<Calculation> findAllCalculationByInvestmentId(Long investmentId) {
        List<Calculation> allCalculationByInvestmentId = new ArrayList<>();
        calculotionRepo.findAllByInvestmentId(investmentId).iterator().forEachRemaining(allCalculationByInvestmentId::add);
        return allCalculationByInvestmentId;
    }

    @Override
    public void addCalculation(BigDecimal amount, CalculationType calculationType, Investment investment) {
        Calculation newCalculation = new Calculation();
        newCalculation.setAmount(amount);
        newCalculation.setCalculationType(calculationType);
        LocalDate localDate = getLocalDate();
        newCalculation.setCalculationDate(localDate);
        newCalculation.setInvestment(investment);
        newCalculation.setCalculationType(calculationType);
        newCalculation.setProfit(profitCalculation.calculateProfit(newCalculation));
    }

    private LocalDate getLocalDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        return LocalDate.now();
    }


}
