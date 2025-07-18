public non-sealed class Salesman extends Employee{
    private double percentPerSale;
    private double soldAmmout;

    public double getSoldAmmout() {
        return soldAmmout;
    }
    public double getPercentPerSale() {
        return percentPerSale;
    }
    public void setPercentPerSale(double percentPerSale) {
        this.percentPerSale = percentPerSale;
    }
    public void setSoldAmmout(double soldAmmout) {
        this.soldAmmout = soldAmmout;
    }
    @Override
    public double getFullSalary() {
        // TODO Auto-generated method stub
        return this.getSalary() + ((this.soldAmmout * this.percentPerSale) / 100);
    }
}
