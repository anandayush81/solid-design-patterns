package lldprac.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackgroundObjectTest {
    @Test
    public void testClone(){
        // Step 4 - Create a prototype object
        //Create the main object(Prototype) + Create it's clone + Modify the clone
        BackgroundObject prototype = new BackgroundObject(10.0, 20.0, 100.0, 200.0, BackgroundType.TREE);
        BackgroundObject clone = prototype.cloneObject();
        assert(prototype !=clone);
        //Ideally, clone and prototype should be 2 different objects, but have the same values of attributes
        assertEquals(prototype.getType(), clone.getType(), "Values of both types should be same");
        //We can modify the clone and prototype both
        clone.setX(200.0);
        clone.setY(300.0);
        prototype.setX(200.0);
        prototype.setY(300.0);


    }

    @Test
    public void testCloneObjectWithRegistry() {

        // Initialise registry
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();

        // Step 4 - Create a prototype object
        BackgroundObject prototype = new BackgroundObject(100.0, 200.0, 100.0, 200.0, BackgroundType.TREE);
        registry.addPrototype(prototype);

        //Fetch Prototype
        BackgroundObject bobj=registry.getPrototype(prototype.getType());

        //If a particular type of clone is not present:
        BackgroundObject building=registry.getPrototype(BackgroundType.BUILDING);
        assertNull(building, "It's NULL if building prototype is not presemt in registry");


        //Create a clone using a prototype from registry
        BackgroundObject clone = registry.getPrototype(BackgroundType.TREE).cloneObject();



        assertNotNull(clone,  "If clone method is called, it should return a new object");
        assertEquals(prototype.getX(), clone.getX() , "If clone method is called, it should return same value for x" );

        clone.setX(200.0);
        clone.setY(300.0);
    }
}
