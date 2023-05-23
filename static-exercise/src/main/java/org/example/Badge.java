package org.example;

public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee=employeeThatNeedsBadge;
        this.badgeIdCode=generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        String randomString= "";
        for (int i = 0; i < 3; i++) {
            randomString += (char) (Math.random() * 26 +65);
        }
        return randomString+employee.name+employee.surname+randomString;
    }

    public void showBadgeDetails() {
        System.out.println("the total number of employee tracked by the badges: "+totalNumberOfEmployees);
        System.out.println("the details of the employee: "+employee.getEmployeeDetails());
        System.out.println("Badge ID code: "+generateBadgeIdCode());
    }
}
