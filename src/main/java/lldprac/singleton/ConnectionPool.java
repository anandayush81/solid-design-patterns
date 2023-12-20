package lldprac.singleton;

import lombok.AllArgsConstructor;

//@AllArgsConstructor // Can't add this bcoz we need private constructor

/*public class ConnectionPool {
    private ConnectionPool(){
    }
    }
}*/

/*public class ConnectionPool {
    //step -1 (make ctor private / hide ctor)
    private ConnectionPool(){
    }
    //step-2 (implement static initializer to creat object)
    public static ConnectionPool getInstance(){
        return new ConnectionPool();
    }
}*/

//Non Thread Safe Version
/*public class ConnectionPool {
    //step- 4: add a static attribute of this class
    //this is static bcoz we need to access it from the static method getInstance and static method can only access static attribute
    private static ConnectionPool instance=null;
    //step -1 (make ctor private / hide ctor)
    private ConnectionPool(){
    }
    //step-2 (implement static initializer to create object)
    public static ConnectionPool getInstance(){
        if(instance ==null)
            instance = new ConnectionPool(); //critical section
        return instance;
    }
}*/

/*//Thread Safe Version v1
public class ConnectionPool {
    //step- 4: add a static attribute of this class
    //this is static bcoz we need to access it from the static method getInstance and static method can only access static attribute
    //Also private so that cannot be used outside class
    private static ConnectionPool instance=null;
    //step -1 (make ctor private / hide ctor)
    private ConnectionPool(){
    }
    //step-2 (implement static initializer to create object)
    public synchronized static ConnectionPool getInstance(){
        //making this method synchronized solves the thread safety problem but it becomes slow since the entire method is made synchronized.
        //so only one thread will be able to enter this method.
        //Also, even if the object (instance) is created, and we don't need thread safety, still it'll be slow. Even already created instance will take time.
        if(instance ==null)
            instance = new ConnectionPool();
        return instance;
    }
}*/


/*//Thread Safe Version v2
public class ConnectionPool {

    private static ConnectionPool instance=null;
    private ConnectionPool(){
    }
    public static ConnectionPool getInstance(){
//        synchronized(instance)
        // can't use instance as monitor bcoz it's initialized to "null"
        //So we need to take a diff monitor. we can take ConnectionPool.class
        synchronized(ConnectionPool.class)
        { //This doses not work because there is no double check locking and multiple objects will be able to be created.
            if(instance ==null)
                instance = new ConnectionPool();
            return instance;
        }

    }
}*/

//Thread Safe Version v3 (WIth double check locking)  AND Lazy Initialization
public class ConnectionPool {

    private static ConnectionPool instance=null;
    private ConnectionPool(){
    }
    public static ConnectionPool getInstance(){ //Lazy Initialization
        if(instance==null){
            synchronized(ConnectionPool.class)
            {
                if(instance ==null)
                    instance = new ConnectionPool();

            }
        }
        return instance;


    }
}

//Eager Initialization
/*
public class ConnectionPool {

    private static ConnectionPool instance=new ConnectionPool(); //Happens during class loading
    private ConnectionPool(){
    }
    public static ConnectionPool getInstance(){ //Lazy Initialization
        return instance;
    }
}*/
