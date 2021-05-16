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

  @Test def testRemoveSingleWithNoItems(): Unit = {
    val list = DSLinkedList[Int]()

    list.remove(1)

    assertEquals("", list.toString())
  }

  @Test def testRemoveSingleWithTwoItems():Unit = {
    val list = DSLinkedList[Int]()
    list.insert(0)
    list.insert(1)

    list.remove(1)
    assertEquals("0", list.toString())
  }

  @Test def testRemoveSingleWithOneItem(): Unit = {
    val list = DSLinkedList[Int]()

    list.insert(0)
    list.remove(0)

    assertEquals("", list.toString())
  }
  @Test def testRemoveSingleWithThreeItems(): Unit = {
    val list = DSLinkedList[Int]()
    list.insert(0)
    list.insert(1)
    list.insert(2)
    list.remove(1)

    assertEquals("0 2", list.toString())
  }

  @Test def testRemoveDoubleWithThreeItems(): Unit = {
    val list = DSLinkedList[Int]()
    list.insert(0)
    list.insert(0)
    list.insert(1)

    list.remove(0)

    assertEquals("1", list.toString())
  }
