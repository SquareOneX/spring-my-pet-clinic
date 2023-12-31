package squareonex.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import squareonex.mypetclinic.model.*;
import squareonex.mypetclinic.services.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialtyService vetSpecialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService, PetTypeService petTypeService, SpecialtyService vetSpecialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.vetSpecialtyService = vetSpecialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = ownerService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    public void loadData() {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Dresdner Straße 200");
        owner1.setCity("Freiberg - GER");
        owner1.setTelephone("0815 4206969");

        owner1 = ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Main Street 1");
        owner2.setCity("Diamond City");
        owner2.setTelephone(null);

        owner2 = ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Specialty specialty1 = new Specialty("Dog care");
        Specialty specialty2 = new Specialty("Animal dentistry");
        specialty1 = vetSpecialtyService.save(specialty1);
        specialty2 = vetSpecialtyService.save(specialty2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.setSpecialties(Set.of(specialty1));

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.setSpecialties(Set.of(specialty2));

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

        Pet pet1 = new Pet();
        pet1.setOwner(owner1);
        pet1.setName("Tom");

        PetType petType = new PetType("cat");

        pet1.setPetType(petType);
        pet1.setBirthDate(LocalDate.of(2022, Month.JANUARY, 20));

        Pet pet2 = new Pet();
        pet2.setOwner(owner2);
        pet2.setName("bola");

        pet2.setPetType(petType);
        pet2.setBirthDate(LocalDate.of(2022, Month.OCTOBER, 15));

        Pet pet3 = new Pet();
        pet3.setOwner(owner1);
        pet3.setBirthDate(LocalDate.of(2023, Month.JUNE, 1));

        PetType petType1 = new PetType("cat");
        PetType petType2 = new PetType("dog");
        PetType petType3 = new PetType("mouse");

        petType1 = petTypeService.save(petType1);
        petType2 = petTypeService.save(petType2);
        petType3 = petTypeService.save(petType3);


        pet1.setPetType(petType1);
        pet2.setPetType(petType2);
        pet2 = petService.save(pet2);
        pet1 = petService.save(pet1);

        System.out.println("Loaded Pets....");

        owner1.setPets(Set.of(pet1, pet3));
        owner2.setPets(Set.of(pet2));
    }
}
