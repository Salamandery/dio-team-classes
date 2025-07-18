public non-sealed class Manager extends Employee {
    private String login;
    private String password;
    private double commission;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public double getCommission() {
        return commission;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double getFullSalary() {
        // TODO Auto-generated method stub
        return this.getSalary() + this.commission;
    }

    public double getFullSalary(double extra) {
        return this.getSalary() + this.commission + extra;
    }
}
