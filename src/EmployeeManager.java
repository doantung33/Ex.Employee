import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeManager {
    ArrayList<EmployeeFullTime> fullTimes = new ArrayList<>();
    ArrayList<EmployeePartTime> partTimes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n;

    public void add(){
        System.out.println("1.thêm nhân viên toàn thời gian");
        System.out.println("2.thêm nhân viên bán thời gian");
        n=sc.nextInt();
        switch (n){
            case 1:
                EmployeeFullTime employeeFullTime = new EmployeeFullTime();
                System.out.println("Nhập tên");
                String nameFullTime = sc.nextLine();
                employeeFullTime.setFullName(nameFullTime);
                System.out.println("Nhập lương cứng");
                int hardSalary = Integer.parseInt(sc.nextLine());
                employeeFullTime.setHardSalary(hardSalary);
                System.out.println("Nhập tiền thưởng");
                int bonus = Integer.parseInt(sc.nextLine());
                employeeFullTime.setBonus(bonus);
                System.out.println("Nhập tiền phạt");
                int fine = Integer.parseInt(sc.nextLine());
                employeeFullTime.setFine(fine);

                fullTimes.add(employeeFullTime);
                break;
            case 2:
                EmployeePartTime employeePartTime = new EmployeePartTime();
                System.out.println("Nhập tên");
                String namePartTime = sc.nextLine();
                employeePartTime.setFullName(namePartTime);
                System.out.println("Nhập số giờ làm thêm");
                int hoursOfWork = Integer.parseInt(sc.nextLine());
                employeePartTime.setHoursOfWorks(hoursOfWork);
                partTimes.add(employeePartTime);
                break;
        }

    }

    public void show() {
        System.out.println("1.hiển thị nhân viên toàn thời gian");
        System.out.println("2.hiển thị viên bán thời gian");
        n=sc.nextInt();
        switch (n){
            case 1:
                for (EmployeeFullTime employeeFullTime : fullTimes) {
                    if (employeeFullTime instanceof EmployeeFullTime){
                        System.out.println(employeeFullTime.toString());
                    }
                }
                break;
            case 2:
                for (EmployeePartTime employeePartTime : partTimes) {
                    if (employeePartTime instanceof EmployeePartTime){
                        System.out.println(employeePartTime.toString());
                    }
                }
                break;

        }

    }

    public int getSalary() {
        int total = 0;
        for (EmployeeFullTime employeeFullTime : fullTimes
        ) {
            total += employeeFullTime.salaryFullTime();
        }
        int salary = total / fullTimes.size();
        return salary;

    }

    public void lowSalaryStaff(int salary) {
        for (int i = 0; i < fullTimes.size(); i++) {
            if (fullTimes.get(i).salaryFullTime() < salary) {
                System.out.println(fullTimes.get(i).toString());
            }
        }
    }

    public void total() {
        int total = 0;
        for (EmployeePartTime employeePartTime : partTimes) {
            if (employeePartTime instanceof EmployeePartTime){
                total += employeePartTime.salaryPartTime();
            }
        }
        System.out.println("tông lương nhân viên: "+total);
    }
    public void Sort() {
        System.out.println("chưa săp xếp");
        for (EmployeeFullTime e : fullTimes) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("after arrangement");
        Collections.sort(fullTimes);
        for (Employee e : fullTimes) {
            System.out.println(e.toString());
        }
    }
}