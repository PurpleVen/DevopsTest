public class parameterized {
   String val;
   parameterized(String val){
      this.val = val;
   }
   public static void main(String args[]){  
      parameterized obj = new parameterized("test");
      System.out.println(obj.val);
   }
}
