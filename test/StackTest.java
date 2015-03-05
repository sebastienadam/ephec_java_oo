/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import E013_JeuDeNim.Stack;

/**
 *
 * @author Sébastien
 */
public class StackTest {
  Stack stack;
  
  public StackTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
    stack = new Stack(5);
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void popTest() {
    assertEquals(2, stack.pop(3));
    assertEquals(2, stack.getContent());
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void popTestTooHigh() {
    stack.pop(4);
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void popTestTooLow() {
    stack.pop(0);
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void popTestTooMoreThanContent() {
    stack.pop(3);
    stack.pop(3);
  }

  @Test
  public void isEmptyTest() {
    stack.pop(3);
    stack.pop(2);
    assertTrue(stack.isEmpty());
  }

  @Test
  public void isNotEmptyTest() {
    assertFalse(stack.isEmpty());
  }
}
