import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by kanghonggu on 2017. 3. 15..
 */
public abstract class AbstractTest implements InterfaceTest{
    @Override
    public void shouldNotOverride() {
        throw new NotImplementedException();
    }
}
