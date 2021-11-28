package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public final OwnerService ownerService;
    public final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.print("Loading Owners");
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");
        ownerService.save(owner1);
        System.out.print(" .... ...");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Lenon");
        ownerService.save(owner2);
        System.out.print(" .... ...");

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("George");
        owner3.setLastName("Michael");
        ownerService.save(owner3);
        System.out.print(" .... ...");
        System.out.println("  ...\nCompleted loading Owners.!\n");


        System.out.print("Loading Vets");
        Vet vet1 = new Vet();
        vet1.setId(11L);
        vet1.setFirstName("Sanjay");
        vet1.setLastName("Gupta");
        vetService.save(vet1);
        System.out.print(" .... ...");

        Vet vet2 = new Vet();
        vet2.setId(12L);
        vet2.setFirstName("Ray");
        vet2.setLastName("Charles");
        vetService.save(vet2);
        System.out.print(" .... ...");

        Vet vet3 = new Vet();
        vet3.setId(13L);
        vet3.setFirstName("Micael");
        vet3.setLastName("Moore");
        vetService.save(vet3);
        System.out.print(" .... ...");
        System.out.println("  ...\nCompleted loading vets.!\n");

    }
}
