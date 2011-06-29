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
  public void testEnqueue() {
    System.out.println("enqueue");
    Object item = null;
    Queue instance = new Queue();
    instance.enqueue(item);

    
    fail("The test case is a prototype.");
  }

  /**
   * Test of dequeue method, of class Queue.
   */
  @Test
  public void testDequeue() {
    System.out.println("dequeue");
    Queue instance = new Queue();
    Object expResult = null;
    Object result = instance.dequeue();
    assertEquals(expResult, result);

    fail("The test case is a prototype.");
  }
}
