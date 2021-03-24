package jak.dut.Investment.model.calculation;

import jak.dut.Investment.model.investment.Investment;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private LocalDate calculationDate;

    @ManyToOne
    private Investment investment;

    private CalculationType calculationType;
    private BigDecimal profit;

    public Calculation() {
    }

    public Calculation(Long id, BigDecimal amount, LocalDate calculationDate, Investment investment, CalculationType calculationType, BigDecimal profit) {
        this.id = id;
        this.amount = amount;
        this.calculationDate = calculationDate;
        this.investment = investment;
        this.calculationType = calculationType;
        this.profit = profit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(LocalDate calculationDate) {
        this.calculationDate = calculationDate;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }


    public CalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(CalculationType calculationType) {
        this.calculationType = calculationType;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "id=" + id +
                ", amount=" + amount +
                ", calculationDate=" + calculationDate +
                ", investment=" + investment +
                ", calculationType=" + calculationType +
                ", profit=" + profit +
                '}';
    }
}
