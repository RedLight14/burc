import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int gün;
        String ay;

        System.out.print("Dogdugunuz ay : ");
        ay=inp.next();

        System.out.print("Dogdugunuz gun : ");
        gün=inp.nextInt();

        if((ay.equals("mart")&&(gün>=20&&gün<=31))||(ay.equals("nisan")&&(gün>=1&&gün<=20)))
        {
            System.out.print("Koc burcusunuz... ");
        }
        if((ay.equals("nisan")&&(gün>=21&&gün<=30))||(ay.equals("mayıs")&&(gün>=1&&gün<=21)))
        {
            System.out.print("Boga burcusunuz... ");
        }
        if((ay.equals("mayıs")&&(gün>=22&&gün<=31))||(ay.equals("haziran")&&(gün>=1&&gün<=22)))
        {
            System.out.print("İkizler burcusunuz... ");
        }
        if((ay.equals("haziran")&&(gün>=23&&gün<=30))||(ay.equals("temmuz")&&(gün>=1&&gün<=22)))
        {
            System.out.print("Yengec burcusunuz... ");
        }
        if((ay.equals("temmuz")&&(gün>=23&&gün<=31))||(ay.equals("ağustos")&&(gün>=1&&gün<=22)))
        {
            System.out.print("Aslan burcusunuz... ");
        }
        if((ay.equals("ağustos")&&(gün>=23&&gün<=31))||(ay.equals("eylül")&&(gün>=1&&gün<=22)))
        {
            System.out.print("Basak burcusunuz... ");
        }
        if((ay.equals("eylül")&&(gün>=23&&gün<=31))||(ay.equals("ekim")&&(gün>=1&&gün<=22)))
        {
            System.out.print("Terazi burcusunuz... ");
        }
        if((ay.equals("ekim")&&(gün>=23&&gün<=31))||(ay.equals("kasım")&&(gün>=1&&gün<=21)))
        {
            System.out.print("Akrep burcusunuz... ");
        }
        if((ay.equals("kasım")&&(gün>=22&&gün<=31))||(ay.equals("aralık")&&(gün>=1&&gün<=21)))
        {
            System.out.print("Yay burcusunuz... ");
        }
        if((ay.equals("aralık")&&(gün>=22&&gün<=31))||(ay.equals("ocak")&&(gün>=1&&gün<=21)))
        {
            System.out.print("Oglak burcusunuz... ");
        }
        if((ay.equals("ocak")&&(gün>=22&&gün<=31))||(ay.equals("şubat")&&(gün>=1&&gün<=19)))
        {
            System.out.print("Kova burcusunuz... ");
        }
        if((ay.equals("şubat")&&(gün>=20&&gün<=31))||(ay.equals("mart")&&(gün>=1&&gün<=20)))
        {
            System.out.print("Balık burcusunuz... ");
        }
    }
    }
