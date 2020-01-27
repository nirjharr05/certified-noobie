class Employee {
  private String name;
  private int id;
  private String address;
  private float sal;

  public Employee() {
    name = "Undefined";
    id = 0;
    address = "None";
    sal = 0.0F;
  }

  public Employee(String n, int i, String ad, float s) {
    
    name = n;
    id = i;
    address = ad;
    sal = s;
  }

  public float readSal() {
    return sal;
  }

  public void writeSal(float s) {
    sal = s;
  }

  public void printDetails(){
    System.out.println("Employee :");
    System.out.println("Name     : " + name);
    System.out.println("ID       : " + id);
    System.out.println("Address  : " + address);
    System.out.println("Salary   : " + sal);
    System.out.println("----------------------");
  }
}

class Dept {
  private Employee[] ar;
  private String name;
  private String location;
  private int i;
  public Dept() {
    i = 0;
    ar = new Employee[2];
    name = "Invalid";
    location = "Invalid";
  }

  public Dept(int size, String n, String loc) {
    i = 0;
    ar = new Employee[size];
    name = n;
    location = loc;
  }
  public void addEmployee(int x, String n, int i, String ad, float s){
      ar[x] = new Employee(n, i, ad, s);
  }

  public void add(Employee ex) {
    ar[i++] = ex;
  }

  public void remove() {
    i--;
  }

  public void printDept() {
    System.out.println("\nDepartment:\n\n");
    System.out.println("Dept. Name  : " + name);
    System.out.println("Location    : " + location);
    for(int k=0; k<ar.length; ++k) {
      ar[k].printDetails();
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {
    Dept dep = new Dept(5, "Information Technology", "Salt Lake");
    dep.addEmployee(0,"Employee 1", 1, "Address 1", 1500F);
    dep.addEmployee(1, "Employee 2", 2, "Address 2", 3000F);
    dep.addEmployee(2, "Employee 3", 3, "Address 3", 2500F);
    dep.addEmployee(3, "Employee 4", 4, "Address 4", 3600F);
    dep.addEmployee(4, "Employee 5", 5, "Address 5", 4300F);
    dep.printDept();
    //float totalSal = e1.readSal() + e2.readSal() + e3.readSal() + e4.readSal() + e5.readSal();
    //System.out.println("Yearly expenditure of this department = " + totalSal);
  }
}