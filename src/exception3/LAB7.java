package exception3;


public class LAB7 {
    public static void main(String[] args) {
        System.out.println("Main method call method dothis()");
        try {
            dothis();
        } catch (Exception e){
            System.out.println("Main method recieve exception" + e.getMessage());
        }
    }
    private static void dothis() throws Exception {
        System.out.println("Method doThis() xall method doThat()");
        doThat();
    }
  
    public static void doThat()throws Exception {
        throw new MyException ("Hello MyException");
    }
    
}
