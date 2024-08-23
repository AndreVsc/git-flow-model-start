package andrevsc.git_flow_model;

import java.util.List;
import java.util.ArrayList;

public class Feature {
    
    private List<String> features;

    public Feature() {
        features = new ArrayList<>();
    }

    public void newFeature(String feature) {
        features.add(feature);
    }

    public void getFeature(int n) {
        if (n >= 0 && n < features.size()) {
            System.out.println(features.get(n));
        } else {
            System.out.println("Feature não encontrada.");
        }
    }
}