package squareonex.mypetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import squareonex.mypetclinic.model.Vet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VetServiceImplTest extends AbstractMapServiceTest<Vet, Long> {
    private VetServiceImpl unit;
    @Override
    @BeforeEach
    void setUp() {
        this.unit = new VetServiceImpl();
    }

    @Test
    public void saveingObjectsWithoutKeyShouldNotOverrideExistingObjects(){
        Vet existingObject = new Vet();
        existingObject.setId(0L);
        unit.map.put(0L, existingObject);

        unit.save(new Vet());

        assertEquals(2, unit.map.size());
    }
}