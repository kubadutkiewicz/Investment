package jak.dut.Investment.model.investment.capitalizationPeriod;

public class HalfYearPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.HALFYEAR;
    }
}
