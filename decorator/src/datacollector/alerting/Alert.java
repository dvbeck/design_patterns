package datacollector.alerting;

import datacollector.alerting.action.AlertAction;
import datacollector.alerting.condition.AlertCondition;
import datacollector.processing.DataProcessor;
import datacollector.processing.LifoDataProcessorDecorator;

public class Alert extends LifoDataProcessorDecorator {
    AlertCondition alertCondition;
    AlertAction alertAction;

    public Alert(DataProcessor dataProcessor, AlertCondition alertCondition, AlertAction alertAction) {
        super(dataProcessor);
        this.alertCondition = alertCondition;
        this.alertAction = alertAction;
    }

    @Override
    public void processConcreteTask(String data) {
        if(alertCondition.evaluate(data)) {
            alertAction.perform(data);
        }
    }
}
