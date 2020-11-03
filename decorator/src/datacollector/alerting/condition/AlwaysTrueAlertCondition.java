package datacollector.alerting.condition;

public class AlwaysTrueAlertCondition implements AlertCondition {

    @Override
    public boolean evaluate(String data) {
        return true;
    }
}
