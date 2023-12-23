package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    @DisplayName("Test bonus service with expected result")
    void test_Bonus_Service_With_Expected_Result() {

        double sales = 200;
        service.getRes(sales);

        double expectedBonus = sales * 10 / 100;
        assertEquals(expectedBonus, service.calcBonus(sales));
    }

    @Test
    @DisplayName("Test bonus service with unexpected result")
    void test_Bonus_Service_With_Unexpected_Result() {

        double sales = -200;
        assertNotEquals(sales, service.getRes(sales));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}