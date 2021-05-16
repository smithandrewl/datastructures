class DSLinkedList[T]:
  class Node[T](var data: T, var next: Node[T])

  var head: Node[T] = null


  private def last(): Node[T] =
    var current: Node[T] = head

    while current.next != null do
      current = current.next

    current

  def insert(data: T) =
    if head == null then
      head = Node(data, null)
    else
      var last: Node[T] = this.last()

      last.next = Node(data, null)

  override def toString: String =
    var out: Seq[String] = Seq()

    var current: Node[T] = head

    while current != null do
      out = out :+ current.data.toString
      current = current.next

    out.mkString(" ")

