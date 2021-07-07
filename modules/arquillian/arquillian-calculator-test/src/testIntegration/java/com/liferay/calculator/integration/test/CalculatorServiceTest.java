package com.liferay.calculator.integration.test;

import com.demokit.arquillian.calculator.service.CalculatorLocalService;
import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)
public class CalculatorServiceTest
{
    @Inject
    private CalculatorLocalService _calculatorService;

    @ClassRule
    @Rule
    public static final LiferayIntegrationTestRule liferayIntegrationTestRule = new LiferayIntegrationTestRule();

    @Before
    public void setup() {
        // do you test setup in here. eg. _httpServletRequest = MockHttpServletRequest();
    }

    @Test
    public void testAddWithPositiveNumbers() {
        long num1 = 10;
        long num2 = 5;
        long expected = 15;

        long actual = _calculatorService.add(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        long num1 = -10;
        long num2 = -5;
        long expected = -15;

        long actual = _calculatorService.add(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithPositiveAndNegativeNumbers() {
        long num1 = -10;
        long num2 = 5;
        long expected = 5;

        long actual = _calculatorService.add(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithSingleZero() {
        long num1 = 0;
        long num2 = 5;
        long expected = 5;

        long actual = _calculatorService.add(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithAllZeros() {
        long num1 = 0;
        long num2 = 0;
        long expected = 0;

        long actual = _calculatorService.add(num1, num2);

        assertEquals(expected, actual);
    }
}
