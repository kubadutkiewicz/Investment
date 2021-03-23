package jak.dut.Investment.model.investment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double rate;
    private CapitalizationPeriod capitalizationPeriod;
    private LocalDate startInvestmentDate;
    private LocalDate endInvestmentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }


    public CapitalizationPeriod getCapitalizationPeriod() {
        return capitalizationPeriod;
    }

    public void setCapitalizationPeriod(CapitalizationPeriod capitalizationPeriod) {
        this.capitalizationPeriod = capitalizationPeriod;
    }

    public LocalDate getStartInvestmentDate() {
        return startInvestmentDate;
    }

    public void setStartInvestmentDate(LocalDate startInvestmentDate) {
        this.startInvestmentDate = startInvestmentDate;
    }

    public LocalDate getEndInvestmentDate() {
        return endInvestmentDate;
    }

    public void setEndInvestmentDate(LocalDate endInvestmentDate) {
        this.endInvestmentDate = endInvestmentDate;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interest=" + rate +
                ", capitalizationPeriod=" + capitalizationPeriod +
                ", startInvestmentDate=" + startInvestmentDate +
                ", endInvestmentDate=" + endInvestmentDate +
                '}';
    }
}
