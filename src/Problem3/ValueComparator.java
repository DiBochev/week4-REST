package Problem3;
import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
       
    public int compare(String a, String b) {
        if (this.base.get(b) > this.base.get(a)) {
            return 1;
        } else {
            return -1;
        }
    }
}