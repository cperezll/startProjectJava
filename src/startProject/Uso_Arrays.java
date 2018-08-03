package startProject;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matriz de dos dimensiones
		/*int [][] matrix = new int[4][5];
		
		matrix[0][0]= 10;
		matrix[0][1]=48;
		matrix[0][2]=1;
		matrix[0][3]=54;
		matrix[0][4]=4;
		
		matrix[1][0]=714;
		matrix[1][1]=1;
		matrix[1][2]=24;
		matrix[1][3]=5;
		matrix[1][4]=7;
		
		matrix[2][0]=45;
		matrix[2][1]=51;
		matrix[2][2]=5;
		matrix[2][3]=1;
		matrix[2][4]=12;
		
		matrix[3][0]=1;
		matrix[3][1]=6;
		matrix[3][2]=54;
		matrix[3][3]=6;
		matrix[3][4]=14;
		
		*/

		int [][] matrix = {
				{1,45,78,456,1},
				{4,8,7,65,47},
				{7,89,45,1,3},
				{7,32,14,5,7}
		};
			/*	
		for(int i=0;i<4;i++){
			if (i==0){
				System.out.print("");			
			}else{
				System.out.println();
			}
			for(int j=0;j<5;j++){
				if(j==4){
					System.out.print(matrix[i][j]);
				}else{
					System.out.print(matrix[i][j] +"-");
				}
			}
		}*/
		
		for(int[]fila:matrix){
			
			System.out.println();
			
			for(int z: fila){
				System.out.print(z +" ");
			}
		}
	}	
}
