package datacollector.alerting.action;

public class EmailAlertAction implements AlertAction {
    @Override
    public void perform(String data) {
        System.out.println("E-MAIL: " + data);
    }
}
