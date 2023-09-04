package squareonex.mypetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import squareonex.mypetclinic.model.Owner;

class OwnerServiceImplTest extends AbstractMapServiceTest<Owner, Long>{
    @Override
    @BeforeEach
    void setUp() {
        super.setUp();
        this.unit = new OwnerServiceImpl();
    }
}