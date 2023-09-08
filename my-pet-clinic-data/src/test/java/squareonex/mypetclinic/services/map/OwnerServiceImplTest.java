package squareonex.mypetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import squareonex.mypetclinic.model.Owner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerServiceImplTest extends AbstractMapServiceTest<Owner, Long>{
    private OwnerServiceImpl unit;
    @Override
    @BeforeEach
    void setUp() {
        super.setUp();
        this.unit = new OwnerServiceImpl();
    }

    @Test
    public void saveingObjectsWithoutKeyShouldNotOverrideExistingObjects(){
        Owner existingObject = new Owner();
        existingObject.setId(0L);
        unit.map.put(0L, existingObject);

        unit.save(new Owner());

        assertEquals(2, unit.map.size());
    }
}