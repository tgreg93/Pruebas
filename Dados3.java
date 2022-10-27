import java.util.ArrayList;

public class Dados3 {

	public static void main(String[] args) {
		
		ArrayList <Integer> Caras1 = new ArrayList<>();
		ArrayList <Integer> Caras2 = new ArrayList<>();
		ArrayList <ArrayList <Integer>> Tiradas = new ArrayList<>();
		int CantidadDeTiros=10, CantidadDeDados=2;
		int TotalD1=0, TotalD2=0;
		
		for (int i=0;i<6;i++){
		Caras1.add(0);
		Caras2.add(0);
		}
		
		for (int i=0;i<CantidadDeTiros;i++){

			ArrayList <Integer> TiradasB = new ArrayList<>();
			
			for (int j=0;j<CantidadDeDados;j++){
				int Tiro = (int) Math.round(Math.random()*5+1);
				TiradasB.add(Tiro);
			}
			Tiradas.add(TiradasB);
		}
		
		for (int i=0;i<CantidadDeDados;i++){
			System.out.printf("\tDado %d", i+1);
		}
		System.out.println();
				
		for (int i = 0; i < Tiradas.size(); i++){
			System.out.printf("Tiro %d: ",i+1);
			for (int j = 0; j < Tiradas.get(0).size(); j++)
			{
			System.out.printf("%d\t",Tiradas.get(i).get(j));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < Tiradas.size(); i++){
			
			switch (Tiradas.get(i).get(0)) { 
		    case 1: Caras1.set(0,Caras1.get(0)+1); break;
		    case 2: Caras1.set(1,Caras1.get(1)+1); break;
		    case 3: Caras1.set(2,Caras1.get(2)+1); break;
		    case 4: Caras1.set(3,Caras1.get(3)+1); break;
		    case 5: Caras1.set(4,Caras1.get(4)+1); break;
		    case 6: Caras1.set(5,Caras1.get(5)+1); break;
		    }
			
			switch (Tiradas.get(i).get(1)) { 
		    case 1: Caras2.set(0,Caras2.get(0)+1); break;
		    case 2: Caras2.set(1,Caras2.get(1)+1); break;
		    case 3: Caras2.set(2,Caras2.get(2)+1); break;
		    case 4: Caras2.set(3,Caras2.get(3)+1); break;
		    case 5: Caras2.set(4,Caras2.get(4)+1); break;
		    case 6: Caras2.set(5,Caras2.get(5)+1); break;
		    }
		}
		
		for (int i=0;i<CantidadDeDados;i++){
			System.out.printf("\tDado %d", i+1);
		}
		System.out.println();
		for (int i = 0; i < 6; i++){
			TotalD1+=Caras1.get(i);
			TotalD2+=Caras2.get(i);
			System.out.printf("Cara %d: %d\t",i+1,Caras1.get(i));
			System.out.printf("%d\n",Caras2.get(i));
			
		}
		
		System.out.printf("Suma:\t%d\t%d",TotalD1,TotalD2);
		
	}
}