package ru.itpark;

public class DepositService {
    public int depositCalculator(int depositAmount, int depositDataDays, int interestRate) {
        int allDaysYear = 365;

        int depositWithInterest = depositAmount + interestRate * depositDataDays * depositAmount / 100 / allDaysYear;

        return depositWithInterest;
    }

}
