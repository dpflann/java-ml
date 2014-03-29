import java.io.BufferedReader;
import java.io.FileReader;

import weka.core.converters.ArffLoader.ArffReader;
import weka.core.Instances;

public class DataReader {
  public static void main(String[] args) {
    String path = args[0];
    System.out.println(path);
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      ArffReader arff = new ArffReader(reader);
      Instances data = arff.getData();
      data.setClassIndex(data.numAttributes() - 1);
      System.out.println(data.instance(0).toString());
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}