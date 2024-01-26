package ru.netology;


import org.junit.Test;
import ru.netology.service.CashBackHackService;

import static org.junit.Assert.assertEquals;


public class TestCashBackHackService {
    @Test
    public void upperLimit() {
        CashBackHackService cashBack = new CashBackHackService();

        int actual = cashBack.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void beyondUpperLimit() {
        CashBackHackService cashBack = new CashBackHackService();

        int actual = cashBack.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void bottomLine() {
        CashBackHackService cashBack = new CashBackHackService();

        int actual = cashBack.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void ifNeedZeroAmount() {
        CashBackHackService cashBack = new CashBackHackService();

        int actual = cashBack.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void ifNeedFullAmount() {
        CashBackHackService cashBack = new CashBackHackService();

        int actual = cashBack.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}