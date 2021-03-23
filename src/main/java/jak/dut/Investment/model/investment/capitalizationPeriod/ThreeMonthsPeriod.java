package jak.dut.Investment.model.investment.capitalizationPeriod;

public class ThreeMonthsPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.THREEMONTHS;
    }
}
