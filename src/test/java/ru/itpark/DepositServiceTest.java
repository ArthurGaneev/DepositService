package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {
    @Test
    @DisplayName("Deposit Amount 100_000, deposit data days 63, interest rate 10")
    void depositCalculatorCaseFirst() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,63,10);

            assertEquals(101_726,depositCalculator);
        }
    }
    @Test
    @DisplayName("Deposit Amount 100_000, deposit data days 63, interest rate 0")
    void depositCalculatorCaseSecond() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,63,0);

            assertEquals(100_000,depositCalculator);
        }
    }
    @Test
    @DisplayName("Deposit Amount 100_000, deposit data days 0, interest rate 10")
    void depositCalculatorCaseThird() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,0,10);

            assertEquals(100_000,depositCalculator);
        }
    }
    @Test
    @DisplayName("Deposit Amount 100_000, deposit data days 0, interest rate 10")
    void depositCalculatorCasefourth() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,20,10);

            assertEquals(100_547,depositCalculator);
        }
    }
    @Test
    @DisplayName("Deposit Amount 0")
    void depositCalculator() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(0,63,10);

            assertEquals(0,depositCalculator);
        }
    }
}