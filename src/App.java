public class App {
    public static void main(String[] args) throws Exception {
        printEmployeeDetails(new Manager());
        printEmployeeDetails(new Salesman());

        
    }

    public static void printEmployeeDetails(Employee employee) {
        System.out.printf("=======s%========\n", employee.getClass().getSimpleName());
        switch (employee) {
            case Manager manager -> {
                System.out.printf("=======%s========\n", manager.getClass().getSimpleName());
                manager.setLogin("managerLogin");
                manager.setPassword("managerPassword");
                manager.setCommission(0.15);
                manager.setCode("MGR001");
                manager.setName("Manager Name");
                manager.setAddress("Manager Address");
                manager.setAge(40);
                manager.setSalary(5000.00);

                System.out.println("Code: " + manager.getCode());
                System.out.println("Login: " + manager.getLogin());
                System.out.println("Password: " + manager.getPassword());
                System.out.println("Commission: " + manager.getCommission());
                System.out.println("Address: " + manager.getAddress());
                System.out.println("Age: " + manager.getAge());
                System.out.println("Salary: " + manager.getSalary());
                System.out.println("Full Salary: " + manager.getFullSalary());
                System.out.println("Full Salary with Extra: " + manager.getFullSalary(1000.00));

                System.out.println(employee instanceof Salesman);
            }
            case Salesman salesman -> {
                System.out.printf("=======%s========\n", salesman.getClass().getSimpleName());
                salesman.setPercentPerSale(0.10);
                salesman.setCode("SLS001");
                salesman.setName("Salesman Name");
                salesman.setAddress("Salesman Address");
                salesman.setAge(30);
                salesman.setSalary(3000.00);
                salesman.setSoldAmmout(20000.00);
                System.out.println("Sold Amount: " + salesman.getSoldAmmout());
                System.out.println("Code: " + salesman.getCode());
                System.out.println("Name: " + salesman.getName());
                System.out.println("Address: " + salesman.getAddress());
                System.out.println("Age: " + salesman.getAge());
                System.out.println("Salary: " + salesman.getSalary());
                System.out.println("Percent per Sale: " + salesman.getPercentPerSale());
                System.out.println("Full Salary: " + salesman.getFullSalary());

                System.out.println(employee instanceof Salesman);
            }
            default -> {
            }
        }
        System.out.println("==================");
    }
}
