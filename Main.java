class DatabaseManager {
    public void addDatabase(IDatabase database) {
        database.add();
    }

    public void deleteDatabase(IDatabase database) {
        database.delete();
    }

    public void getDatabase(IDatabase database) {
        database.get();
    }

    public void updateDatabase(IDatabase database) {
        database.update();
    }

}

public class Main {
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        manager.addDatabase(new MongoDatabase());
        manager.addDatabase(new MysqlDatabase());
        manager.updateDatabase(new MysqlDatabase());
        manager.updateDatabase(new MongoDatabase());
        manager.getDatabase(new MysqlDatabase());
        manager.getDatabase(new MongoDatabase());
        // ** eger yeni bir database ile islemek lazim gelerse,her bir kodu yeniden yazmaga ehtiyac qalmir,sadece yeni istifade olunacaq databasein classini yaradib burada istifade edirik..
    }
}