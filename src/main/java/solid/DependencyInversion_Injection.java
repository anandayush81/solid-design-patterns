package solid;

/*
class GlidingBehavior{
    public void fly(){
        System.out.print("I can glide while flying");
    }
}

class SlowFlyingBehavior {
    public void fly(){
        System.out.println("I can fly slow");
    }
}
class FastFlyingBehavior {
    public void fly(){
        System.out.println("I can fly fast");
    }
}

class Eagle{
    private GlidingBehavior behavior;
    //Here in Eagle class we have introduced tight coupling, wherein the only way for eagle to fly has become
    // gliding. But suppose Eagle could Glide as well as fast fly or fast slow, depending on type of eagle
    //Then this would not work. We need to have loose coupling, so that flying behaviour can be modified at run time
    //To achieve that we create a parent interface of all flying ways, and have concrete class for
    //gliding, fast fly and slow fly.
    public Eagle(GlidingBehavior behavior){
        this.behavior=behavior;
    }
    public void goFly(){
        behavior.fly();
    }
    public void setFlyingBehavior(GlidingBehavior newFlyingBehavior){
        this.behavior=newFlyingBehavior;
    }
}


public class DependencyInversion_Injection {
    public static void main(String[] args) {

        GlidingBehavior g=new GlidingBehavior();
        Eagle e=new Eagle(g);
        e.goFly();

        FastFlyingBehavior f=new FastFlyingBehavior();
        e.setFlyingBehavior(f);
        e.goFly();

        SlowFlyingBehavior s=new SlowFlyingBehavior();
        e.setFlyingBehavior(s);
        e.goFly();
    }
}

*/







interface FlyingBehavior{
    public void fly();
}

class GlidingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.println("I can glide while flying");
    }
}

class SlowFlyingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.println("I can fly slow");
    }
}


class FastFlyingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.println("I can fly fast");
    }
}



class Eagle{
    private FlyingBehavior behavior;
    //We've solved the above code's problem using a new interface, whose dependency we've added here.
    //Now we can have multiple flying ways for eagle
    //Also high level module is dependent on high level module
    public Eagle(FlyingBehavior behavior){
        this.behavior=behavior;
    }
    public void goFly(){
        behavior.fly();
    }
    public void setFlyingBehavior(FlyingBehavior newFlyingBehavior){
        this.behavior=newFlyingBehavior;
    }
}

class Sparrow{
    private FlyingBehavior behavior;
    public Sparrow(FlyingBehavior behavior){
        this.behavior=behavior;
    }
    public void goFly(){
        this.behavior.fly();
    }
    public void setFlyingBehavior(FlyingBehavior newFlyingBehavior){
        this.behavior=newFlyingBehavior;
    }
}


public class DependencyInversion_Injection {
    public static void main(String[] args) {

        FlyingBehavior f=new FastFlyingBehavior();
        Eagle e=new Eagle(f);
        e.goFly();

        FlyingBehavior s=new SlowFlyingBehavior();
        e.setFlyingBehavior(s);
        e.goFly();

        FlyingBehavior g=new GlidingBehavior();
        e.setFlyingBehavior(g);
        e.goFly();

        FlyingBehavior fast=new FastFlyingBehavior();
        Sparrow sp=new Sparrow(fast);
        sp.goFly();

        FlyingBehavior slow=new SlowFlyingBehavior();
        sp.setFlyingBehavior(slow);
        sp.goFly();

    }
}








//Output:
//
//        I can fly slow
//        I can fly fast
//        I can glide while flying

//No similar but different terms.
//Dependency Injection is like in constructor you get the Dependency and assign it to the reference.
//Say your eagle class requires a flying behavior type object to be initialised, in that you can pass any kind of flying behavior
//let it be gliding or fast or slow or whatsoever.



