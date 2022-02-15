package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {
    CashbackService service = new CashbackService();

    @Test
    public void shouldRemainIfMoreThan1000 () {
        int bonus = service.remain(1500);
        assertEquals(bonus,500);
    }

    @Test
    public void shouldRemainIfLessThan1000 () {
        int bonus = service.remain(900);
        assertEquals(bonus,100);
    }

    @Test
    public void shouldRemainIf1000 () {
        int bonus = service.remain(1000);
        assertEquals(bonus,0);
    }

}