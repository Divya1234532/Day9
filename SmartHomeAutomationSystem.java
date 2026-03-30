// Abstract Device
abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
}

// Devices
class Lights extends SmartDevice {
    void turnOn() {
        System.out.println("Lights ON");
    }

    void turnOff() {
        System.out.println("Lights OFF");
    }
}

class AC extends SmartDevice {
    void turnOn() {
        System.out.println("AC ON");
    }

    void turnOff() {
        System.out.println("AC OFF");
    }
}

// Trigger Interface
interface Trigger {
    boolean isTriggered();
}

// Example Trigger
class MotionTrigger implements Trigger {
    boolean motion;

    MotionTrigger(boolean motion) {
        this.motion = motion;
    }

    public boolean isTriggered() {
        return motion;
    }
}

// Action Interface
interface Action {
    void execute();
}

// Turn ON Action
class TurnOnAction implements Action {
    SmartDevice device;

    TurnOnAction(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}

// Rule Class
class Rule {
    Trigger trigger;
    Action action;

    Rule(Trigger trigger, Action action) {
        this.trigger = trigger;
        this.action = action;
    }

    void apply() {
        if (trigger.isTriggered()) {
            action.execute();
        }
    }
}

// Main Class
public class SmartHomeAutomationSystem {
    public static void main(String[] args) {

        SmartDevice light = new Lights();

        Trigger motion = new MotionTrigger(true);

        Action turnOnLight = new TurnOnAction(light);

        Rule rule1 = new Rule(motion, turnOnLight);

        rule1.apply(); // Output: Lights ON
    }
}
