package lldprac.structuralDesPat.decorator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/*
public class DatasourceTest {
    @Test
    void testRead(){
        Datasource db=new FileDatasource();
        assertEquals("Base", db.read(), "If read is called Base should be returned");
    }

    @Test
    void testEncryption(){
        Datasource db=new FileDatasource();
        //EncryptionDecorator extends BaseDecorator which in turn implements DataSource. Therefore, we can write below:
        Datasource encryptedDb=new EncryptionDecorator(db);
//        assertEquals("Base - decrypted",encryptedDb.read(),
//                "If read is called, Decrypted should be returned");
//        assertEquals("Base - Decrypted",encryptedDb.read(),
//                "If read is called, Decrypted should be returned");
        System.out.println(encryptedDb.read());
    }
}


*/
public class DatasourceTest {

        Datasource dataSource = null;

        @BeforeEach
        public void setUp() {
            dataSource = new FileDatasource();
        }

        @Test
        public void testBaseDataSource() {
            String value = dataSource.read();
            assertEquals("Base", value, "If base data source is used, it should return Base");
        }

        @Test
        public void testCompressionDecorator() {
            Datasource compressedDataSource = new CompressionDecorator(dataSource);
            assertEquals("Base - Decompressed",
                    compressedDataSource.read(), "If compressed data source is used, it should return Decompress");

        }

        @Test
        public void testEncryptionDecorator() {
            Datasource encryptedDataSource = new EncryptionDecorator(dataSource);
            assertEquals("Base - Decrypted",
                    encryptedDataSource.read(), "If encrypted data source is used, it should return Encrypted");
        }

        @Test
        public void testCompressionAndEncryptionDecorator() {
            Datasource compressedDataSource = new CompressionDecorator(dataSource);
            Datasource encryptedDataSource = new EncryptionDecorator(compressedDataSource);
            assertEquals(
                    "Base - Decompressed - Decrypted", encryptedDataSource.read(), "If compressed and encrypted data source is used, it should return Encrypted - Decompress");
        }
}
