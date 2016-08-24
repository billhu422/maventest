import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.assertEquals;
/** 
* HelloWorld Tester. 
* 
* @author <Authors name> 
* @since <pre>ÎåÔÂ 3, 2016</pre> 
* @version 1.0 
*/ 
public class HelloWorldTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String args[]) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here...
    HelloWorld hello = new HelloWorld();
    String re = hello.hello("123");
    assertEquals("123",re);
} 


} 
