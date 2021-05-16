import scala.annotation.tailrec

class DSLinkedList[T]:
  class Node[T](var data: T, var next: Node[T])

  var head: Node[T] = null

  private def last(): Node[T] =
    @tailrec
    def inner(current: Node[T]): Node[T] =
      if current.next == null then
        current
      else
        inner(current.next)

    inner(head)

  def insert(data: T) =
    if head == null then
      head = Node(data, null)
    else
      this.last().next = Node(data, null)

  override def toString: String =
    var out: Seq[String] = Seq()

    var current: Node[T] = head

    while current != null do
      out = out :+ current.data.toString
      current = current.next

    out.mkString(" ")

