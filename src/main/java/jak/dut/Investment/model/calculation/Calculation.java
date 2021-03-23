package jak.dut.Investment.model.calculation;

import jak.dut.Investment.model.investment.Investment;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private LocalDate calculationDate;

    @ManyToOne
    private Investment investment;

    private CalculationType calculationType;
    private Double profit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
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
