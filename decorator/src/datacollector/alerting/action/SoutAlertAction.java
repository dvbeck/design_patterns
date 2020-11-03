package datacollector.alerting.action;

public class SoutAlertAction implements AlertAction {
    @Override
    public void perform(String data) {
        System.out.println("SOUT: " + data);
    }
}
