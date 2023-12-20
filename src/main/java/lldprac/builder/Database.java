package lldprac.builder;

public class Database {
    private String name, userName,password;
    private Integer port;
    private DatabaseType type;
    private Boolean isCompressed;
    private Database(){
    }
    //Trick 1: a static method in outer class to return object of builder class
    public static Builder builder(){
        return new Builder();
    }

    //step 1 create static inner class
    public static class Builder{ //Benefit of inner calss is that private memebers of outer class
        // can be accessed freely as evident from print() method below

        /*void print(){
            Database d1=new Database();
            System.out.println(d1.name +" "+ d1.port);
        }*/

        //step-2 copy all the fields of outer class to inner class
        private String name, userName,password;
        private Integer port;
        private DatabaseType type;
        private Boolean isCompressed;

        //step -3 create setters for these attributes

        /*public void setName(String name) {
            this.name = name;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public void setType(DatabaseType type) {
            this.type = type;
        }

        public void setCompressed(Boolean compressed) {
            isCompressed = compressed;
        }*/

        //Using Fluent Interfaces

        public Builder setName(String name) {
            this.name = name; return this;
        }
        public Builder setUserName(String userName) {
            this.userName = userName; return this;
        }
        public Builder setPassword(String password) {
            this.password = password; return this;
        }
        public Builder setPort(Integer port) {
            this.port = port; return this;
        }
        public Builder setType(DatabaseType type) {
            this.type = type; return this;
        }
        public Builder setCompressed(Boolean compressed) {
            isCompressed = compressed; return this;
        }
        // Step 5 - Add a validation method
        public Boolean isValid() {
            if (this.name == null) {
                return false;
            }
            return true;
        }
        //Creation of main object
        public Database build(){// called using builder object
            if (!isValid()){
                throw new IllegalArgumentException("Invalid database configuration");
            }
            Database database=new Database();
            database.name=name;
            database.userName=userName;
            database.password=password;
            database.type=type;
            database.port=port;
            database.isCompressed=isCompressed;
            return database;
        }
    }
}
