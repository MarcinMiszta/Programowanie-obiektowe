public abstract class WorkTool {
    private String name;
    private int productionYear;

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public abstract void use();
}
