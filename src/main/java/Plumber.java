import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Plumber {
    private final Long plumberId;
    private String qualifications;

    private static List<Plumber> plumbers = new ArrayList<>();
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


}
