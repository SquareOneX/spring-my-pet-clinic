package squareonex.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import squareonex.mypetclinic.model.Owner;
import squareonex.mypetclinic.model.Pet;
import squareonex.mypetclinic.model.PetType;
import squareonex.mypetclinic.model.Vet;
import squareonex.mypetclinic.services.OwnerService;
import squareonex.mypetclinic.services.PetService;
import squareonex.mypetclinic.services.VetService;

import java.time.LocalDate;
import java.time.Month;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = ownerService.findAll().size();

        if (count == 0 ){
            loadData();
        }
    }

    private void loadData() {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

        Pet pet1 = new Pet();
        pet1.setOwner(owner1);

        PetType petType = new PetType("cat");

        pet1.setPetType(petType);
        pet1.setBirthDate(LocalDate.of(2022, Month.JANUARY, 20));
        petService.save(pet1);

        Pet pet2 = new Pet();
        pet2.setOwner(owner2);

        pet2.setPetType(petType);
        pet2.setBirthDate(LocalDate.of(2022, Month.OCTOBER, 15));
        petService.save(pet2);

        System.out.println("Loaded Pets....");
    }}
