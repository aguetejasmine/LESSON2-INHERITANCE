public class SalesPerson extends Employee {
    
    private double commissionPercentage;

    //constructor
    public SalesPerson (String name, double salary, int age, double commisionPercentage) {
        super(name, age, salary);

        this.commissionPercentage = commisionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < 0.30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}
