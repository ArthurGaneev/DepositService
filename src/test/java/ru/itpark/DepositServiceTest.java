package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void depositCalculator() {
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(0,63,10);

            assertEquals(0,depositCalculator);
        }
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,63,10);

            assertEquals(101_726,depositCalculator);
        }
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,63,0);

            assertEquals(100_000,depositCalculator);
        }
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,0,10);

            assertEquals(100_000,depositCalculator);
        }
        {
            DepositService service = new DepositService();
            int depositCalculator = service.depositCalculator(100_000,20,10);

            assertEquals(100_547,depositCalculator);
        }

    }
}