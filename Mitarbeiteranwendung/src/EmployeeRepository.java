import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements ICrudRepository<Employees>{
    public List<Employees> employees = new ArrayList<Employees>();

    @Override
    public Employees findOne(String name) {
        for(Employees i: this.employees)
            if (i.getName().equals(name)) return i;
        return null;
    }

    @Override
    public Iterable<Employees> findAll() {
        return this.employees;
    }

    @Override
    public Employees save(Employees entity) {
        for (Employees i : this.employees)
            if (entity.getName().equals(i.getName())) return entity;
        this.employees.add(entity);
        return null;
    }

    @Override
    public Employees delete(Long id) {
        this.employees.removeIf(i -> i.getName().equals(i.name));
        return null;
    }

    @Override
    public Employees update(Employees entity) {
        for (Employees i : this.employees){
            if (i.getName().equals(entity.getName())){
                this.employees.remove(i);
                this.employees.add(entity);
            }
        }
        return entity;
    }
}
