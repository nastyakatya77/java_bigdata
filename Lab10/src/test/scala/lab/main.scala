package lab

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object main_lab
{
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("main_lab").setMaster("local[*]")
    val sc = new SparkContext(conf);
    val spark = SparkSession.builder.appName("Test app").getOrCreate()
    val datafile = spark.read
      .format("com.databricks.spark.csv")
      .option("header",true)
      .load("c:/Projects/Java_N/java_bigdata/Lab10/AnimalBites.csv")
    //datafile.show()
    datafile.createOrReplaceTempView("bites")

    spark.sql("SELECT count(SpeciesIDDesc) as amount, SpeciesIDDesc FROM bites GROUP BY SpeciesIDDesc ORDER BY amount").show()
    spark.sql("SELECT count(GenderIDDesc), GenderIDDesc FROM bites GROUP BY GenderIDDesc ORDER BY GenderIDDesc").show()

    spark.stop()
  }
}