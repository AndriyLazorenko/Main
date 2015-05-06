package Diploma;


import java.util.Set;

/**
 * Created by Master on 28-Apr-15.
 */
public class YAllele extends Allele {

    private String variationAllele = "C/T";

    public YAllele () {
        searchMethod = new Before();
    }

    @Override
    public Set<String> methodOfSearch() {
        setOutputSet(searchMethod.compute(variationAllele, getSet()));
        return getOutputSet();
    }
}
