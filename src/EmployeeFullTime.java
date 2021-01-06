public class EmployeeFullTime extends Employee implements Comparable{
    private Employee employee;
    private int bonus;
    private int fine;
    private int hardSalary;

    public EmployeeFullTime(){

    }

    public EmployeeFullTime(Employee employee, int bonus, int fine, int hardSalary) {
        this.employee = employee;
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public EmployeeFullTime(String fullName, Employee employee, int bonus, int fine, int hardSalary) {
        super(fullName);
        this.employee = employee;
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public EmployeeFullTime(String codeEmployee, String fullName, String phone, String email, Employee employee, int bonus, int fine, int hardSalary) {
        super(codeEmployee, fullName, phone, email);
        this.employee = employee;
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
    public int salaryFullTime(){
        return this.hardSalary+this.bonus-this.fine;
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "employee=" + getFullName() +
                ", bonus=" + bonus +
                ", fine=" + fine +
                ", hardSalary=" + hardSalary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
       EmployeeFullTime employeeFullTime= (EmployeeFullTime) o;
        return this.getFullName().compareTo(((EmployeeFullTime) o).getFullName());
    }
}
