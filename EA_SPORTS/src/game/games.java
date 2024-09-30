
package game;

public class games {
        
    int game_id;
    String game_name;
    String platform_name;
    String company_name;
    
    public games(int gi,String gn, String pn,String cn){
        game_id = gi;
        game_name = gn;
        platform_name = pn;
        company_name = cn;
    }
    
    public int m_type(int gi){
        if(gi<=100 && gi>=0) {
            System.out.println("Mobile Game");
            return 1;
        }
        
        else if(gi<=200 && gi>=101) {
            System.out.println("PC Game");
            return 2;
        }
        
        else if(gi>200) {
            System.out.println("Web Based Game");
            return 3;
        }
       return 0;
    }
    
      public int price(String pn,int gnum){
        if(pn.equalsIgnoreCase("Mobile")) {
            return 50*gnum;
        }
        
        if(pn.equalsIgnoreCase("PC")) {
            return 100*gnum;
        }
       
        if(pn.equalsIgnoreCase("Web")) {
            return 200*gnum;
        }
       return 0;
    }
    
        
    
}
