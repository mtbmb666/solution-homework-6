class Thermostat {
    private int temperature;
    private int previousTemperature;

    public void setTemperature(int temp) {
        previousTemperature = temperature
        temperature = temp
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C")
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature: " + previousTemperature + "°C")
        temperature = previousTemperature
    }
}