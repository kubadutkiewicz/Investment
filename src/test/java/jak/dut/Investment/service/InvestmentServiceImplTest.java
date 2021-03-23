package jak.dut.Investment.service;

import jak.dut.Investment.dto.InvestmentDTO;
import jak.dut.Investment.model.investment.CapitalizationPeriod;
import jak.dut.Investment.model.investment.Investment;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class InvestmentServiceImplTest {

    @Test
    public void shouldAddInvestment() {
        InvestmentService investmentService = mock(InvestmentService.class);
        Investment investment = new Investment((long) 1, "Lokata", 0.05, CapitalizationPeriod.YEAR, LocalDate.parse("2021-04-01"), LocalDate.parse("2024-04-01"));

        when(investmentService.addInvestment(investment)).thenReturn(investment);

        Assert.assertEquals("Lokata", investmentService.addInvestment(investment).getName());
        Assert.assertEquals(CapitalizationPeriod.YEAR, investmentService.addInvestment(investment).getCapitalizationPeriod());
        Assert.assertEquals(LocalDate.parse("2021-04-01"), investmentService.addInvestment(investment).getStartInvestmentDate());
    }

    @Test
    public void getInvestmentById() {
        InvestmentService investmentService = mock(InvestmentService.class);
        List<Investment> list = listOfInvestmentForTests();

        when(investmentService.getInvestmentById((long) 2)).thenReturn(list.get(1));

        Assert.assertEquals("Srebrna", investmentService.getInvestmentById((long) 2).getName());
        Assert.assertNotEquals("Brązowa", investmentService.getInvestmentById((long) 2).getName());
    }

    @Test
    public void shouldGetAllInvestments() {
        InvestmentService investmentService = mock(InvestmentService.class);

        when(investmentService.getAllInvestments()).thenReturn(listOfInvestmentDTOForTests());

        Assert.assertEquals("Złota", investmentService.getAllInvestments().get(0).getName());
        Assert.assertNotEquals("Złota", investmentService.getAllInvestments().get(2).getName());
    }

    private List<Investment> listOfInvestmentForTests() {
        List<Investment> listOfInvestment = new ArrayList<>();
        listOfInvestment.add(new Investment((long) 1, "Złota", 1.5, CapitalizationPeriod.YEAR, LocalDate.parse("2021-04-01"), LocalDate.parse("2025-04-01")));
        listOfInvestment.add(new Investment((long) 2, "Srebrna", 1.0, CapitalizationPeriod.HALFYEAR, LocalDate.parse("2021-04-01"), LocalDate.parse("2023-04-01")));
        listOfInvestment.add(new Investment((long) 3, "Brązowa", 0.5, CapitalizationPeriod.THREEMONTHS, LocalDate.parse("2021-04-01"), LocalDate.parse("2022-04-01")));
        return listOfInvestment;
    }

    private List<InvestmentDTO> listOfInvestmentDTOForTests() {
        List<InvestmentDTO> listOfInvestment = new ArrayList<>();
        listOfInvestment.add(new InvestmentDTO((long) 1, "Złota"));
        listOfInvestment.add(new InvestmentDTO((long) 2, "Srebrna"));
        listOfInvestment.add(new InvestmentDTO((long) 3, "Brązowa"));
        return listOfInvestment;
    }
}