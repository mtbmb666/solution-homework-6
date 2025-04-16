public class SmartHomeApp {
    public static void main(String[] args) {
        Light livingRoomLight = new Light()
        Thermostat homeThermostat = new Thermostat()

        Command turnOnLight = new TurnOnLightCommand(livingRoomLight)
        Command setThermo22 = new SetThermostatCommand(homeThermostat, 22)

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl()

        remote.setCommand("A", turnOnLight)
        remote.setCommand("B", setThermo22)

        remote.pressButton("A")
        remote.pressButton("B")

        remote.undoButton()
    }
}
