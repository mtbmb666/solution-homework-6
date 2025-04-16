class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            Logger.log("[SeniorSupport] Handled " + issue)
        } else {
            Logger.log("[SeniorSupport] Cannot handle " + issue + " — escalate manually")
        }
    }
}