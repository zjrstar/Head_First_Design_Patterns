package headfirst.designpatterns.state.gumballstate;

/**
 * Created by Jerry on 3/14/16.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
