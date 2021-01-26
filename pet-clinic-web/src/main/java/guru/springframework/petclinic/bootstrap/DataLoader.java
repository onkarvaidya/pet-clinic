package guru.springframework.petclinic.bootstrap;


import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner ownerJ = new Owner();

        ownerJ.setId(1L);
        ownerJ.setFirstName("Janhavi");
        ownerJ.setLastName("Dandekar");

        Owner ownerS = new Owner();

        ownerS.setId(2L);
        ownerS.setFirstName("Shekhar");
        ownerS.setLastName("Gogate");

        ownerService.save(ownerJ);
        ownerService.save(ownerS);

        System.out.println("Saved Owners... ");

        Vet vetOne = new Vet();

        vetOne.setId(1L);
        vetOne.setFirstName("First Vet One");
        vetOne.setLastName("Last Vet One");

        Vet vetTwo = new Vet();

        vetTwo.setId(2L);
        vetTwo.setFirstName("First Vet Two");
        vetTwo.setLastName("Last Vet Two");

        vetService.save(vetOne);
        vetService.save(vetTwo);

        System.out.println("Saved Vets... ");

    }
}
