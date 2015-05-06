package Diploma;


import java.util.Set;

public class RAllele extends Allele {

    public String getVariationAllele() {
        return variationAllele;
    }

    public void setVariationAllele(String variationAllele) {
        this.variationAllele = variationAllele;
    }

    private String variationAllele = "A/G";

    public RAllele(){
        searchMethod = new After();
    }

    @Override
    public Set<String> methodOfSearch() {
        setOutputSet(searchMethod.compute(variationAllele, getSet()));
        return getOutputSet();
    }
}


