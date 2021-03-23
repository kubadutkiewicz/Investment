package jak.dut.Investment.dto;

public class InvestmentDTO {

    private final Long id;
    private final String name;

    public InvestmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "InvestmentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
