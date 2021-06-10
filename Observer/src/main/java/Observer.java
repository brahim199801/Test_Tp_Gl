import org.emp.gl.guigamer.guigamerservicr;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Observer extends TimerTask {
    int secondes;
    PropertyChangeSupport pcs =new PropertyChangeSupport(this);

    public Observer() {
        Timer timer = new Timer();
        LocalTime localTime = LocalTime.now();
        secondes = localTime.getSecond();

    }

    public void addlistner(guigamerservicr listner){

          pcs.addPropertyChangeListener(listner);

    }
    public void removelistner(guigamerservicr listner)
    {
        pcs.removePropertyChangeListener((PropertyChangeListener) listner);

    }
    public void notifylistner()
    {
        pcs.firePropertyChange(String.valueOf(this.secondes),null,null);
    }

    @Override
    public void run() {
        notifylistner();

    }
}
