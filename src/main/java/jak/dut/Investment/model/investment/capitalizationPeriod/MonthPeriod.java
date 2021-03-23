package jak.dut.Investment.model.investment.capitalizationPeriod;

public class MonthPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.MONTH;
    }

}
