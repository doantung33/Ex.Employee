import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager= new EmployeeManager();
        int n;
        do {
            System.out.println("--Mục lục--");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Nhân viên lương thấp");
            System.out.println("4. Tổng tiền nhân viên");
            System.out.println("5. Sắp xếp");
            System.out.println("0. Thoat");
            n=scanner.nextInt();
            switch (n){
                case 1:
                    employeeManager.add();
                    break;
                case 2:
                    employeeManager.show();
                    break;
                case 3:
                    employeeManager.lowSalaryStaff(employeeManager.getSalary());
                    break;
                case 4:
                    employeeManager.total();
                    break;
                case 5:
                    employeeManager.Sort();
                    break;
            }

        }while (n!=0);
    }
}
