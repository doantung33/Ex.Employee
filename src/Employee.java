public class Employee {
    private String codeEmployee;
    private String fullName;
    private String phone;
    private String email;

    public Employee() {
    }
    public Employee(String  fullName){
        this.fullName=fullName;
    }

    public Employee(String codeEmployee, String fullName, String phone, String email) {
        this.codeEmployee = codeEmployee;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int salaryCalculate(){
        return 0;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "codeEmployee='" + codeEmployee + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
