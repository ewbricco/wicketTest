/**
 * Created by ebricco on 2/7/17.
 */
import main.java.Page;
import org.apache.wicket.protocol.http.WebApplication;
public class Application extends WebApplication{
    public Application(){

    }

    @Override
    public Class getHomePage() {
        return Page.class;
    }
}