class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>()
    private Command lastCommand

    public void setCommand(String slot, Command command) {
        slots.put(slot, command)
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot)
        if (command != null) {
            command.execute()
            lastCommand = command
        } else {
            System.out.println("No command assigned to " + slot)
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            System.out.println("Undo last command")
            lastCommand.undo()
        } else {
            System.out.println("Nothing to undo.")
        }
    }
}