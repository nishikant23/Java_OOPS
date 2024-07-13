class Employee {
    String name;
    int salary;
    boolean RM;

    Employee(){
        //!. Empty constructor not do anything Just help to create Object
    }
    //Constructor-2;
//    Employee() {
//        System.out.println("This Employee constructor created");
//    }

    //Constructor  -3
//    Employee(String name, int salary, boolean rm) {
//        this.name = name;
//        this.salary = salary;
//        this.RM = rm;
//    }

    //Constructor - 4
    Employee(Employee s) {
        this.name = s.name;
        this.salary = s.salary;
        this.RM = s.RM;
    }


    public void printEmpData() {
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.RM);
    }
}

class Student {
    String name;
    int age;
    boolean pass;

    public void getStudentDetails() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.pass);
    }


}

class Pen {

    String name; //data members
    String color; //data members

    public void getPenDetails() { //
        //Methods = functions = Behaviours of Data members
        System.out.println(" Pen name="+this.name+" & its a "+this.color+" pen.");
        //'this'-keyword holds the obj-refrenceName(like: pen1 in this case) this.name = pen1.name it becomes
    }
}

public class Classes { //Class holds main-function
    public static void main(String[] args) { //main function always User interacted
        Pen pen1 = new Pen(); //Obj creation of Pen-class using 'new' keyword
        pen1.name = "Reynolds"; //pen1=obj, pen1.name = accessed pen1-obj's-property=name & assigned="Reynolds"
        pen1.color = "Blue"; //same

        pen1.getPenDetails(); //obj calling its class's Method

        //Student Class Obj Creation doing
        Student s1 = new Student();
        s1.age = 18; //doesnt matter the order in which we are assigning the valuesto obj-properties
        s1.name = "vikas"; //becaos we are using "obj.property_name"
        s1.pass = true;

        s1.getStudentDetails();

        //Constructors
        //1 Empty
        //Employee emp = new Employee(); //Every time Obj creates Constructor call & do-inside its code

        //2 Argumented
        //Employee emp1 = new Employee("Aman", 20000, false);
//        System.out.println(emp1.name); //assigned the 'emp1-obj' values here only passed
//        System.out.println(emp1.salary);//the values as arguments  then ALSO constructor-made assigned
//        System.out.println(emp1.RM);//the emp1-obj this values-arg
          //emp1.printEmpData();


        //3 CopyOf Constructor
        Employee demoEmp = new Employee(); //this obj created by empty-constructor
        demoEmp.salary = 40000;
        demoEmp.name = "Suhash";
        demoEmp.RM = true;

        Employee copiedEmp = new Employee(demoEmp);
        copiedEmp.printEmpData();

    }
}
