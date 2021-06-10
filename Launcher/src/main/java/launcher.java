import jdk.dynalink.linker.support.Lookup;
import org.emp.gl.guigamer.guigamerserviceimpl;

import java.util.Observer;


public class launcher {
    static {
        Lookup.getInstance().register(guigamerservicr.class,new guigamerserviceimpl());


    }

    public  static void main(String[] args) {


        Observer o;
        r = Lookup.getInstance().getService(guigamerservicr.class)
        o.addlistner(r);
        o.notify();

    }

}
