//package Stream;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import java.util.List;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class Testing {
//
//    @DisplayName("Lottery number test")
//    @Test
//    void lotteryNumberTest(){
//        // given
//        final LotteryGenerator lotteryGenerator = new LotteryGenerator();
//        final int price = 1000;
//
//        // when
//        final List<Integer> lotteryNumber = lotteryGenerator.generate(price);
//
//        // then
//        assertThat(lotteryNumber.size()).isEqualTo(6);
//    }
//
//    @DisplayName("Lottery number range test")
//    @Test
//    void lotteryNumberRangeTest(){
//        // given
//        final LotteryGenerator lotteryGenerator = new LotteryGenerator();
//        final int price = 1000;
//
//        // when
//        final List<Integer> lottery = lotteryGenerator.generate(price);
//
//        // then
//        assertThat(lottery.stream().allMatch(v -> v>=1 && v <= 45)).isTrue();
//    }
//
//    @DisplayName("Incorrect Price test")
//    @Test
//    void lotteryNumberInvalidMoneyTest(){
//        // given
//        final LotteryGenerator lotteryGenerator = new LotteryGenerator();
//        final int price = 3000;
//
//        // when
//        final RuntimeException exception = assertThrows(RuntimeException.class, () -> lotteryGenerator.generate(price));
//
//        // then
//        assertThat(exception.getMessage()).isEqualTo("Incorrect numbers");
//    }
//
//    @Test
//    void lotteryNumber(){
//        final LotteryGenerator lotteryGenerator = new LotteryGenerator();
//        final int price = 1000;
//
//        final List<Integer> lottery = lotteryGenerator.generate(price);
//        lottery.forEach(System.out::println);
//
//    }
//}
