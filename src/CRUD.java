/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employee {

    private int NPM;
    private String name;
    private int SKS;

    Employee(int empno, String ename, int salary) {
        this.NPM = empno;
        this.name = ename;
        this.SKS = salary;
    }

    public int getEmpno() {
        return NPM;
    }

    public int getSalary() {
        return SKS;
    }

    public String getEname() {
        return name;
    }

    public String toString() {
        return NPM + " " + name + " " + SKS;
    }
}

public class CRUD {

    public static void main(String args[]) {
        List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Click 0 to leave this page");
            System.out.print("Enter your Choice : ");
            ch = s.nextInt();
            System.out.println("===================");
            System.out.println("===================");

            switch (ch) {
                case 1:
                    System.out.print("Enter NPM : ");
                    int eno = s.nextInt();
                    System.out.print("Enter Name : ");
                    String ename = s1.nextLine();
                    System.out.print("Enter SKS : ");
                    int salary = s.nextInt();
                    c.add(new Employee(eno, ename, salary));
                    break;

                case 2:
                    System.out.println("--------------------------");
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter NPM to Search : ");
                    int empno = s.nextInt();
                    System.out.println("--------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter NPM to Delete : ");
                    empno = s.nextInt();
                    System.out.println("--------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpno() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Successfully");
                    }
                    System.out.println("--------------------------");
                    break;

                case 5:
                    found = false;
                    System.out.print("Enter NPM to Update : ");
                    empno = s.nextInt();

                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()) {
                        Employee e = li.next();
                        if (e.getEmpno() == empno) {
                            System.out.print("Enter new Name : ");
                            ename = s1.nextLine();

                            System.out.print("Enter new SKS : ");
                            salary = s.nextInt();
                            li.set(new Employee(empno, ename, salary));
                            found = true;
                        }
                    }
                    System.out.println("--------------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Updated Successfully");
                    }
                    System.out.println("--------------------------");
                    break;
                default:
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
                    System.out.println("GOOD BYE HAVE A NICE DAY ! :D");
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
            }

        } while (ch != 0);
    }

}
