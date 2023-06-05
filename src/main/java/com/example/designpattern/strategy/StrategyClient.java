package com.example.designpattern.strategy;

public class StrategyClient {
/*    public static void main(String[] args) {
        Solider rambo = new Solider();
        Strategy strategy = null;
        // 총을 람보에게 전달해 전투 수행
//        strategy = StrategyGun::new;
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategySword();
//        strategy = StrategySword::new;
        rambo.runContext(strategy);

        System.out.println();
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }*/

    public static void main(String[] args) {
        Solider rambo = new Solider();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총총");
            }
        });

    }
}
