package guru.springframework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		System.out.println("About to run the SfgPetClinicApplication.......");
		SpringApplication.run(SfgPetClinicApplication.class, args);
		System.out.println("Completed running SfgPetClinicApplication.......");
	}
}
