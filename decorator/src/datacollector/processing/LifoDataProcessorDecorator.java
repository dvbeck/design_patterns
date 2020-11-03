package datacollector.processing;

public abstract class LifoDataProcessorDecorator implements DataProcessor {
    protected DataProcessor dataProcessor;

    public LifoDataProcessorDecorator(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    /**
     * This method must be implemented by subclasses that want to decorate the DataProcessor.
     * @param data the data that will be processed.
     */
    protected abstract void processConcreteTask(String data);

    /**
     * This is actually a template method that makes sure to call the processConcreteTask method
     * of the subclass before calling the processing method of the upstream object. This gives it the
     * Last-in/First-out character.
     * @param data the data that must be processed as String.
     */
    @Override
    public void process(String data) {
        processConcreteTask(data);
        dataProcessor.process(data);
    }
}
