package jak.dut.Investment.controller;

import jak.dut.Investment.model.calculation.Calculation;
import jak.dut.Investment.model.investment.Investment;
import jak.dut.Investment.service.CalculationService;
import jak.dut.Investment.service.InvestmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investment")
public class CalculationController {

    private final CalculationService calculationService;
    private final InvestmentService investmentService;

    public CalculationController(CalculationService calculationService, InvestmentService investmentService) {
        this.calculationService = calculationService;
        this.investmentService = investmentService;
    }

    @GetMapping("/{id}/calculations")
    public void getAllCalculationByInvesmnentId(@PathVariable("id") Long investmentId) {
        Investment investment = investmentService.getInvestmentById(investmentId);
        List<Calculation> allCalculationByInvestment = calculationService.findAllCalculationByInvestmentId(investmentId);
        System.out.println("Investment type: " + investment + allCalculationByInvestment);
    }

}
