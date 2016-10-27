package players;

/**
 *
 * @author Zsolt
 */
public class RealPlayer extends Player{

    public RealPlayer(String name, Long token) {
        super(name, token);
    }

    @Override
    public Decision raise() {
//        TODO implement method
        return null;
    }

    @Override
    public Decision thorwIn() {
        return super.thorwIn();
    }

    @Override
    public Decision pass() {
        return super.pass();
    }

    @Override
    public Decision call() {
        return super.call();
    }

    @Override
    public Decision turn() {
//        TODO implement method
        return null;
    }
    
    @Override
    public Decision raiseTurn() {
//        TODO implement method
        return null;
    }

}
