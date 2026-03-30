abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void DeviceInfo()
    {
        System.out.println("It is a Device");
    }
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light On");
    }
    @Override
    void turnOff(){
        System.out.println("Light Off");
    }
}
interface Remote{
    void change();
}
class TV implements Remote{
    public void change(){
        System.out.printl("change channel");
    }
}
public class Interface{
    SmartDevice device=new Light();
    device.turnOn();


}
void main()
{
    SmartDevice device=new Light();
    device.turnOn();
}
