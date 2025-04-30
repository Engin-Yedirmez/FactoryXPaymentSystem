public class CommisionEmployee extends Employee
{
    private double grossSales;
    private double commisionRate;

    public CommisionEmployee(String first, String last, String ssn,
                              double sales, double rate){
        super(first, last, ssn);
        setGrossSales(sales);
        setCommisionRate(rate);
    }

    public void setCommisionRate(double rate){
        if(rate > 0.0 && rate < 1.0){
            commisionRate = rate;
        }else{
            throw new IllegalArgumentException(
                    "Commision rate must be > 0.0 and < 1.0");
        }
    }

    public double getCommisionRate(){
        return commisionRate;
    }

    public void setGrossSales(double sales){
        if(sales >= 0.0){
            grossSales = sales;
        }else{
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }
    }

    public double getGrossSales(){
        return grossSales;
    }


    @Override
    public double getPaymentAmount(){
        return getCommisionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "Commission employee", super.toString(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommisionRate());
    }

}