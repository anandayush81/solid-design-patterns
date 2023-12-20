package lldprac.creational.prototype;

//Step 1 : Create a cloneable interface
@FunctionalInterface
public interface GraphicalObject {
    GraphicalObject cloneObject();
    /*BackgroundObject cloneObject();*/
}
