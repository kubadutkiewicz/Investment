package jak.dut.Investment.controller;

import jak.dut.Investment.dto.InvestmentDTO;
import jak.dut.Investment.model.investment.Investment;
import jak.dut.Investment.service.InvestmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api/investments")
public class InvestmentController {

    private final InvestmentService investmentService;

    public InvestmentController(InvestmentService investmentService) {
        this.investmentService = investmentService;
    }

    @GetMapping
    public List<InvestmentDTO> getAllInvestments() {
        List<InvestmentDTO> allInvestments = investmentService.getAllInvestments();
        return allInvestments;
    }

    @PostMapping
    public String addInvestment(Investment investment) {
        Investment addedInvestment = investmentService.addInvestment(investment);
        Duration periodInDays = Duration.between(addedInvestment.getEndInvestmentDate(), addedInvestment.getStartInvestmentDate());
        return ("ID: " + addedInvestment.getId() + "Name: " + addedInvestment.getName() + "Interest: " + addedInvestment.getInterest() + "Period in days: " + periodInDays);
    }
}
