package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCashback1With999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackZeroWith1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback999With1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback1000With0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback999With1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackZeroWith2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback50With950() {
        CashbackHackService service = new CashbackHackService();

        int expected = 950;
        int actual = service.remain(50);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback445With555() {
        CashbackHackService service = new CashbackHackService();

        int expected = 445;
        int actual = service.remain(555);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashback1With1999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(actual, expected);
    }
}