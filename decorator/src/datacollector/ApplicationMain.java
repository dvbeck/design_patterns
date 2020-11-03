package datacollector;

import datacollector.alerting.Alert;
import datacollector.alerting.action.EmailAlertAction;
import datacollector.alerting.action.SmsAlertAction;
import datacollector.alerting.action.SoutAlertAction;
import datacollector.alerting.condition.AlwaysTrueAlertCondition;
import datacollector.collector.Collector;
import datacollector.datasource.RandomDataSource;
import datacollector.processing.DataProcessor;
import datacollector.storage.DataStorage;

public class ApplicationMain {
    public static void main(String[] args) {
        DataProcessor lifoProcessingStack;

        lifoProcessingStack = new DataStorage();
        lifoProcessingStack = new Alert(lifoProcessingStack, new AlwaysTrueAlertCondition(), new SoutAlertAction());
        lifoProcessingStack = new Alert(lifoProcessingStack, new AlwaysTrueAlertCondition(), new EmailAlertAction());
        lifoProcessingStack = new Alert(lifoProcessingStack, new AlwaysTrueAlertCondition(), new SmsAlertAction());

        Collector collector = new Collector(new RandomDataSource(), lifoProcessingStack);

        try {
            collector.collect();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
