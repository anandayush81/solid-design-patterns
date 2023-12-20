package lldprac.creational.singleton;


import lldprac.singleton.ConnectionPool;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnectionPoolTest {
//    @Test
//    public void testConstructor(){
//        ConnectionPool cp=new ConnectionPool();
//        assertNotNull(cp);
//    }
    /*public void testStaticInit(){
        ConnectionPool cp=ConnectionPool.getInstance();
        assertNotNull(cp);
//        assert(cp==null);
    }*/
    @Test
    public void testSingleInstance(){

        ConnectionPool cp1= ConnectionPool.getInstance();
        ConnectionPool cp2= ConnectionPool.getInstance();
//        assert(cp1==null);
        assertNotNull(cp1);
        assertNotNull(cp2);
        assert(cp1==cp2);
//        assert(cp1!=cp2);//If condition inside assert is true then do nothing, if false, throw error

    }

}
