package ZooPark;

public abstract class Person implements Walker,Observer,Speaker{


   private String name;
   private int weight;
   private boolean isMale;
   private boolean isPredator;
   private String isWalker;
   private String isSpeaker;
   private String Observer;

   public String getName() {
      return name;
   }

   public int getWeight() {
      return weight;
   }

   public boolean getIsMale() {
      return isMale;
   }

   public boolean getIsPredator() {
      return isPredator;
   }

   public String getIsWalker() {
      return isWalker;
   }

   public String getIsSpeaker() {
      return isSpeaker;
   }

   public String getObserver() {
      return Observer;
   }

   public Person (String name, int weight, boolean isMale,boolean isPredator,String isWalker, String isSpeaker, String isObserver) {
      this.name = name;
      this.weight = weight;
      this.isMale = isMale;
      this.isPredator = isPredator;
      this.isWalker = isWalker;
      this.isWalker = isSpeaker;
      this.isWalker = isObserver;
   }

}
