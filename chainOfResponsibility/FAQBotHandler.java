class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            Logger.log("[FAQBot] Handled password_reset")
        } else if (nextHandler != null) {
            Logger.log("[FAQBot] Passing " + issue + " to next handler")
            nextHandler.handle(issue)
        } else {
            Logger.log("[FAQBot] Cannot handle " + issue + " — escalate manually")
        }
    }
}