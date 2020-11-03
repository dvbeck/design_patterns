package datacollector.storage;

import datacollector.processing.DataProcessor;

public class DataStorage implements DataProcessor {
    @Override
    public void process(String data) {
        System.out.println("STORAGE: " + data);
    }
}
