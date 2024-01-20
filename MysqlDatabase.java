public class MysqlDatabase implements IDatabase{

    public void add(){
        System.out.println("MySQL add...");
    }

    @Override
    public void delete() {
        System.out.println("MySQL deleting...");
    }

    @Override
    public void get() {
        System.out.println("MySQL getting...");
    }

    @Override
    public void update() {
        System.out.println("MySQL updating...");
    }
}
