package homework1824.pattern1;

public class ChairFactory implements Chair {
    @Override
    public Vict createVict() {
        return new VictorianChair();
    }
    @Override
    public Mult createMult() {
        return new MultiFuncChair();
    }
    @Override
    public Mag createMag() {
        return new MagicChair();
    }
}