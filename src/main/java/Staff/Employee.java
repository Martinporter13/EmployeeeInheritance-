package Staff;

public abstract class Employee {
   private String name;
   private String NINum;
   private int salary;

   public Employee(String name, String NINum, int salary){
       this.name = name;
       this.NINum = NINum;
       this.salary = salary;
   }

    public String getName() {
        return name;
    }

    public String getNINum() {
        return NINum;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(){
       return getSalary() * 1.1;
    }

    public double payBonus(){
       return getSalary() * 0.01;
    }


}
