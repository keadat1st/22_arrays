public class ArrayEksempel{

   public static void main(String[] args){
      
      //arrays int[], char[], boolean[], String[] - zero based
      int[] mineHeltal = new int[5];
      char[] mineTegn = new char[10];
      boolean[] mineSandheder = new boolean[2];
      String[] students = new String[10];
      double[] primtal = new double[10];
      
      primtal[0] = 1.1;
      primtal[1] = 2.1;
      primtal[3] = 4.5;
      primtal[4] = 5.0;
      System.out.println(primtal[2]);
      System.out.println(primtal[4]);
      System.out.println(primtal.length);
      
      //gennemsnit af ti tal i array
      //intitialiser array
      double[] tal = {1.0, 2.0, 3.0, 4.0, 5.0};
      double gennemsnit = (tal[0] + tal[1] + tal[2] + tal[3] + tal[4])/5;
      System.out.println("gennemsnittet er: " + gennemsnit);
      
      //refactor med for loop
      double[] tal2 = new double[5];
      for (int i=0;i<5;i++){
         tal2[i] = (double) i + 1;
      }
      
      double sum = 0.0;
      //sum = tal2[0] + tal2[1] + tal2[2] + tal2[3] + tal2[4]
      for (int i=0;i<5;i++){
         sum = sum + tal2[i];
      }
      
      System.out.println("Summen er: " + sum);
      System.out.println("Gennemsnittet er: " + sum/5);
      
      for (int i=0;i<5;i++){
         System.out.println("tal[" + i + "] er: " + tal2[i]);
      }
      
      
      //array med antal elementer fra input og array.length
      

      
      //udskriv elementer i array vha. for loop
      //refactor med for each
      
      //læg en til alle elementer i array
      //refactor med metode, der tager array som parameter og returnerer array
      
      //byt om på værdier i to arrays - (t = x, x = y, y = t)
      
   }


}