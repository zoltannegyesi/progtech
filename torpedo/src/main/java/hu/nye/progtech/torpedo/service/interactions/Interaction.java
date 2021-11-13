package hu.nye.progtech.torpedo.service.interactions;

public interface Interaction {

    void process(String in);

    boolean isEqualToCommand(String in);
}
