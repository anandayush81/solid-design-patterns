package lldprac.creational.builder;

import lldprac.builder.Database;
import lldprac.builder.DatabaseType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseTest {
    @Test
    public void testDatabaseBuilder(){
        //Database d1=new Database(); //Can't call private ctor from diff class

//        Database.Builder builder=Database.builder(); //static initialiser. Using this, we don't need t call new Database()
        Database.Builder builder= new Database.Builder();//This also works to create a Builder class object

        //Here we've used fluent interface. We could have done normally as well
        //like builder.setName("Ayush"); builder.setUserName("anandayush81"); so on
        //Fluent interface helps us chain method calls and remove redundancy

        builder.setName("Ayush")
                .setUserName("anandayush81")
                .setPassword("Qwerty")
                .setPort(8080)
                .setCompressed(true)
                .setType(DatabaseType.MONGO);
        Database database=builder.build();

        /*Database database=Database.builder()
                .setUserName("anandayush81")
                .setPassword("Qwerty")
                .setPort(8080)
                .setCompressed(true)
                .setType(DatabaseType.MONGO)
                .build();*/

        /*System.out.println(database.name); // We can't access name as it's private attr
        database.setName("Tanmay") //This proves that object is immuatble as the Database cass does not have setters. */

        assertNotNull(database);
//        assert(database==null);

    }

}
