
package beratejai;

public class Summer extends packages {
        protected String month;
        
        public void input_month(){
            System.out.println("Enter package month(January/June): ");
            month = inp.nextLine();
        }
        public void set_month(String m){
            month = m;
        }
        public String get_month(){
            return month;
        }
        
        /*public void printJanuary(){
            System.out.println("Here is all package info about January summer packages");
            for(int i =0;i<available_packs;i++){
                if(month.equalsIgnoreCase("January")) {
                    System.out.println("Package id is: "+pack_id);
                    System.out.println("Package name is: "+pack_name);
                    System.out.println("Package price is: "+pack_price);
                }
            } 
        }
        please see main class to know why it is being hidden*/
}
