package com.data;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

     @Test
    public void shouldAnswerWithFalse()
    {
        assertTrue( false );
    }

App app;
	
	@Before
	public void init() {
		App app=new App();
	}

    @Test
    public void additionTrue()
    {
         int ans= app.addNumbers(12,12 );
         assertEquals(24, ans);
    }
    
}
