package stack.as.a.queue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patweb
 */
public class QueueTest {
  
  public QueueTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of enqueue method, of class Queue.
   */
  @Test
  public void testEnqueueDequeueOneItem() {
    System.out.println("enqueue one item");
    Queue instance = new Queue();
    Object item = "one";
    instance.enqueue(item);
    Object dequeuedItem = instance.dequeue();
    assertEquals("Should be one", item, dequeuedItem);
  }
  /**
   * Test of enqueue method, of class Queue.
   */
  @Test
  public void testEnqueueDequeueTwoItems() {
    System.out.println("enqueue two items");
    Object item1 = "one";
    Object item2 = "two";
    Queue instance = new Queue();
    instance.enqueue(item1);
    instance.enqueue(item2);
    Object dequeuedItem1 = instance.dequeue();
    Object dequeuedItem2 = instance.dequeue();
    assertEquals("Should be one", item1, dequeuedItem1);
    assertEquals("Should be two", item2, dequeuedItem2);
  }

  /**
   * Test of dequeue method, of class Queue.
   */
  @Test
  public void testDequeueEmpty() {
    System.out.println("dequeue");
    Queue instance = new Queue();
    instance.enqueue("dequeued");
    Object result = instance.dequeue();
    assertEquals("dequeued", result);
    Object nullResult = instance.dequeue();
    assertNull(nullResult);
  }
}
