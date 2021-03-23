package jak.dut.Investment.repository;

import jak.dut.Investment.model.calculation.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculotionRepo extends JpaRepository<Calculation, Long> {

    List<Calculation> findAllByInvestmentId(@Param("investmentId") Long investmentId);

}
