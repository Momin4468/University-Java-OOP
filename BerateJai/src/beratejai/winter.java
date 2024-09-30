
package beratejai;


public class winter extends packages {
        protected String season;
        
        public void input_season(){
            System.out.println("Enter package season(New Year/Xmas): ");
            season = inp.nextLine();
        }
        public void set_season(String m){
            season = m;
        }
        public String get_season(){
            return season;
        }
        
        /*public void printNewYear(){
            System.out.println("Here is all package info about New Year winter packages");
            for(int i =0;i<available_packs;i++){
                if(season.equalsIgnoreCase("New Year")) {
                    System.out.println("Package id is: "+pack_id);
                    System.out.println("Package name is: "+pack_name);
                    System.out.println("Package price is: "+pack_price);
                }
            } 
        }
        please see main class to know why it is being hidden*/
}