package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback1With999Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashbackZeroWith1000Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback999With1001Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback1001Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback1000With0Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback999With1Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashbackZeroWith2000Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback50With950Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 950;
        int actual = service.remain(50);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback445With555Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 445;
        int actual = service.remain(555);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnCashback1With1999Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback1With999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashbackZeroWith1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback999With1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1001;
        int actual = service.remain(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback1000With0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback999With1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashbackZeroWith2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback50With950() {
        CashbackHackService service = new CashbackHackService();

        int expected = 950;
        int actual = service.remain(50);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback445With555() {
        CashbackHackService service = new CashbackHackService();

        int expected = 445;
        int actual = service.remain(555);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCashback1With1999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(expected, actual);
    }
}