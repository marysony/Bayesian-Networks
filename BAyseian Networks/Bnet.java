import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class Bnet
{
    public static double fun(ArrayList<String> qv,double pbt,double pbf,double pct,double pcf,double pgtbt,double pgtbf,double pgfbt,double pgfbf,double pftgtct,double pftgtcf,double pftgfcf,double pftgfct,double pffgtct,double pffgtcf,double pffgfcf,double pffgfct)
    {
double fc=0;      
if((qv.contains("Ft") ))
{
    if(qv.contains("Ct") )
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pct*pgtbt*pftgtct;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pct*pgtbf*pftgtct;
            }
            else
            {
                fc=(pbt*pct*pgtbt*pftgtct)+(pbf*pct*pgtbf*pftgtct);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pct*pgfbt*pftgfct;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pct*pgfbf*pftgfct;
            }
            else
            {
                fc=(pbt*pct*pgfbt*pftgfct)+(pbf*pct*pgfbf*pftgfct);
            }

        }
        else
            {
                if(qv.contains("Bt"))
                {
                fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pct*pgtbt*pftgtct);
                }
                else if(qv.contains("Bf"))
                {
                fc=(pbf*pct*pgfbf*pftgfct)+(pbf*pct*pgtbf*pftgtct);
                }
                else{
                    fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pct*pgtbt*pftgtct)+(pbf*pct*pgfbf*pftgfct)+(pbf*pct*pgtbf*pftgtct);
                }
                
            }
        

    }
    else if(qv.contains("Cf"))
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pcf*pgtbt*pftgtcf;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pcf*pgtbf*pftgtcf;
            }
            else
            {
                fc=(pbt*pcf*pgtbt*pftgtcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pcf*pgfbt*pftgfcf;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pcf*pgfbf*pftgfcf;
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pftgfcf)+(pbf*pcf*pgfbf*pftgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pcf*pgfbt*pftgfcf)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pcf*pgfbf*pftgfcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pftgfcf)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
        }

    }
    else
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else
            {
                fc=(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);

            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf);
            }
            else
            {
                fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else{
                fc=(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            
        }
    }
}

