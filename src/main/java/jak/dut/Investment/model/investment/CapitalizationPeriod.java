package jak.dut.Investment.model.investment;

public enum CapitalizationPeriod {

    MONTH(30),
    THREEMONTHS(90),
    HALFYEAR(180),
    YEAR(360);

    private int howManyDays;

    CapitalizationPeriod(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    public int getHowManyDays() {
        return howManyDays;
    }
}
