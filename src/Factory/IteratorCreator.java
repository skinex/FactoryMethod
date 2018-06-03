package Factory;


/**
 * Created by User on 03.06.2018.
 */
public class IteratorCreator<T> {
    private Class<T> classOfT;

    public IteratorCreator(Class<T> classOfT) {
        this.classOfT = classOfT;
    }

    T Create() throws IllegalAccessException, InstantiationException {
        return classOfT.newInstance();
    }
}
