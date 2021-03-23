package jak.dut.Investment.model.investment;

public class MonthPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.MONTH;
    }

}
