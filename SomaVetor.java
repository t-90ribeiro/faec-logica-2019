public class SomaVetor {
    
		public static void main(String[] args) {
		
		       int[] vet1 = { 10, 20, 30, 40, 50};
			   int[] vet2 = new int[5];
			   vet2[0] = 5;
			   vet2[1] = 10;
			   vet2[2] = 15;
			   vet2[3] = 20;
			   vet2[4] = 25;
			   int[] vet3 = new int[5];
			   for (int pos = 0; pos < 5; pos ++){
			           vet3[pos] = vet1[pos] + vet2[pos];
					   System.out.print(vet3[pos] + " ");
			   }  
		}
			  
}