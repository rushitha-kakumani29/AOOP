package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

interface Iterator<T>{
	boolean hasNext();
	T next();
}
interface Aggregate<T>{
	Iterator<T> createIterator();
}
class Employee1{
	private String name;
	private double Salary;
	public Employee1(String name, double Salary) {
		this.name = name;
		this.Salary = Salary;
	}
	public double getSalary() {
		return Salary;
	}
}
class EmployeeIterator implements Iterator<Employee1> {
	private int currentIndex = 0;
    private List<Employee1> employees;

    public EmployeeIterator(List<Employee1> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employees.size();
    }

    @Override
    public Employee1 next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return employees.get(currentIndex++);
    }
	
}
class Company implements Aggregate<Employee1> {
    private List<Employee1> employees;

    public Company(List<Employee1> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee1> createIterator() {
        return new EmployeeIterator(employees);
    }
}
public class IteratorDesignPatternDemo {

	public static void main(String[] args) {
		List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Alice", 50000));
        employees.add(new Employee1("Bob", 60000));
        employees.add(new Employee1("Charlie", 70000));

        Company company = new Company(employees);
        Iterator<Employee1> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }

        System.out.println("Total salary: " + totalSalary);

	}

}
