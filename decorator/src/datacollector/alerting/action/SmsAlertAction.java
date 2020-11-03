package datacollector.alerting.action;

public class SmsAlertAction implements AlertAction {
    @Override
    public void perform(String data) {
        System.out.println("SMS: " + data);
    }
}
