package jak.dut.Investment.dto;

public class NewInvestmentDTO {

    private Long id;
    private String name;
    private Double rate;
    private long periodInDays;


    public NewInvestmentDTO(Long id, String name, Double rate, long periodInDays) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.periodInDays = periodInDays;
    }

    public NewInvestmentDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public long getPeriodInDays() {
        return periodInDays;
    }

    public void setPeriodInDays(long periodInDays) {
        this.periodInDays = periodInDays;
    }

    @Override
    public String toString() {
        return "NewInvestmentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", periodInDays=" + periodInDays +
                '}';
    }
}
