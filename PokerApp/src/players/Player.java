package players;

import com.sun.istack.internal.NotNull;
import enums.ActivityType;

/**
 *
 * @author Zsolt
 */
public abstract class Player {
    
    protected String name;
    protected Long token;
    
    public Player(String name, Long token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }
    
    public abstract Decision turn();
    public abstract Decision raiseTurn();
    public abstract Decision raise();
    
    public Decision thorwIn() {
        Decision decision = new Decision();
        decision.setType(ActivityType.THROW_IN);
        return decision;
    }
    
    public Decision pass() {
        Decision decision = new Decision();
        decision.setType(ActivityType.PASS);
        return decision;
    }
    
    public Decision call() {
        Decision decision = new Decision();
        decision.setType(ActivityType.CALL);
        return decision;
    }
    
}
