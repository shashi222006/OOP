package basic_j;

public class TwoD_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m= {{1,1},{2,2},{3,3}};
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
