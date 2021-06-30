package com.epam;

//QualityGateIssuesWeightsMap test
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        int first = a;
        int second = b;
        return first + second;
    }

    @Override
    public int multiply(int a, int b) {
        boolean isNegative;
        if (b > 0) {
            isNegative = true;
        }
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {

        if (b == 0) {
            return 0;
        }
        int result = a / b;

        return result;
    }
}