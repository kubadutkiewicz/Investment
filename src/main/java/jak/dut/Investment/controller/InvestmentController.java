package jak.dut.Investment.controller;

import jak.dut.Investment.dto.InvestmentDTO;
import jak.dut.Investment.dto.NewInvestmentDTO;
import jak.dut.Investment.model.investment.Investment;
import jak.dut.Investment.service.InvestmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.temporal.ChronoUnit;
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
    public NewInvestmentDTO addInvestment(Investment investment) {
        Investment addedInvestment = investmentService.addInvestment(investment);
        NewInvestmentDTO newInvestmentDTO = setNewInvestmentDTO(investment);
        return newInvestmentDTO;
    }

    private NewInvestmentDTO setNewInvestmentDTO(Investment investment) {
        NewInvestmentDTO newInvestmentDTO = new NewInvestmentDTO();
        newInvestmentDTO.setId(investment.getId());
        newInvestmentDTO.setName(investment.getName());
        newInvestmentDTO.setRate(investment.getRate());
        long days = ChronoUnit.DAYS.between(investment.getStartInvestmentDate(), investment.getEndInvestmentDate());
        newInvestmentDTO.setPeriodInDays(days);
        return newInvestmentDTO;
    }
}
