package Diploma;

import java.util.Set;

/**
 * Created by Master on 05-May-15.
 */
public interface ParsingDBBehaviour {
    public void addToDB(Set<String> alleleProcessingResult);
    public void compute();
    public Set<String> creatingOutputSet(String variationAllele);
    public void erase();
}
