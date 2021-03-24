package jak.dut.Investment.service;

import jak.dut.Investment.dto.InvestmentDTO;
import jak.dut.Investment.model.investment.Investment;

import java.util.List;

public interface InvestmentService {

    List<InvestmentDTO> getAllInvestments();

    Investment getInvestmentById(Long investmentId);

    Investment addInvestment(Investment investment);

}
