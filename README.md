# Factory X Payment System

This Java application calculates the weekly payment amounts for Factory X's employees and invoices using object-oriented programming principles like interfaces, inheritance, and polymorphism.

## 📦 Project Structure

This project includes the following classes:

### 🔹 `Payable` (Interface)
- Declares a method `double getPaymentAmount();`
- Implemented by both `Invoice` and `Employee` classes to enforce a common behavior.

### 🔹 `Invoice` (Implements Payable)
- Represents a single invoice with part number, description, quantity, and price per item.
- Implements `getPaymentAmount()` as `quantity * pricePerItem`.

### 🔹 `Employee` (Abstract Class, Implements Payable)
- Superclass for all types of employees.
- Contains common fields: `firstName`, `lastName`, `socialSecurityNumber`.
- Abstracts out the `getPaymentAmount()` method for subclass-specific implementation.

### 🔹 `SalariedEmployee` (Extends Employee)
- Paid a fixed weekly salary.
- Implements `getPaymentAmount()` to return `weeklySalary`.

### 🔹 `HourlyEmployee` (Extends Employee)
- Paid by the hour.
- Receives overtime (1.5× wage) for hours worked above 40.
- Implements `getPaymentAmount()` based on hours worked and hourly rate.

### 🔹 `CommissionEmployee` (Extends Employee)
- Paid a percentage of their total sales (commission).
- Implements `getPaymentAmount()` as `grossSales * commissionRate`.

### 🔹 `BasePlusCommissionEmployee` (Extends CommissionEmployee)
- Has a base salary in addition to commission-based earnings.
- Implements `getPaymentAmount()` as `baseSalary + (grossSales * commissionRate)`.

### 🔹 `Test` (Main Class)
- Contains the `main()` method.
- Demonstrates the use of polymorphism with an array of `Payable` references.
- Increases the base salary of `BasePlusCommissionEmployee` objects by 10%.
- Prints detailed object and payment information for each `Payable` item.

### 📄 License
This project was developed for educational purposes and is shared as a sample academic assignment.