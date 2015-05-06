package Diploma;

import java.util.Set;

/**
 * Created by Master on 04-May-15.
 */
public interface SearchMethod {
    public Set<String> compute (String variationAllele, Set<String> parsedFile);
    public void erase();
}
