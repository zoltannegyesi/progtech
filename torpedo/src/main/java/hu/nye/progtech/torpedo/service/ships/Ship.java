package hu.nye.progtech.torpedo.service.ships;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface Ship {

    void useShip();

    int getSize();

    String getName();

    boolean isUsed();

}
