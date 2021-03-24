package jak.dut.Investment.service;

import jak.dut.Investment.dto.InvestmentDTO;
import jak.dut.Investment.dto.NewInvestmentDTO;
import jak.dut.Investment.model.investment.Investment;
import jak.dut.Investment.repository.InvestmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    private final InvestmentRepo investmentRepo;
    private ModelMapper modelMapper;

    public InvestmentServiceImpl(InvestmentRepo investmentRepo) {
        this.investmentRepo = investmentRepo;
    }

    @Override
    public List<InvestmentDTO> getAllInvestments() {
        return ((List<Investment>) investmentRepo
                .findAll())
                .stream()
                .map(this::convertToInvestmentDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Investment getInvestmentById(Long investmentId) {
        Investment investment = investmentRepo.findInvestmentById(investmentId);
        return investment;
    }

    private InvestmentDTO convertToInvestmentDTO(Investment investment) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        InvestmentDTO investmentDTO = modelMapper
                .map(investment, InvestmentDTO.class);
        return investmentDTO;
    }

    @Override
    public Investment addInvestment(Investment investment) {
        investmentRepo.save(investment);
    return investment;
    }

}
