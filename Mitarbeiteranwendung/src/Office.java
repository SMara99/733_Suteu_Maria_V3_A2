public class Office {
    String ort;
    Employees[] listEmployees;

    public Office(String ort, Employees[] listEmployees) {
        this.ort = ort;
        this.listEmployees = listEmployees;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Employees[] getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(Employees[] listEmployees) {
        this.listEmployees = listEmployees;
    }
}
