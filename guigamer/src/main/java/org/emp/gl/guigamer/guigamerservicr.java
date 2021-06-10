package org.emp.gl.guigamer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public interface guigamerservicr extends PropertyChangeListener {
    @Override
    void propertyChange(PropertyChangeEvent evt);
}
