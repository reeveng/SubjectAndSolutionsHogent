package testen;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({testen.MyListIterableTest.class, testen.TestStackGeneriekString.class, 
    testen.TestStackGeneriek.class,
    testen.TestQueueGeneriek.class, testen.TestMyListGeneriek.class})
public class TestAlles {
    
}
