package jak.dut.Investment.model.investment;

public class ThreeMonthsPeriod implements CapitalizationPeriodInterface {

    @Override
    public CapitalizationPeriod getCapitalizationType() {
        return CapitalizationPeriod.THREEMONTHS;
    }
}
