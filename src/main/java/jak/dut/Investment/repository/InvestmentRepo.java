package jak.dut.Investment.repository;

import jak.dut.Investment.model.investment.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepo extends JpaRepository<Investment, Long> {

    Investment findInvestmentById(Long investmentId);

}
