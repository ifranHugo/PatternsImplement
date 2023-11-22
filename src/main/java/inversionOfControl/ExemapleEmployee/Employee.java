package inversionOfControl.ExemapleEmployee;

public class Employee {
    private String name;

    private String work;
    private int dni;

    public Employee(String name, String work, int dni) {
        this.name = name;
        this.work = work;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
