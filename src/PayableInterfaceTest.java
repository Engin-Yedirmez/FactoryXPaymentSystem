public class PayableInterfaceTest {
    
	public static void main(String[] args) {

        Payable[] payableObjects = new Payable[6];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00);
        payableObjects[4] =
                new CommisionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06);
        payableObjects[5] =
                new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00);

        System.out.println(
                "------ Invoices and Employees processed polymorphically:------\n");

        for(Payable currentPayable : payableObjects){
        	  if(currentPayable instanceof BasePlusCommisionEmployee){
                  BasePlusCommisionEmployee employee =
                          (BasePlusCommisionEmployee)currentPayable;
                  double employeePay = employee.getBaseSalary();
                  double newSalary = employeePay + (employeePay * .10);
                  employee.setBaseSalary(newSalary);
                  
                  System.out.printf("%s \n%s: $%,.2f\n\n",
                          currentPayable.toString(), "The base pay of " + employee.getFirstName() + " " +
                                  employee.getLastName() + " with a 10% raise is $" + employee.getBaseSalary() + "\n" +
                          "Payment due", currentPayable.getPaymentAmount());
              }
        	  else {
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "Payment due", currentPayable.getPaymentAmount());
        	  }
        }
        System.out.println("Payable object 0 is a Invoice");
        System.out.println("Payable object 1 is a Invoice");
        System.out.println("Payable object 2 is a SalariedEmployee");
        System.out.println("Payable object 3 is a HourlyEmployee");
        System.out.println("Payable object 4 is a CommissionEmployee");
        System.out.println("Payable object 5 is a BasePlusCommissionEmployee");
    }

}
