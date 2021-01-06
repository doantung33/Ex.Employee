public class EmployeePartTime extends Employee {
    private int hoursOfWorks;

    public EmployeePartTime() {
    }

    public EmployeePartTime(int hoursOfWorks) {
        this.hoursOfWorks = hoursOfWorks;
    }

    public EmployeePartTime(String codeEmployee, String fullName, String phone, String email, int hoursOfWorks) {
        super(codeEmployee, fullName, phone, email);
        this.hoursOfWorks = hoursOfWorks;
    }

    public int getHoursOfWorks() {
        return hoursOfWorks;
    }

    public void setHoursOfWorks(int hoursOfWorks) {
        this.hoursOfWorks = hoursOfWorks;
    }
    public int salaryPartTime(){
        return this.hoursOfWorks*100;
    }


    @Override
    public String toString() {
        return "EmployeePartTime{" +
                "hoursOfWorks=" + hoursOfWorks +
                '}';
    }
}
