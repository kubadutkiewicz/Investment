package jak.dut.Investment.model.investment;

public class YearPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.YEAR;
    }
}
