package lldprac.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {
    private Map<BackgroundType, BackgroundObject> registry = new HashMap<>();
    /*public void addPrototype(BackgroundType type, BackgroundObject obj){
        registry.put(type, obj);
    }*/
    public void addPrototype(BackgroundObject obj){
        registry.put(obj.getType(), obj);
    }
    public BackgroundObject getPrototype(BackgroundType type){
        return registry.get(type);

    }
    public void removePrortotype(BackgroundType type){
        registry.remove(type);

    }
}
