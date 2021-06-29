package com.epam;

//QualityGateIssuesAndFailed test
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        var c = a + b;
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}