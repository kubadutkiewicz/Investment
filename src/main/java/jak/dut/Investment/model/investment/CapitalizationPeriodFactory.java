package jak.dut.Investment.model.investment;

public class CapitalizationPeriodFactory {

    public CapitalizationPeriod getCapitalizationPeriod(String capitalizationPeriod) {
        if (capitalizationPeriod == null) {
            return null;
        } else if (capitalizationPeriod.equalsIgnoreCase("MONTH")){
            return new MonthPeriod().getCapitalizationType();
        } else if (capitalizationPeriod.equalsIgnoreCase("THREEMONTHS")){
            return new ThreeMonthsPeriod().getCapitalizationType();
        } else if (capitalizationPeriod.equalsIgnoreCase("HALFYEAR")){
            return new HalfYearPeriod().getCapitalizationType();
        } else if (capitalizationPeriod.equalsIgnoreCase("YEAR")){
            return new YearPeriod().getCapitalizationType();
        } else
            return null;
    }
}
