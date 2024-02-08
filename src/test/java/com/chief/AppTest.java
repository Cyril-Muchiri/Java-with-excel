package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AppTest {

    @Test
    boolean testConnection() {
        return true;
    }

    @Test
    void testAssert(){
        App appInstance=new App();
        assertEquals(22, appInstance.addNumbers(10, 12));
        assertTrue(appInstance.checkEmailValidity("Kimani@gmail.com"));
    }

}