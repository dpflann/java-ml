java-ml
=======

##**About**
This a collaborative project to learn Java and Machine Learning.                          
The project uses ant to manage Java object compilation and execution of the main program. 

##**Running the Program**
###ant
The program can be run using the ant target 'run' and accepts a command-line parameter for an ARRF dataset to read.
Datasets are currently located in the _/lib/regression-datasets_ directory. 

Execute the build file in the root directory like so:
```
> ant run -Darff=./lib/regression-datasets/<DATASET>.arff                                   
```
###bash
There is also an intertactive bash script for selecting which ARFF file to use. Upon selection of a valid option, the filename is passed to ant (executing the ant command list above). 

Execute the script in root directory like so:    
```
> ./analyze                                                                                 
```
Preview of interactive script:
```
Please select the dataset you wish to use (or exit):
1) auto_price.arff
2) stock.arff
3) exit
Selection #: 1
Selected: auto_price.arff 
```
