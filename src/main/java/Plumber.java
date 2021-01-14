import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Plumber {
    private final Long plumberId;
    private String qualifications;

    private static final List<Plumber> plumbers = new ArrayList<>();
    public Plumber(Long plumberId, String qualifications) {
        this.plumberId = plumberId;
        this.qualifications = qualifications;
        plumbers.add(this);
    }

    public Plumber(Long plumberId) {
        this.plumberId = plumberId;
        plumbers.add(this);
    }

    public Long getPlumberId() {
        return plumberId;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public static List<Plumber> getAllPlumbers(){
        return plumbers;
    }
    public static Optional<Plumber> getPlumberById(Long id){
        return plumbers.stream().filter(p -> p.plumberId.equals(id)).findAny();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plumber plumber = (Plumber) o;
        return Objects.equals(plumberId, plumber.plumberId) &&
                Objects.equals(qualifications, plumber.qualifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plumberId, qualifications);
    }

    @Override
    public String toString() {
        return "Plumber{" +
                "plumberId=" + plumberId +
                ", qualifications='" + qualifications + '\'' +
                '}';
    }
}
