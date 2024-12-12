```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass {
  implicit val ec: ExecutionContext = scala.concurrent.ExecutionContext.global

  def myMethod(i: Int): Future[Int] = Future {
    if (i == 0) throw new Exception("Zero is not allowed")
    i * 2
  }

  def anotherMethod(i: Int): Future[Int] = myMethod(i).map(_ + 10)
}
```