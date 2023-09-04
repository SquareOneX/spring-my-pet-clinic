package squareonex.mypetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

abstract class AbstractMapServiceTest<T, ID> {
    protected AbstractMapService<T, ID> unit; //UnitUnderTest
    @Mock
    private T mockObject;
    @Mock
    private ID mockKey;
    @Captor
    private ArgumentCaptor<T> captor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAll() {
        //With empty map
        assertEquals(Set.of(), unit.findAll());

        //With filled map
        unit.map.put(mockKey, mockObject);
        assertEquals(Set.of(mockObject), unit.findAll());
    }

    @Test
    void findById() {
        fail();
//        assertNull(unit.findById(mockKey));
//
//        unit.map.put(mockKey, mockObject);
//        assertEquals(mockObject, unit.findById(mockKey));
    }

    @Test
    void save() {
        fail();
    }

    @Test
    void delete() {
        fail();
    }

    @Test
    void deleteById() {
        fail();
    }
}