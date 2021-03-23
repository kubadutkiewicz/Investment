package jak.dut.Investment.model.investment;

public class HalfYearPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.HALFYEAR;
    }
}
