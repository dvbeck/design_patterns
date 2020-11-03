package datacollector.collector;

import datacollector.datasource.DataSource;
import datacollector.processing.DataProcessor;

public class Collector {
    DataSource dataSource;
    DataProcessor dataProcessor;

    public Collector(DataSource dataSource, DataProcessor dataProcessor) {
        this.dataSource = dataSource;
        this.dataProcessor = dataProcessor;
    }

    public void collect() throws InterruptedException {
        while(true) {
            String data = dataSource.collect();
            dataProcessor.process(data);
            Thread.sleep(1000L);
        }
    }

    public void setDataProcessor(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }
}
