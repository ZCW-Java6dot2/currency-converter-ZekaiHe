package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double newRate = currencyType.getRate(); //get rate of the argument currency by calling the method from Enum class
        Double myRate = CurrencyType.getTypeOfCurrency(this).getRate(); //get rate of the currency implementing this method by calling the method from Enum class
        return newRate/myRate;
    }
}
