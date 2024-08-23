package andrevsc.git_flow_model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitFlowModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitFlowModelApplication.class, args);
		System.out.println("\nPROJETO DEVELOP\n");

		Feature feature = new Feature();

		feature.newFeature("\nNEW FEATURE ADD\n");

		feature.getFeature(0);
	}
}
