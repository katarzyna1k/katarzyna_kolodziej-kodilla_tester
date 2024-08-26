package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }

    @Test
    public void testExpectedFreeStorage(){
        Assertions.assertEquals(0.0,myPhone.getFreeStorage());
        Mockito.when(myPhone.getFreeStorage()).thenReturn(10.3);
        Assertions.assertEquals(10.3,myPhone.getFreeStorage());
    }

    @Test
    public void shouldCallLaunchApplication(){
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }
}