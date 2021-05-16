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
    @tailrec
    def inner(current: Node[T], acc: Seq[String]):Seq[String] =
      if current == null then
        acc
      else
        inner(current.next, acc :+ current.data.toString)

    inner(head, Seq()).mkString(" ")

