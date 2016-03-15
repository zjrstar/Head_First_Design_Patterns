package headfirst.designpatterns.state.gumballstatewinner;

/**
 * Created by Jerry on 3/14/16.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
