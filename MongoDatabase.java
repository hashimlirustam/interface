public class MongoDatabase implements IDatabase {


        public void add(){
            System.out.println("MongoDB add...");
        }

        @Override
        public void delete() {
            System.out.println("MongoDB deleting...");
        }

        @Override
        public void get() {
            System.out.println("MongoDB getting...");
        }

        @Override
        public void update() {
            System.out.println("MongoDB updating...");
        }
    }


