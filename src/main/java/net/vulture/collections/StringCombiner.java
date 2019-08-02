package net.vulture.collections;

public class StringCombiner {

   private StringBuilder builder = new StringBuilder();

   private final String prefix;
   private final String suffix;
   private final String delim;

   public StringCombiner(String delim, String prefix, String suffix) {
      this.delim = delim;
      this.prefix = prefix;
      this.suffix = suffix;
   }

   public StringCombiner add(String element) {
      if (!isAtStart()) {
         builder.append(delim);
      }
      builder.append(element);
      return this;
   }

   public StringCombiner merge(StringCombiner other) {
      if (!other.equals(this)) {
         if (!other.isAtStart() && (!this.isAtStart())) {
            other.builder.insert(0, this.delim);
         }
         builder.append(other.builder);
      }
      return this;
   }

   @Override
   public String toString() {
      return prefix + builder.toString() + suffix;
   }

   private boolean isAtStart() {
      return builder.length() == 0;
   }


}
