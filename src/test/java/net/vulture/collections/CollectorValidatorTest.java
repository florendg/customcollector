package net.vulture.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectorValidatorTest {

   @Test
   void processNominalInputTest() {
      List<String> input = List.of("Floren","Cornelis");
      String result = input.stream()
      .collect(new StringCollector());
      assertEquals("[Floren,Cornelis]", result);
   }

   @Test
   void processEmptyListTest() {
      List<String> input = List.of();
      String result = input.stream()
            .collect(new StringCollector());
      assertEquals("[]",result);
   }

}
