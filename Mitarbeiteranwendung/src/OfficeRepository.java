import java.util.ArrayList;
import java.util.List;

public class OfficeRepository implements ICrudRepository<Office>{
    public List<Office> offices = new ArrayList<Office>();

    @Override
    public Office findOne(String name) {
        for(Office i: this.offices)
            if (i.getOrt() == i.ort) return i;
        return null;
    }

    @Override
    public Iterable<Office> findAll() {
        return this.offices;
    }

    @Override
    public Office save(Office entity) {
        for (Office i : this.offices)
            if (entity.getOrt().equals(i.getOrt())) return entity;
        this.offices.add(entity);
        return null;
    }

    @Override
    public Office delete(Long id) {
        this.offices.removeIf(i -> i.getOrt().equals(i.Ort));
        return null;
    }

    @Override
    public Office update(Office entity) {
        for (Office i : this.offices){
            if (i.getOrt().equals(entity.getOrt())){
                this.offices.remove(i);
                this.offices.add(entity);
            }
        }
        return entity;
    }
}
