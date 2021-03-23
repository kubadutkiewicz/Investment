package jak.dut.Investment.model.investment.capitalizationPeriod;

public class YearPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.YEAR;
    }
}
