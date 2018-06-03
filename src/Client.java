import Factory.Composite;

/**
 * Created by User on 03.06.2018.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Composite compositeBfs = new Composite(true);
            compositeBfs.Find();
            Composite compositeDfs = new Composite(false);
            compositeDfs.Find();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
