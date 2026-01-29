/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package social_media;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class messageTest {
    
    public messageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selectionPage method, of class message.
     */
    @Test
    public void testSelectionPage() {
        System.out.println("selectionPage");
        message.selectionPage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateUserID method, of class message.
     */
    @Test
    public void testGenerateUserID() {
        System.out.println("generateUserID");
        int expResult = 0;
        int result = message.generateUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageLength method, of class message.
     */
    @Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        String message = "";
        String expResult = "";
//        String result = message.checkMessageLength(message);
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessage method, of class message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        String message = "";
        String expResult = "";
//        String result = message.sentMessage(message);
   //     assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageID method, of class message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        String messageID = "";
        boolean expResult = false;
        boolean result = message.checkMessageID(messageID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessage method, of class message.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
//        String message = "";
    //    String expResult = "";
       // String result = message.printMessage(message);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
      //  String message = "";
       // message.storeMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = message.returnTotalMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMesageHash method, of class message.
     */
    @Test
    public void testCreateMesageHash() {
        System.out.println("createMesageHash");
        String messageID = "";
        int numMesssages = 0;
        String sentence = "";
        String expResult = "";
        String result = message.createMesageHash(messageID, numMesssages, sentence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cellphone = "";
        int expResult = 0;
        int result = message.checkRecipientCell(cellphone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendPage method, of class message.
     */
    @Test
    public void testSendPage() {
        System.out.println("sendPage");
        message.sendPage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