else if((qv.contains("Ff") ))
{
    if(qv.contains("Ct") )
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pct*pgtbt*pffgtct;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pct*pgtbf*pffgtct;
            }
            else
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbf*pct*pgtbf*pffgtct);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pct*pgfbt*pffgfct;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pct*pgfbf*pffgfct;
            }
            else
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbf*pct*pgfbf*pffgfct);
            }
        }
        else
            {
                if(qv.contains("Bt"))
                {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgtbt*pffgtct);
                }
                else if(qv.contains("Bf"))
                {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgtbf*pffgtct);
                }
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgtbt*pffgtct)+(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgtbf*pffgtct);
            }
       

    }
    else if(qv.contains("Cf"))
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pcf*pgtbt*pffgtcf;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pcf*pgtbf*pffgtcf;
            }
            else
            {
                fc=(pbt*pcf*pgtbt*pffgtcf)+(pbf*pcf*pgtbf*pffgtcf);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=pbt*pcf*pgfbt*pffgfcf;
            }
            else if(qv.contains("Bf"))
            {
                fc=pbf*pcf*pgfbf*pffgfcf;
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbf*pcf*pgfbf*pffgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbt*pcf*pgtbt*pffgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pcf*pgfbf*pffgfcf)+(pbf*pcf*pgtbf*pffgtcf);
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbt*pcf*pgtbt*pffgtcf)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pcf*pgtbf*pffgtcf);
            }
        }

    }
    else
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf);
            }
            else
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf);

            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf);
            }
            else
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf);
            }
            else{
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf);
            }
            
        }
    }
}
else 
{
    if(qv.contains("Ct") )
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pct*pgtbt*pftgtct);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgtbf*pffgtct)+(pbf*pct*pgtbf*pftgtct);
            }
            else
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pct*pgtbt*pftgtct)+(pbf*pct*pgtbf*pffgtct)+(pbf*pct*pgtbf*pftgtct);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgfbt*pftgfct);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgfbf*pftgfct);
            }
            else
            {
                
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgfbt*pftgfct)+(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgfbf*pftgfct);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgfbt*pftgfct)+(pbt*pct*pgtbt*pffgtct)+(pbt*pct*pgtbt*pftgtct);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgfbf*pftgfct)+(pbf*pct*pgtbf*pffgtct)+(pbf*pct*pgtbf*pftgtct);
            }
            else
            {
                
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgfbt*pftgfct)+(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgfbf*pftgfct)+(pbt*pct*pgtbt*pffgtct)+(pbt*pct*pgtbt*pftgtct)+(pbf*pct*pgtbf*pffgtct)+(pbf*pct*pgtbf*pftgtct);
            }

           // fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pct*pgtbt*pftgtct)+(pbf*pct*pgtbf*pffgtct)+(pbf*pct*pgtbf*pftgtct)+(pbt*pct*pgfbt*pffgfct)+(pbt*pct*pgfbt*pftgfct)+(pbf*pct*pgfbf*pffgfct)+(pbf*pct*pgfbf*pftgfct);
        }

    }
    else if(qv.contains("Cf"))
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pcf*pgtbt*pffgtcf)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pcf*pgtbf*pffgtcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else
            {
                fc=(pbt*pcf*pgtbt*pffgtcf)+(pbf*pcf*pgtbf*pffgtcf)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbt*pcf*pgfbt*pftgfcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pcf*pgfbf*pffgfcf)+(pbf*pcf*pgfbf*pftgfcf);
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbf*pcf*pgfbf*pffgfcf)+(pbt*pcf*pgfbt*pftgfcf)+(pbf*pcf*pgfbf*pftgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pcf*pgfbf*pffgfcf)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else
            {
                fc=(pbt*pcf*pgfbt*pffgfcf)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pcf*pgtbf*pftgtcf);
            }
        }

    }
    else
    {
        if(qv.contains("Gt"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else
            {
                fc=(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);

            }
            
        }
        else if(qv.contains("Gf"))
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf);
            }
            else
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf);
            }
        }
        else
        {
            if(qv.contains("Bt"))
            {
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf);
            }
            else if(qv.contains("Bf"))
            {
                fc=(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            else{
                fc=(pbt*pct*pgfbt*pffgfct)+(pbt*pcf*pgfbt*pffgfcf)+(pbt*pct*pgtbt*pffgtct)+(pbt*pcf*pgtbt*pffgtcf)+(pbt*pct*pgfbt*pftgfct)+(pbt*pcf*pgfbt*pftgfcf)+(pbt*pct*pgtbt*pftgtct)+(pbt*pcf*pgtbt*pftgtcf)+(pbf*pct*pgfbf*pffgfct)+(pbf*pcf*pgfbf*pffgfcf)+(pbf*pct*pgtbf*pffgtct)+(pbf*pcf*pgtbf*pffgtcf)+(pbf*pct*pgfbf*pftgfct)+(pbf*pcf*pgfbf*pftgfcf)+(pbf*pct*pgtbf*pftgtct)+(pbf*pcf*pgtbf*pftgtcf);
            }
            
        }
    }
    
}
return fc;
    }
    public static void main(String[] args)
    {
        
        double bt=0,bf=0,ct=0,cf=0,gtbt=0,gtbf=0,gfbt=0,gfbf=0,gtct=0,gtcf=0,gfct=0,gfcf=0,ftgtct=0,ftgtcf=0,ftgfcf=0,ftgfct=0,ffgtct=0,ffgtcf=0,ffgfcf=0,ffgfct=0;
        BufferedReader reader;
        String[][] a = new String[365][4];
        int i=0;
		try {
			reader = new BufferedReader(new FileReader("training_data.txt"));
			String l = reader.readLine();
            
			while (l != null) {
                
                String[] letter = l.trim().split("\\s+");
                //System.out.println(letter[0]);
                if(letter[0].equals("1"))
                {
                    bt++;
                    if(letter[1].equals("1"))
                    {
                        gtbt++;
                    }
                    if(letter[1].equals("0"))
                    {
                        gfbt++;
                    }
                }
                else
                {
                    bf++;
                    if(letter[1].equals("1"))
                    {
                        gtbf++;
                    }
                    if(letter[1].equals("0"))
                    {
                        gfbf++;
                    }
                }
                if(letter[2].equals("1"))
                {
                    ct++;
                    if(letter[1].equals("1"))
                    {
                        gtct++;
                        if(letter[3].equals("1"))
                            {
                            ftgtct++;
                            }
                        if(letter[3].equals("0"))
                            {
                            ffgtct++;
                            }
                    }
                    if(letter[1].equals("0"))
                    {
                        gfct++;
                        if(letter[3].equals("1"))
                            {
                            ftgfct++;
                            }
                        if(letter[3].equals("0"))
                            {
                            ffgfct++;
                            }
                    }
                }
                else
                {
                    cf++;
                    if(letter[1].equals("1"))
                    {
                        gtcf++;
                        if(letter[3].equals("1"))
                            {
                            ftgtcf++;
                            }
                        if(letter[3].equals("0"))
                            {
                            ffgtcf++;
                            }
                    }
                    if(letter[1].equals("0"))
                    {
                        gfcf++;
                        if(letter[3].equals("1"))
                            {
                            ftgfcf++;
                            }
                        if(letter[3].equals("0"))
                            {
                            ffgfcf++;
                            }
                    }
                }
                


              
               // System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]);
                i++;
				l = reader.readLine();

			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
       
        double pbt=0,pbf=0,pct=0,pcf=0,pgtbt=0,pgtbf=0,pgfbt=0,pgfbf=0,pftgtct=0,pftgtcf=0,pftgfcf=0,pftgfct=0,pffgtct=0,pffgtcf=0,pffgfcf=0,pffgfct=0;
        pbt=bt/365.0;
        pbf=1-pbt;
        pct=ct/365.0;
        pcf=1-pct;
        pgtbt=gtbt/bt;
        pgfbt=gfbt/bt;
        pgtbf=gtbf/bf;
        pgfbf=gfbf/bf;
        pftgtct=ftgtct/gtct;
        pftgtcf=ftgtcf/gtcf;
        pftgfcf=ftgfcf/gfcf;
        pftgfct=ftgfct/gfct;
        pffgtct=ffgtct/gtct;
        pffgtcf=ffgtcf/gtcf;
        pffgfcf=ffgfcf/gfcf;
        pffgfct=ffgfct/gfct;
        System.out.println("probability of B true- "+pbt);
        System.out.println("probability of B false- "+pbf);
        System.out.println("probability of C true- "+pct);
        System.out.println("probability of C false- "+pcf);
        System.out.println("probability of G true given B true- "+pgtbt);
        System.out.println("probability of G true given B false- "+pgtbf);
         System.out.println("probability of G false given B true- "+pgfbt);
        System.out.println("probability of G false given B false- "+pgfbf);
        System.out.println("probability of F true given G true C true- "+pftgtct);
        System.out.println("probability of F true given G true C false- "+pftgtcf);
        System.out.println("probability of F true given G false C true- "+pftgfct);
        System.out.println("probability of F true given G false C false- "+pftgfcf);
        System.out.println("probability of F false given G true C true- "+pffgtct);
        System.out.println("probability of F false given G true C false- "+pffgtcf);
        System.out.println("probability of F false given G false C true- "+pffgfct);
        System.out.println("probability of F false given G false C false- "+pffgfcf);
        
        

       int k = 1;
        ArrayList<String> qv = new ArrayList<String>();
        ArrayList<String> ev = new ArrayList<String>();
        while (k < args.length && !args[k].equals("given")) {
            qv.add(args[k]);
            k++;
        }
        if (k < args.length && args[k].equals("given")) {
            
        k++;
        }
        while (k < args.length) {
            qv.add(args[k]);
            ev.add(args[k]);
            k++;    
        }
       double num=0,den=0;
       num=fun(qv,pbt,pbf,pct,pcf,pgtbt,pgtbf,pgfbt,pgfbf,pftgtct,pftgtcf,pftgfcf,pftgfct,pffgtct,pffgtcf,pffgfcf,pffgfct); 
       if(ev.size()!=0)
       {
        den=fun(ev,pbt,pbf,pct,pcf,pgtbt,pgtbf,pgfbt,pgfbf,pftgtct,pftgtcf,pftgfcf,pftgfct,pffgtct,pffgtcf,pffgfcf,pffgfct); 
       }
       if(args.length>1)
       {

        if(ev.size()==0)
        {
        System.out.println("Joint Probability Distribution= "+num);
        }
       else
        {
        System.out.println("Joint probability Distribution= "+num/den);
         }

       }
       



    }
}



