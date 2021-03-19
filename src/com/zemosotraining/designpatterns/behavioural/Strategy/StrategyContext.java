package com.zemosotraining.designpatterns.behavioural.Strategy;

import java.util.logging.Logger;

//Context acts as single point of contact for the Client to get relevant Strategy
public class StrategyContext {

    double ticketPrice;
    private DiscountStrategy strategy;
    Logger logger = Logger.getLogger(StrategyContext.class.getName());

    public StrategyContext(double price) {
        this.ticketPrice = price;
    }

    public DiscountStrategy getStrategy(int monthNo) {
        if (monthNo < 6) {
            strategy = new NoDiscountStrategy();
        } else {
            strategy = new QuarterDiscountStrategy();
        }
        logger.info("Strategy applied: " + strategy);
        return strategy;
    }

    public void applyDiscount(DiscountStrategy strategy) {
        logger.info("Ticket Price before offer : " + ticketPrice);
        double finalPrice = ticketPrice - (ticketPrice * strategy.getDiscountPercentage());
        logger.info("Ticket Price after offer : " + finalPrice);
    }
}
