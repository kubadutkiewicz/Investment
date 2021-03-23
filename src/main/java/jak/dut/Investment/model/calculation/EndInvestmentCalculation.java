package jak.dut.Investment.model.calculation;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;

public class EndInvestmentCalculation implements CalculaltionAlgorithmStrategy {

    @Override
    public Double calculation(Calculation calculation) {
        Double value = calculation.getAmount();
        Double interest = calculation.getInvestment().getRate();
        LocalDate startDate = calculation.getInvestment().getStartInvestmentDate();
        LocalDate endDate = calculation.getInvestment().getEndInvestmentDate();
        Duration periodInDays = Duration.between(endDate,startDate);
        Double finalIntrest;
        //double f=p*Math.pow((1+r/100),y);
//        finalIntrest = value*Math.pow((1+interest),periodInDays)
        return null;
    }
}
