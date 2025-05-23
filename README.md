This project demonstrates two classic Behavioral Design Patterns in Java:

<br>
1. Chain of Responsibility — for tech support issue handling.
<br>
2. Command Pattern — for a smart home remote control system.
<br>

TechSupportApp.java = Main
SmartHomeApp.java = Main

## How It Works

---

## Part 1: Chain of Responsibility — *Tech Support Request Handler*

### Concept:
A request is passed along a chain of handlers. Each handler decides either:
- To process the request  
- Or to pass it to the next handler  

If no handler can deal with the request, it’s escalated manually.

### Chain:
- `FAQBotHandler`
- `JuniorSupportHandler`
- `SeniorSupportHandler`

### Example:
Issues:
```java
{"password_reset", "refund_request", "account_ban", "unknown_bug"}

How It Runs:
TechSupportApp.java sets up the chain.

Issues are sent one by one to the first handler.

Each handler checks if it can handle the issue:

If yes → it handles it.

If not → forwards to the next handler.

If no handler can handle it, a message is logged to escalate manually.

examplu output

[FAQBot] Handled password_reset
[FAQBot] Passing refund_request to next handler
[JuniorSupport] Handled refund_request
[FAQBot] Passing account_ban to next handler
[JuniorSupport] Passing account_ban to next handler
[SeniorSupport] Handled account_ban
[FAQBot] Passing unknown_bug to next handler
[JuniorSupport] Passing unknown_bug to next handler
[SeniorSupport] Cannot handle unknown_bug — escalate manually

# Part 2

Part 2: Command Pattern — Smart Home Remote Control
 Concept:
Encapsulate a request as an object, allowing you to parameterize devices and queue, log, or undo requests easily.

Components:
Command interface — execute() and undo() methods.

Concrete Commands — TurnOnLightCommand, SetThermostatCommand.

Receivers — Light, Thermostat.

Invoker — SmartHomeRemoteControl.

How It Runs:
SmartHomeApp.java initializes devices and command objects.

Commands are assigned to remote control slots.

The remote’s pressButton() triggers the command’s execute().

undoButton() reverses the last command using the command’s undo() method.

Output Example:

[Light] Turning ON
[Thermostat] Setting temperature to 22°C
Undo last command
[Thermostat] Reverting to previous temperature: 0°C
