
@main def hello: Unit = {
  val list: DSLinkedList[Int] = DSLinkedList[Int]()

  list.insert(0)
  list.insert(1)
  list.insert(2)
  println(list)
}
