class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            Logger.log("[JuniorSupport] Handled " + issue)
        } else if (nextHandler != null) {
            Logger.log("[JuniorSupport] Passing " + issue + " to next handler")
            nextHandler.handle(issue)
        } else {
            Logger.log("[JuniorSupport] Cannot handle " + issue + " — escalate manually")
        }
    }
}