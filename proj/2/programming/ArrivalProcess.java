import eduni.distributions.Negexp;

public class ArrivalProcess {

    private EventType type;
    private Negexp generator;

    public ArrivalProcess(EventType type, Negexp generator) {
        this.type = type;
        this.generator = generator;
    }

    public void generateEvent(EventList list) {
        Clock clock = Clock.getInstance();
        double interval = generator.sample();
        clock.advance(interval);
        list.add(new Event(type, clock.getTime()));
    }
}
