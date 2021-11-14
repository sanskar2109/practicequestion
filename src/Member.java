public class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;
    public void printsalary(){
        System.out.println(salary);
    }
}
class Employee extends Member {
    String specialization;
}
class Manger extends Member {
    String department;
}
class Ans {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="xyz";
        e.age=20;
        e.number="932***";
        e.address="abcd";
        e.salary=12345;
        e.specialization="xyzxyz";
        Manger m = new Manger();
        System.out.println();
    }
}