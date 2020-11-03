# Decorator Pattern Example (with template method)
This example contains a Collector that collects data from a given datasource and processes the data according to the given DataProcessor.

For the DataProcessor the Decorator pattern is used to allow multiple processors to process the same data. In this example, the data is processed by both alerting and data storage.

The Decorator pattern is enhanced with a template method.  