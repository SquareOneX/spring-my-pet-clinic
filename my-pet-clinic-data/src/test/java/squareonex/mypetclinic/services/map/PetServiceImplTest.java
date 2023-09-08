package squareonex.mypetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import squareonex.mypetclinic.model.Pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetServiceImplTest extends AbstractMapServiceTest<Pet, Long> {
    private PetServiceImpl unit;
    @Override
    @BeforeEach
    void setUp() {
        this.unit = new PetServiceImpl();
    }

    @Test
    public void saveingObjectsWithoutKeyShouldNotOverrideExistingObjects(){
        Pet existingObject = new Pet();
        existingObject.setId(0L);
        unit.map.put(0L, existingObject);

        unit.save(new Pet());

        assertEquals(2, unit.map.size());
    }
}