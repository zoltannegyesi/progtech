package hu.nye.progtech.torpedo.service.ships.impl;

import hu.nye.progtech.torpedo.service.ships.Ship;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Service
@Qualifier("Submarine")
public class Submarine implements Ship {
    private final String name = "Submarine";
    private final int size = 3;
    private boolean used = false;

    @Override
    public void useShip() {
        this.used = true;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isUsed() {
        return this.used;
    }
}

