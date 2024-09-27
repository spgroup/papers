# Experiment Results Repository

This repository contains a series of files related to the experiment results, which is a study of rain cloud analysis and experimentation. The files are organized as follows:

## Folders and Files

### `conflictsLogs`

This folder contains conflict logs generated during the project's execution. They are used to store the conflict logs detected by the approach.

### `execution-1` to `execution-10`

Each of these folders contains the results of the 10 different executions of the experiment. Each execution may contain log files, outputs, or specific results from that run.

In each execution, the following files provide important information and results for the project:

### `conflicts_log.txt`

This text file contains logs related to conflicts detected during the execution of the project. It can help identify and understand any conflicts that occurred during the run.

### `confusion_matrix.jpg`

This JPEG image file displays a confusion matrix.

### `outConsole.txt`

This text file contains console output from the execution. It may include logs, messages, or debugging information generated during the project's run.

### `results.pdf`

This PDF file likely contains detailed results or analysis of the confusion matrix. It may include metrics, statistics, or visual representations of the performance evaluation, such as accuracy, precision, recall, and F1 score.

### `soot-results.csv`

It contains the results of the execution returned by each analysis in each scenario, either as TRUE or FALSE.

### `time.txt`

This text file records the time duration of the execution. 

### `visited_methods.txt`

This text file lists the methods or functions that were accessed or utilized during the execution.


### Outside of the 'execution' folders, there are additional files, as follows:

### `sheets/`

It contains spreadsheets with the time for each execution with mean, median and stardard deviation.

### `times/`

In this folder, you will find files related to the runtime of different parts of the experiment. They are essential for evaluating the project's performance and efficiency. It contains spreadsheets with the time for each scenary.

### `visitedMethods/`

This folder may contain information about the methods visited during the project's execution. It is useful for tracking and analysis purposes.

### `diff_files.pdf`

It generates a PDF with the differences, if they exist, for each execution.

### `rain_cloud_analysis_and_configuration_time.jpg` and `rain_cloud_analysis_and_configuration_time.pdf`

It contains a rain cloud-type chart with the execution and configuration time for each execution.

### `rain_cloud_analysis_time.jpg` and `rain_cloud_analysis_time.pdf`

It contains a rain cloud-type chart with only the execution time and without configuration for each execution.

### `rain_cloud_experiment_time.jpg` and `rain_cloud_experiment_time.pdf`

It contains a rain cloud-type chart with an overall view of the experiment, including the mean, median, and standard deviation.

### `rain_cloud_scenarios_time.jpg` and `rain_cloud_scenarios_time.pdf`

It contains a rain cloud-type chart with only the execution time and without configuration for each scenario.

### `results_by_scenario_all_execution.csv`

This CSV file contains consolidated results from all executions, organized by rain cloud scenario. It is useful for data analysis and result comparison.
