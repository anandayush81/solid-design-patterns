package lldprac.prototype;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class BackgroundObject implements GraphicalObject{
    private Double x,y, width,height;
    private BackgroundType type;

    @Getter(AccessLevel.NONE) // Hide field from getter (Do not create a Getter for this pixels List)
    @Setter(AccessLevel.NONE) // Hide field from setter (Do not create a Setter for this pixels List)
    private List<Integer> pixels = new ArrayList<>();

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = generatePixels();
    }

    private BackgroundObject(BackgroundObject obj) { //Copy ctor to copy subsequent objects
        this.x = obj.x;
        this.y = obj.y;
        this.width = obj.width;
        this.height = obj.height;
        this.type = obj.type;
        this.pixels = obj.generatePixels(); //Making Shallow copy here. Don't call generatePixel() for each object
    }

    private List<Integer> generatePixels() { //This method will be and should be called only once.
        //Bcoz this method will ideally take a lot of resources and once called, subsequent objects will just copy values
        //from existing objects and not generate pixels for every individual object
        return Collections.emptyList();
    }

    //Step2 implement cloneable interface
    @Override
    public BackgroundObject cloneObject() { //Notice wile overriding we're not returning the type
        // that was mentioned in interface. We're basically doing subtyping
        return new BackgroundObject(this); //Calling a copy constructor, so we can simply copy subsequent objects
        // and not create new objects from scratch
    }
}
