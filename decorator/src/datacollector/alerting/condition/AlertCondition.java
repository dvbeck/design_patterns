package datacollector.alerting.condition;

public interface AlertCondition {
    boolean evaluate(String data);
}
