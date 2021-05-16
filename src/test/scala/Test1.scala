import org.junit.Test
import org.junit.Assert.*

class DSLinkedListTests:
  @Test def testInsert(): Unit = {
    val list = DSLinkedList[Int]()
    list.insert(0)
    list.insert(1)
    list.insert(2)

    assertEquals("0 1 2", list.toString())
  }
