package burcbulanprogram;
import java.util.*;
public class BurcBulanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz:");
        int ay = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz:");
        int gun = input.nextInt();
        
        if((ay==1&&gun<=20)||(ay==12&&gun>=21)){
            System.out.println("Burcunuz Oğlak.");
        }
        else if((ay==1&&gun>=21)||(ay==2&&gun<=19)){
            System.out.println("Burcunuz Kova");
        }
        else if((ay==2&&gun>=20)||(ay==3&&gun<=20)){
            System.out.println("Burcunuz Balık");
        }
        else if((ay==3&&gun>=21)||(ay==4&&gun<=20)){
            System.out.println("Burcunuz Koç");
        }
        else if((ay==4&&gun>=21)||(ay==5&&gun<=20)){
            System.out.println("Burcunuz Boğa");
        }
        else if((ay==5&&gun>=21)||(ay==6&&gun<=21)){
            System.out.println("Burcunuz İkizler");
        }
        else if((ay==6&&gun>=22)||(ay==7&&gun<=22)){
            System.out.println("Burcunuz Yengeç");
        }
        else if((ay==7&&gun>=23)||(ay==8&&gun<=23)){
            System.out.println("Burcunuz Aslan");
        }
        else if((ay==8&&gun>=24) || (ay==9&&gun<=23)){
            System.out.println("Burcunuz Başak");
        }
        else if((ay==9&&gun>=24)||(ay==10&&gun<=23)){
            System.out.println("Burcunuz Terazi");
        }
        else if((ay==10&&gun>=24)|| (ay==11&&gun<=22)){
            System.out.println("Burcunuz Akrep");
        }
        else if((ay==11&&gun>=23)||(ay==12&&gun<=21)){
            System.out.println("Burcunuz Yay");
        }
            
                
        
    }
    
}
