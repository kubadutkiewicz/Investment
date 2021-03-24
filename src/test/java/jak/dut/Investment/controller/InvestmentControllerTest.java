package jak.dut.Investment.controller;

import jak.dut.Investment.model.investment.CapitalizationPeriod;
import jak.dut.Investment.model.investment.Investment;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InvestmentControllerTest {

    @Test
    public void shouldGetBetween() {
        InvestmentController investmentController = mock(InvestmentController.class);
        Investment investment = new Investment((long) 1, "Lokata", 0.05, CapitalizationPeriod.YEAR, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-30"));

        when(investmentController.getPeriodInDaysBetweenTwoDates(investment)).thenReturn(ChronoUnit.DAYS.between(investment.getStartInvestmentDate(), investment.getEndInvestmentDate()));

        Assert.assertNotEquals(28, investmentController.getPeriodInDaysBetweenTwoDates(investment));
        Assert.assertEquals(29, investmentController.getPeriodInDaysBetweenTwoDates(investment));
        Assert.assertNotEquals(30, investmentController.getPeriodInDaysBetweenTwoDates(investment));
    }
}