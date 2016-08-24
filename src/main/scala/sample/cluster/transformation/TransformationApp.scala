package sample.cluster.transformation

object TransformationApp {

  def main(args: Array[String]): Unit = {
    // starting 2 frontend nodes and 3 backend nodes
    TransformationFrontend.main(Array.empty)
    TransformationBackend.main(Array.empty)
    TransformationBackend.main(Array.empty)
    TransformationBackend.main(Array.empty)
    TransformationFrontend.main(Array.empty)
  }

}